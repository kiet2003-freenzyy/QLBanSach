package doan.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import doan.Model.LoaiSach;

public class LoaiSachDao extends KetNoiSQL {

    public ArrayList<LoaiSach> hienThi() {
        ArrayList<LoaiSach> danhSachLoaiSach = new ArrayList<>();
        try
        {
            String sql="SELECT * FROM LoaiSach";
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs= pre.executeQuery();
            while(rs.next())
            {
                LoaiSach ls = new LoaiSach();
                ls.setLsId(rs.getInt("LS_ID"));
                ls.setTen(rs.getString("Ten"));
                ls.setMoTa(rs.getString("MoTa"));
                danhSachLoaiSach.add(ls);
             }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }  
        return danhSachLoaiSach;
    }
    public boolean ThemLoaiSach(LoaiSach loaiSach) {
        try {

            String sqlCheckExist = "SELECT COUNT(*) FROM LoaiSach WHERE Ten = ?";
            PreparedStatement checkStmt = con.prepareStatement(sqlCheckExist);
            checkStmt.setString(1, loaiSach.getTen());
            ResultSet rsCheck = checkStmt.executeQuery();
            if (rsCheck.next() && rsCheck.getInt(1) > 0) {
                return false;
            }

            String sqlGetMaxID = "SELECT MAX(LS_ID) FROM LoaiSach";
            ResultSet rs = statement.executeQuery(sqlGetMaxID);
            int maxID = 0;
            if (rs.next()) {
                maxID = rs.getInt(1);
            }
            int newID = maxID + 1;

            String sql = "INSERT INTO LoaiSach (LS_ID, Ten, MoTa) VALUES (?, ?, ?)";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setInt(1, newID);
            pre.setString(2, loaiSach.getTen());
            pre.setString(3, loaiSach.getMoTa());
            int rowsAffected = pre.executeUpdate();
            loaiSach.setLsId(newID);
            return rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean XoaLoaiSach(int loaiSachId) {
        try {
            String sql = "DELETE FROM LoaiSach WHERE LS_ID = ?";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, loaiSachId);

            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean CapNhatLoaiSach(LoaiSach loaiSach) {
        try {
            String sql = "UPDATE LoaiSach SET Ten = ?, MoTa = ? WHERE LS_ID = ?";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, loaiSach.getTen());
            statement.setString(2, loaiSach.getMoTa());
            statement.setInt(3, loaiSach.getLsId());

            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public ArrayList<LoaiSach> loadLSComboBox() {
        ArrayList<LoaiSach> ds = new ArrayList<>();
        try
        {
            String sql="SELECT Ten FROM LoaiSach";
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs= pre.executeQuery();
            while(rs.next())
            {
                LoaiSach ls = new LoaiSach();
                ls.setTen(rs.getString("Ten"));
                ds.add(ls);
             }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }  
        return ds;
    }
    public LoaiSach getLoaiSachByTen(String ten) {
        LoaiSach loaiSach = null;

        try {
            String sql = "SELECT LS_ID, Ten FROM LoaiSach WHERE Ten = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, ten);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                loaiSach = new LoaiSach();
                loaiSach.setLsId(resultSet.getInt("LS_ID"));
                loaiSach.setTen(resultSet.getString("Ten"));
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Lỗi khi lấy loại sách theo tên: " + ex.getMessage(), ex);
        }

        return loaiSach;
    }
    
    
    
}