package doan.Dao;

import doan.Model.PhieuNhap;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import doan.Model.CTPhieuNhap;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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

public class PhieuNhapDao extends KetNoiSQL {
    public ArrayList<PhieuNhap> hienThi() {
        ArrayList<PhieuNhap> danhSachPhieuNhap = new ArrayList<>();
        try {
            String sql = "SELECT pns_id, ghichu, ngay, nhanvien, tongtien FROM PhieuNhap";
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                PhieuNhap p = new PhieuNhap(
                    rs.getInt("pns_id"),
                    rs.getString("ghichu"),
                    rs.getString("ngay"),
                    rs.getString("nhanvien"),
                    rs.getDouble("tongtien")
                );
                danhSachPhieuNhap.add(p);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return danhSachPhieuNhap;
    }

    public boolean themPhieuNhap(PhieuNhap phieuNhap) {
        try {
            String sqlMaxId = "SELECT MAX(PNS_ID) FROM PhieuNhap";
            PreparedStatement preMaxId = con.prepareStatement(sqlMaxId);
            ResultSet rs = preMaxId.executeQuery();
            int maxId = 0;
            if (rs.next()) {
                maxId = rs.getInt(1);
            }
            int newId = maxId + 1;
            
            String sqlInsert = "INSERT INTO PhieuNhap (PNS_ID, GhiChu, Ngay, NhanVien, TongTien) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preInsert = con.prepareStatement(sqlInsert);
            preInsert.setInt(1, newId);
            preInsert.setString(2, phieuNhap.getGhiChu());
            preInsert.setString(3, phieuNhap.getNgay());
            preInsert.setString(4, phieuNhap.getNhanVien());
            preInsert.setDouble(5, phieuNhap.getTongTien());
            int rowsAffected = preInsert.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean xoaPhieuNhap(int pnsId) {
        try {
            String sql = "DELETE FROM PhieuNhap WHERE PNS_ID = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, pnsId);
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean capNhatPhieuNhap(PhieuNhap phieuNhap) {
        try {
            String sql = "UPDATE PhieuNhap SET GhiChu = ?, Ngay = ?, NhanVien = ?, TongTien = ? WHERE PNS_ID = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, phieuNhap.getGhiChu());
            statement.setString(2, phieuNhap.getNgay());
            statement.setString(3, phieuNhap.getNhanVien());
            statement.setDouble(4, phieuNhap.getTongTien());
            statement.setInt(5, phieuNhap.getPnsId());
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public ArrayList<PhieuNhap> loadNVienComboBox() {
        ArrayList<PhieuNhap> ds = new ArrayList<>();
        try {
            String sql = "SELECT NhanVien FROM PhieuNhap";
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                PhieuNhap pn = new PhieuNhap();
                pn.setNhanVien(rs.getString("NhanVien"));
                ds.add(pn);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }  
        return ds;
    }

    public PhieuNhap getNhanVienByTen(String ten) {
        PhieuNhap loaiSach = null;
        try {
            String sql = "SELECT NhanVien FROM PhieuNhap WHERE NhanVien = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, ten); // Thay đổi từ statement.setString(3, ten)
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                loaiSach = new PhieuNhap();
                loaiSach.setNhanVien(resultSet.getString("NhanVien"));
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Lỗi khi lấy loại sách theo tên: " + ex.getMessage(), ex);
        }
        return loaiSach;
    }

    public boolean xuatHoaDonPDF(PhieuNhap phieuNhap, String filePath) throws IOException {
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

            // Hiển thị tiêu đề "NHÀ SÁCH SAO MAI" với màu xanh
            Paragraph storeTitle = new Paragraph("NHÀ SÁCH SAO MAI", blueFont);
            storeTitle.setAlignment(Element.ALIGN_CENTER);
            document.add(storeTitle);
            document.add(Chunk.NEWLINE); // Thêm một dòng trống

            // Hiển thị thông tin phiếu nhập
            Paragraph title = new Paragraph("PHIẾU NHẬP", new Font(baseFont, 16, Font.BOLD));
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);
            document.add(Chunk.NEWLINE); // Thêm một dòng trống

            document.add(new Paragraph("Mã Phiếu Nhập: " + phieuNhap.getPnsId(), unicodeFont));
            document.add(new Paragraph("Ngày: " + phieuNhap.getNgay().toString(), unicodeFont));
            document.add(new Paragraph("Nhân Viên: " + phieuNhap.getNhanVien(), unicodeFont));
            document.add(new Paragraph("Ghi Chú: " + phieuNhap.getGhiChu(), unicodeFont));
            document.add(Chunk.NEWLINE); // Thêm một dòng trống để cách bảng

            // Xuất danh sách chi tiết phiếu nhập
            ArrayList<CTPhieuNhap> danhSachChiTiet = phieuNhap.getDanhSachChiTiet();
            PdfPTable table = new PdfPTable(4); // Tạo bảng với 4 cột
            table.setWidthPercentage(100); // Chỉ định tỷ lệ chiều rộng của bảng
            table.setWidths(new float[]{1, 3, 1, 2}); // Chỉ định tỷ lệ chiều rộng của từng cột

            table.addCell(new PdfPCell(new Phrase("ID", unicodeFontBold)));
            table.addCell(new PdfPCell(new Phrase("Tên Sản Phẩm", unicodeFontBold)));
            table.addCell(new PdfPCell(new Phrase("Số Lượng", unicodeFontBold)));
            table.addCell(new PdfPCell(new Phrase("Đơn Giá", unicodeFontBold)));

            for (CTPhieuNhap chiTiet : danhSachChiTiet) {
                table.addCell(new PdfPCell(new Phrase(String.valueOf(chiTiet.getCtpnsId()), unicodeFont)));
                table.addCell(new PdfPCell(new Phrase(String.valueOf(chiTiet.getIdSach()), unicodeFont)));
                table.addCell(new PdfPCell(new Phrase(String.valueOf(chiTiet.getSoLuong()), unicodeFont)));
                table.addCell(new PdfPCell(new Phrase(String.valueOf(chiTiet.getThanhTien()), unicodeFont)));
            }
            document.add(table); // Thêm bảng vào tài liệu
            document.add(Chunk.NEWLINE); // Thêm một dòng trống để cách tổng tiền

            // Thêm tổng tiền với màu đỏ
            Paragraph totalAmount = new Paragraph("Tổng Tiền: " + phieuNhap.getTongTien() + " VND", redFont);
            document.add(totalAmount);

            document.close();
            return true;
        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
            return false;
        }
    }


public ArrayList<CTPhieuNhap> layCTHDtheoID(int hoaDonID) {
    ArrayList<CTPhieuNhap> danhSachChiTiet = new ArrayList<>();
    try {
        String sql = "SELECT CTPNS_ID, IDPhieuNhap, Sach.TieuDe, SoLuong, ThanhTien " +
                     "FROM ChiTietPhieuNhap " +
                     "JOIN Sach ON ChiTietPhieuNhap.IDSach = Sach.S_ID " + // Thêm một khoảng trắng ở đây
                     "WHERE IDPhieuNhap = ?";
        PreparedStatement pre = con.prepareStatement(sql);
        pre.setInt(1, hoaDonID);
        ResultSet rs = pre.executeQuery();
        while (rs.next()) {
            CTPhieuNhap chiTiet = new CTPhieuNhap();
            chiTiet.setCtpnsId(rs.getInt("CTPNS_ID"));
            chiTiet.setIdPhieuNhap(rs.getInt("IDPhieuNhap"));
            chiTiet.setIdSach(rs.getString("TieuDe"));
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
