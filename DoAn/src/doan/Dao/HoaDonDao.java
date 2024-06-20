package doan.Dao;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import doan.Model.ChiTietHoaDon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import doan.Model.HoaDon;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;





public class HoaDonDao extends KetNoiSQL {

    public ArrayList<HoaDon> hienThi() {
        ArrayList<HoaDon> danhSachHoaDon = new ArrayList<>();
        try {
            String sql = "SELECT * FROM HoaDon";
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setHd_id(rs.getInt("HD_ID"));
                hd.setTenKhachHang(rs.getString("TenKhachHang"));
                hd.setNhanVien(rs.getString("NhanVien"));
                hd.setGhiChu(rs.getString("GhiChu"));
                hd.setNgay(rs.getDate("Ngay"));
                hd.setTongTien(rs.getDouble("TongTien"));
                danhSachHoaDon.add(hd);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return danhSachHoaDon;
    }

    public boolean themHoaDon(HoaDon hoaDon) {
        try {
            String sqlGetMaxID = "SELECT MAX(HD_ID) FROM HoaDon";
            ResultSet rs = statement.executeQuery(sqlGetMaxID);
            int maxID = 0;
            if (rs.next()) {
                maxID = rs.getInt(1);
            }
            int newID = maxID + 1;

            String sql = "INSERT INTO HoaDon (HD_ID, Ngay, NhanVien, TenKhachHang, GhiChu, TongTien) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setInt(1, newID);
            pre.setDate(2, new java.sql.Date(hoaDon.getNgay().getTime()));
            pre.setString(3, hoaDon.getNhanVien());
            pre.setString(4, hoaDon.getTenKhachHang());
            pre.setString(5, hoaDon.getGhiChu());
            pre.setDouble(6, hoaDon.getTongTien());
            int rowsAffected = pre.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean xoaHoaDon(int hoaDonId) {
        try {
            String sql = "DELETE FROM HoaDon WHERE HD_ID = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, hoaDonId);
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean capNhatHoaDon(HoaDon hoaDon) {
        try {
            String sql = "UPDATE HoaDon SET Ngay = ?, TenKhachHang = ?, GhiChu = ? WHERE HD_ID = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setDate(1, new java.sql.Date(hoaDon.getNgay().getTime()));
            statement.setString(2, hoaDon.getTenKhachHang());
            statement.setString(3, hoaDon.getGhiChu());
            statement.setInt(4, hoaDon.getHd_id());

            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
        private ArrayList<ChiTietHoaDon> layChiTietHoaDonTheoHoaDonID(int hoaDonID) {
        ArrayList<ChiTietHoaDon> danhSachChiTiet = new ArrayList<>();
        try {
            String sql = "SELECT * FROM ChiTietHoaDon WHERE HD_ID = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setInt(1, hoaDonID);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                ChiTietHoaDon chiTiet = new ChiTietHoaDon();
                chiTiet.setCthd_id(rs.getInt("idHoaDon"));
                chiTiet.setTieuDeSach(rs.getString("TieuDe"));
                chiTiet.setSoLuong(rs.getInt("SoLuong"));
                chiTiet.setThanhTien(rs.getDouble("ThanhTien"));
                // Thêm chi tiết hóa đơn vào danh sách
                danhSachChiTiet.add(chiTiet);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return danhSachChiTiet;
    }
        
     public boolean xuatHoaDonPDF(HoaDon hoaDon, String filePath) throws IOException {
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

            Paragraph storeTitle = new Paragraph("NHÀ SÁCH SAO MAI", blueFont);
            storeTitle.setAlignment(Element.ALIGN_CENTER);
            document.add(storeTitle);
            document.add(Chunk.NEWLINE);


            // Hiển thị thông tin hóa đơn
            Paragraph title = new Paragraph("HÓA ĐƠN", new Font(baseFont, 16, Font.BOLD));
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);
            document.add(Chunk.NEWLINE); // Thêm một dòng trống

            document.add(new Paragraph("Mã Hóa Đơn: " + hoaDon.getHd_id(), unicodeFont));
            document.add(new Paragraph("Ngày: " + hoaDon.getNgay().toString(), unicodeFont));
            document.add(new Paragraph("Nhân Viên: " + hoaDon.getNhanVien(), unicodeFont));
            document.add(new Paragraph("Khách Hàng: " + hoaDon.getTenKhachHang(), unicodeFont));
            document.add(new Paragraph("Ghi Chú: " + hoaDon.getGhiChu(), unicodeFont));
            document.add(Chunk.NEWLINE); // Thêm một dòng trống để cách bảng

            // Xuất danh sách chi tiết hóa đơn
            ArrayList<ChiTietHoaDon> danhSachChiTiet = hoaDon.getDanhSachChiTiet();
            PdfPTable table = new PdfPTable(4); // Tạo bảng với 4 cột
            table.setWidthPercentage(100); // Chỉ định tỷ lệ chiều rộng của bảng
            table.setWidths(new float[]{1, 3, 1, 2}); // Chỉ định tỷ lệ chiều rộng của từng cột

            table.addCell(new PdfPCell(new Phrase("ID", unicodeFontBold)));
            table.addCell(new PdfPCell(new Phrase("Tên Sản Phẩm", unicodeFontBold)));
            table.addCell(new PdfPCell(new Phrase("Số Lượng", unicodeFontBold)));
            table.addCell(new PdfPCell(new Phrase("Đơn Giá", unicodeFontBold)));

            for (ChiTietHoaDon chiTiet : danhSachChiTiet) {
                table.addCell(new PdfPCell(new Phrase(String.valueOf(chiTiet.getIdHoaDon()), unicodeFont)));
                table.addCell(new PdfPCell(new Phrase(chiTiet.getTieuDeSach(), unicodeFont)));
                table.addCell(new PdfPCell(new Phrase(String.valueOf(chiTiet.getSoLuong()), unicodeFont)));
                table.addCell(new PdfPCell(new Phrase(String.valueOf(chiTiet.getThanhTien()), unicodeFont)));
            }
            document.add(table); // Thêm bảng vào tài liệu
            document.add(Chunk.NEWLINE); // Thêm một dòng trống để cách tổng tiền

            // Thêm tổng tiền
            Paragraph totalAmount = new Paragraph("Tổng Tiền: " + hoaDon.getTongTien() + " VND", redFont);
            document.add(totalAmount);

            document.close();
            return true;
        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
            return false;
        }
    }


    public ArrayList<ChiTietHoaDon> layCTHDtheoID(int hoaDonID) {
        ArrayList<ChiTietHoaDon> danhSachChiTiet = new ArrayList<>();
        try {
            String sql = "SELECT c.cthd_id, c.idHoaDon, s.TieuDe, c.SoLuong, c.ThanhTien " +
                                                      "FROM ChiTietHoaDon c " +
                                                      "JOIN Sach s ON c.IDSach = s.S_ID " +
                                                      "WHERE c.idHoaDon = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setInt(1, hoaDonID);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                ChiTietHoaDon chiTiet = new ChiTietHoaDon();
                chiTiet.setIdHoaDon(rs.getInt("idHoaDon"));
                chiTiet.setTieuDeSach(rs.getString("TieuDe"));
                chiTiet.setSoLuong(rs.getInt("SoLuong"));
                chiTiet.setThanhTien(rs.getDouble("ThanhTien"));
                danhSachChiTiet.add(chiTiet);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return danhSachChiTiet;
    } 
   
}