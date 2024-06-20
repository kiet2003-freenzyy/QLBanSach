package doan.Dao;
import doan.Model.CTPhieuNhap;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class CTPhieuNhapDao extends KetNoiSQL{

    public ArrayList<CTPhieuNhap> hienThi() {
        ArrayList<CTPhieuNhap> danhSachCTPhieuNhap = new ArrayList<>();
        try {
            String sql = "SELECT CTPNS_ID, IDPhieuNhap, Sach.TieuDe, SoLuong, ThanhTien " +
             "FROM ChiTietPhieuNhap " +
             "JOIN Sach ON ChiTietPhieuNhap.IDSach = Sach.S_ID";
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();

            while (rs.next()) {
                // Create a temporary Sach object for simplicity

                // Create a PhieuNhap object and add the ChiTietPhieuNhap object to it (if needed)
            CTPhieuNhap c = new CTPhieuNhap(
                rs.getInt("CTPNS_ID"),
                rs.getInt("IDPhieuNhap"),
                rs.getString("TieuDe"),
                rs.getInt("SoLuong"),
                rs.getDouble("ThanhTien")
            );
                // Add the ChiTietPhieuNhap object to the PhieuNhap object (if needed)

                danhSachCTPhieuNhap.add(c);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return danhSachCTPhieuNhap;
    }
    public boolean themChiTietPhieuNhap(CTPhieuNhap chiTietPhieuNhap) {
        try {
            // Lấy giá trị lớn nhất của PNS_ID từ bảng PhieuNhap
            String sqlMaxId = "SELECT MAX(CTPNS_ID) FROM ChiTietPhieuNhap";
            PreparedStatement preMaxId = con.prepareStatement(sqlMaxId);
            ResultSet rs = preMaxId.executeQuery();
            int maxId = 0;
            if (rs.next()) {
                maxId = rs.getInt(1);
            }
            int newId = maxId + 1;
            
            // Chèn bản ghi mới vào bảng PhieuNhap
            String sqlInsert = "INSERT INTO ChiTietPhieuNhap (CTPNS_ID, IDPhieuNhap, IDSach, SoLuong, ThanhTien) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preInsert = con.prepareStatement(sqlInsert);
            preInsert.setInt(1, newId);
            preInsert.setInt(2, chiTietPhieuNhap.getIdPhieuNhap());
            preInsert.setString(3, chiTietPhieuNhap.getIdSach());
            preInsert.setInt(4, chiTietPhieuNhap.getSoLuong());
            preInsert.setDouble(5, chiTietPhieuNhap.getThanhTien());
            int rowsAffected = preInsert.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    public boolean xoaChiTietPhieuNhap(int ctpnsId)
    {
        try{
            String sql = "Delete from ChiTietPhieuNhap Where CTPNS_ID = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, ctpnsId);
            int rowAffected = statement.executeUpdate();
            return rowAffected > 0;
        }
        catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    public boolean capNhatChiTietPhieuNhap(CTPhieuNhap chiTietPhieuNhap) {
    try {
        String sql = "UPDATE ChiTietPhieuNhap SET IDPhieuNhap = ?, IDSach = ?, SoLuong = ?, ThanhTien = ? WHERE CTPNS_ID = ?";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setInt(1, chiTietPhieuNhap.getIdPhieuNhap());
        statement.setString(2, chiTietPhieuNhap.getIdSach());
        statement.setInt(3, chiTietPhieuNhap.getSoLuong());
        statement.setDouble(4, chiTietPhieuNhap.getThanhTien());
        statement.setInt(5, chiTietPhieuNhap.getCtpnsId());
        int rowsAffected = statement.executeUpdate();
        return rowsAffected > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
    }
}
