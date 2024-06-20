package doan.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import doan.Model.NguoiDung;

public class NguoiDungDao extends KetNoiSQL {
     
    public NguoiDung dangnhap(String username, String password) {
        NguoiDung nd = null;
        try {
            String sql = "SELECT * FROM NguoiDung WHERE TenDN=? AND MatKhau=?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, username);
            pre.setString(2, password);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                nd = new NguoiDung();
                nd.setMadn(rs.getString("MaDN"));
                nd.setTennd(rs.getString("TenDN"));
                nd.setMatkhau(rs.getString("MatKhau"));
                nd.setTennv(rs.getString("TenNV"));
                nd.setRole(rs.getString("Role"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }            
        return nd;
    }
     public ArrayList<NguoiDung> layTatCaNguoiDung() {
        ArrayList<NguoiDung> danhSachNguoiDung = new ArrayList<>();
        try {
            String sql = "SELECT * FROM NguoiDung";
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                NguoiDung nd = new NguoiDung();
                nd.setMadn(rs.getString("MaDN"));
                nd.setTennd(rs.getString("TenDN"));
                nd.setMatkhau(rs.getString("MatKhau"));
                nd.setTennv(rs.getString("TenNV"));
                nd.setRole(rs.getString("Role"));
                danhSachNguoiDung.add(nd);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return danhSachNguoiDung;
    }

    public boolean ThemNguoiDung(NguoiDung nguoiDung) {
        try {
            String sqlCheckExist = "SELECT COUNT(*) FROM NguoiDung WHERE TenDN = ?";
            PreparedStatement checkStmt = con.prepareStatement(sqlCheckExist);
            checkStmt.setString(1, nguoiDung.getTennd());
            ResultSet rsCheck = checkStmt.executeQuery();
            if (rsCheck.next() && rsCheck.getInt(1) > 0) {
                return false;
            }

 
            String sqlGetMaxID = "SELECT MAX(MaDN) FROM NguoiDung";
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sqlGetMaxID);
            int maxID = 0;
            if (rs.next()) {
                maxID = rs.getInt(1);
            }
            int newID = maxID + 1;

            String sql = "INSERT INTO NguoiDung (MaDN, TenDN, MatKhau, TenNV, Role) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setInt(1, newID);
            pre.setString(2, nguoiDung.getTennd());
            pre.setString(3, nguoiDung.getMatkhau());
            pre.setString(4, nguoiDung.getTennv());
            pre.setString(5, nguoiDung.getRole());
            int rowsAffected = pre.executeUpdate();
            nguoiDung.setMadn(String.valueOf(newID));
            return rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }


    public boolean CapNhatNguoiDung(NguoiDung nguoiDung) {
        try {
            String sql = "UPDATE NguoiDung SET TenDN = ?, MatKhau = ?, TenNV = ?, Role = ? WHERE MaDN = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, nguoiDung.getTennd());
            pre.setString(2, nguoiDung.getMatkhau());
            pre.setString(3, nguoiDung.getTennv());
            pre.setString(4, nguoiDung.getRole());
            pre.setString(5, nguoiDung.getMadn());
            int rowsAffected = pre.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean xoaNguoiDung(String madn) {
        try {
            String sql = "DELETE FROM NguoiDung WHERE MaDN = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, madn);
            int rowsAffected = pre.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<String> loadRoleComboBox() {
        ArrayList<String> dsRoles = new ArrayList<>();
        try {
            String sql = "SELECT DISTINCT Role FROM NguoiDung";
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                String role = rs.getString("Role");
                dsRoles.add(role);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }  
        return dsRoles;
    }

   
}
