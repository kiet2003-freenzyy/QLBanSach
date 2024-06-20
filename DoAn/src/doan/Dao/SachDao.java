package doan.Dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import doan.Model.Sach;

public class SachDao extends KetNoiSQL{
        public ArrayList<Sach> hienThi() {
        ArrayList<Sach> danhSachSach = new ArrayList<>();
        try {
            String sql = "SELECT Sach.S_ID, Sach.TieuDe, Sach.TacGia, Sach.NamXuatBan, LoaiSach.Ten AS TheLoai, Sach.MoTa, Sach.GiaBan " +
                       "FROM Sach " +
                       "INNER JOIN LoaiSach ON Sach.TheLoai = LoaiSach.LS_ID;";
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();

            while (rs.next()) {
                Sach s = new Sach(
                    rs.getInt("S_ID"),
                    rs.getString("TieuDe"),
                    rs.getString("TacGia"),
                    rs.getInt("NamXuatBan"),
                    rs.getString("TheLoai"),
                    rs.getDouble("GiaBan"),
                    rs.getString("MoTa")
                );
                danhSachSach.add(s);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return danhSachSach;
    }
    public boolean themSach(Sach sach) {
        try {
            String sqlCheckExist = "SELECT COUNT(*) FROM Sach WHERE TieuDe = ? AND TacGia = ?";
            PreparedStatement checkStmt = con.prepareStatement(sqlCheckExist);
            checkStmt.setString(1, sach.getTieuDe());
            checkStmt.setString(2, sach.getTacGia());
            ResultSet rsCheck = checkStmt.executeQuery();
            if (rsCheck.next() && rsCheck.getInt(1) > 0) {
                return false;
            }

            String sqlMaxId = "SELECT MAX(S_ID) FROM Sach";
            ResultSet rs = statement.executeQuery(sqlMaxId);
            int maxId = 0;
            if (rs.next()) {
                maxId = rs.getInt(1);
            }
            int newId = maxId + 1;

            String sqlInsert = "INSERT INTO Sach (S_ID, TieuDe, TacGia, NamXuatBan, TheLoai, MoTa, GiaBan) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preInsert = con.prepareStatement(sqlInsert);
            preInsert.setInt(1, newId);
            preInsert.setString(2, sach.getTieuDe());
            preInsert.setString(3, sach.getTacGia());
            preInsert.setInt(4, sach.getNamXuatBan());
            preInsert.setString(5, sach.getTheLoai());
            preInsert.setString(6, sach.getMoTa());
            preInsert.setDouble(7, sach.getGiaBan());
            int rowsAffected = preInsert.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    public boolean xoaSach(int sachId) {
        try {
            String sql = "DELETE FROM Sach WHERE S_ID = ?";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, sachId);

            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean capNhatSach(Sach sach) {
        try {
            String sql = "UPDATE Sach SET TieuDe = ?, TacGia = ?, GiaBan = ?, MoTa = ?, TheLoai = ?, NamXuatBan = ? WHERE S_ID = ?";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, sach.getTieuDe());
            statement.setString(2, sach.getTacGia());
            statement.setDouble(3, sach.getGiaBan());
            statement.setString(4, sach.getMoTa());
            statement.setString(5, sach.getTheLoai());
            statement.setInt(6, sach.getNamXuatBan());
            statement.setInt(7, sach.getsId());

            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public ArrayList<Sach> timKiemSach(String keyword) {
        ArrayList<Sach> danhSachSach = new ArrayList<>();
        try {
            String sql = "SELECT Sach.S_ID, Sach.TieuDe, Sach.TacGia, Sach.NamXuatBan, LoaiSach.Ten AS TheLoai, Sach.MoTa, Sach.GiaBan " +
                         "FROM Sach " +
                         "INNER JOIN LoaiSach ON Sach.TheLoai = LoaiSach.LS_ID " +
                         "WHERE CAST(Sach.S_ID AS VARCHAR(10)) LIKE ? " +
                         "OR Sach.TieuDe LIKE ? " +
                         "OR Sach.TacGia LIKE ? " +
                         "OR CAST(Sach.NamXuatBan AS VARCHAR(4)) LIKE ? " +
                         "OR LoaiSach.Ten LIKE ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, "%" + keyword + "%");
            pre.setString(2, "%" + keyword + "%");
            pre.setString(3, "%" + keyword + "%");
            pre.setString(4, "%" + keyword + "%");
            pre.setString(5, "%" + keyword + "%");
            ResultSet rs = pre.executeQuery();

            while (rs.next()) {
                Sach s = new Sach(
                    rs.getInt("S_ID"),
                    rs.getString("TieuDe"),
                    rs.getString("TacGia"),
                    rs.getInt("NamXuatBan"),
                    rs.getString("TheLoai"),
                    rs.getDouble("GiaBan"),
                    rs.getString("MoTa")
                );
                danhSachSach.add(s);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return danhSachSach;
    }
       
}
