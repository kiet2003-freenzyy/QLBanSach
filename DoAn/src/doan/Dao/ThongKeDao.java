package doan.Dao;

import doan.Model.ChiTietThongKe;
import doan.Model.ThongKe;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ThongKeDao extends KetNoiSQL {

    public ArrayList<ThongKe> thongKeDoanhThuTheoQuy() {
        ArrayList<ThongKe> danhSachThongKe = new ArrayList<>();

        try {

            String sql = "SELECT " +
                         "CASE " +
                         "    WHEN DATEPART(MONTH, hd.Ngay) IN (1, 2, 3) THEN 1 " +
                         "    WHEN DATEPART(MONTH, hd.Ngay) IN (4, 5, 6) THEN 2 " +
                         "    WHEN DATEPART(MONTH, hd.Ngay) IN (7, 8, 9) THEN 3 " +
                         "    WHEN DATEPART(MONTH, hd.Ngay) IN (10, 11, 12) THEN 4 " +
                         "END AS Quy, " +
                         "SUM(ct.ThanhTien) as DoanhThu " +
                         "FROM HoaDon hd " +
                         "JOIN ChiTietHoaDon ct ON hd.HD_ID = ct.IDHoaDon " +
                         "GROUP BY " +
                         "CASE " +
                         "    WHEN DATEPART(MONTH, hd.Ngay) IN (1, 2, 3) THEN 1 " +
                         "    WHEN DATEPART(MONTH, hd.Ngay) IN (4, 5, 6) THEN 2 " +
                         "    WHEN DATEPART(MONTH, hd.Ngay) IN (7, 8, 9) THEN 3 " +
                         "    WHEN DATEPART(MONTH, hd.Ngay) IN (10, 11, 12) THEN 4 " +
                         "END";
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();

            // Duyệt kết quả trả về từ truy vấn
            while (rs.next()) {
                int quy = rs.getInt("Quy");
                double doanhThu = rs.getDouble("DoanhThu");
                ThongKe thongKe = new ThongKe(quy, doanhThu);
                danhSachThongKe.add(thongKe);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return danhSachThongKe;
    }
    
    public ArrayList<ChiTietThongKe> layChiTietThongKeTheoQuy(int quy) {
        ArrayList<ChiTietThongKe> danhSachChiTiet = new ArrayList<>();

        try {
            String sql = "SELECT s.TieuDe AS TenSach, SUM(ct.SoLuong) AS SoLuong, SUM(ct.ThanhTien) AS ThanhTien " +
                         "FROM HoaDon hd " +
                         "JOIN ChiTietHoaDon ct ON hd.HD_ID = ct.IDHoaDon " +
                         "JOIN Sach s ON ct.IDSach = s.S_ID " +
                         "WHERE " +
                         "    CASE " +
                         "        WHEN MONTH(hd.Ngay) IN (1, 2, 3) THEN 1 " +
                         "        WHEN MONTH(hd.Ngay) IN (4, 5, 6) THEN 2 " +
                         "        WHEN MONTH(hd.Ngay) IN (7, 8, 9) THEN 3 " +
                         "        WHEN MONTH(hd.Ngay) IN (10, 11, 12) THEN 4 " +
                         "    END = ? " +
                         "GROUP BY s.TieuDe";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setInt(1, quy);
            ResultSet rs = pre.executeQuery();

            while (rs.next()) {
                String tenSach = rs.getString("TenSach");
                int soLuong = rs.getInt("SoLuong");
                double thanhTien = rs.getDouble("ThanhTien");
                ChiTietThongKe chiTiet = new ChiTietThongKe(tenSach, soLuong, thanhTien);
                danhSachChiTiet.add(chiTiet);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return danhSachChiTiet;
    }
    
    public boolean xuatThongKePDF(int quy, ArrayList<ChiTietThongKe> danhSachChiTiet, String filePath) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();

            // Đường dẫn tới font Unicode hỗ trợ tiếng Việt
            BaseFont baseFont = BaseFont.createFont("src/fonts/ARIALUNI.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font unicodeFont = new Font(baseFont, 12);
            Font unicodeFontBold = new Font(baseFont, 12, Font.BOLD);
            Font redFont = new Font(baseFont, 12, Font.BOLD, BaseColor.RED);
            Font blueFont = new Font(baseFont, 22, Font.BOLD, BaseColor.BLUE);

            // Tiêu đề
            Paragraph storeTitle = new Paragraph("NHÀ SÁCH SAO MAI", blueFont);
            storeTitle.setAlignment(Element.ALIGN_CENTER);
            document.add(storeTitle);
            document.add(Chunk.NEWLINE);

            // Hiển thị thông tin thống kê
            Paragraph title = new Paragraph("THỐNG KÊ DOANH THU QUÝ " + quy, new Font(baseFont, 16, Font.BOLD));
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);
            document.add(Chunk.NEWLINE);

            // Xuất danh sách chi tiết thống kê
            PdfPTable table = new PdfPTable(3); // Tạo bảng với 3 cột
            table.setWidthPercentage(100); // Chỉ định tỷ lệ chiều rộng của bảng
            table.setWidths(new float[]{3, 1, 2}); // Chỉ định tỷ lệ chiều rộng của từng cột

            table.addCell(new PdfPCell(new Phrase("Tên Sản Phẩm", unicodeFontBold)));
            table.addCell(new PdfPCell(new Phrase("Số Lượng", unicodeFontBold)));
            table.addCell(new PdfPCell(new Phrase("Thành Tiền", unicodeFontBold)));

            double tongDoanhThu = 0.0; // Tính tổng doanh thu
            for (ChiTietThongKe chiTiet : danhSachChiTiet) {
                table.addCell(new PdfPCell(new Phrase(chiTiet.getTenSach(), unicodeFont)));
                table.addCell(new PdfPCell(new Phrase(String.valueOf(chiTiet.getSoLuong()), unicodeFont)));
                table.addCell(new PdfPCell(new Phrase(String.valueOf(chiTiet.getThanhTien()), unicodeFont)));
                tongDoanhThu += chiTiet.getThanhTien(); // Cộng vào tổng doanh thu
            }

            // Thêm dòng tổng doanh thu vào bảng
            PdfPCell tongDoanhThuCell = new PdfPCell(new Phrase("Tổng Doanh Thu:", unicodeFontBold));
            tongDoanhThuCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            tongDoanhThuCell.setColspan(2); // Merge cột
            table.addCell(tongDoanhThuCell);
            table.addCell(new PdfPCell(new Phrase(String.valueOf(tongDoanhThu), unicodeFontBold)));

            document.add(table); // Thêm bảng vào tài liệu
            document.add(Chunk.NEWLINE); // Thêm một dòng trống để cách tổng tiền

            document.close();
            return true;
        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    
   
}
