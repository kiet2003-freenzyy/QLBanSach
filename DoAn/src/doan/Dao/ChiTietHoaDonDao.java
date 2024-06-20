package doan.Dao;

import doan.Model.ChiTietHoaDon;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ChiTietHoaDonDao extends KetNoiSQL{
    public ArrayList<ChiTietHoaDon> hienThi(int hoaDonId) {
        ArrayList<ChiTietHoaDon> danhSachChiTietHoaDon = new ArrayList<>();
        try {
            String sql = "SELECT c.cthd_id, c.idHoaDon, s.TieuDe, c.SoLuong, c.ThanhTien " +
                                                      "FROM ChiTietHoaDon c " +
                                                      "JOIN Sach s ON c.IDSach = s.S_ID " +
                                                      "WHERE c.idHoaDon = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setInt(1, hoaDonId);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                ChiTietHoaDon ctHD = new ChiTietHoaDon();
                ctHD.setCthd_id(rs.getInt("cthd_id"));
                ctHD.setIdHoaDon(rs.getInt("idHoaDon"));
                ctHD.setTieuDeSach(rs.getString("TieuDe"));
                ctHD.setSoLuong(rs.getInt("SoLuong"));
                ctHD.setThanhTien(rs.getDouble("ThanhTien"));
                danhSachChiTietHoaDon.add(ctHD);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return danhSachChiTietHoaDon;
    }
    public boolean themCTHD(ChiTietHoaDon chiTietHoaDon) {
        try {
            String sqlMaxId = "SELECT MAX(CTHD_ID) AS MaxCTHDID FROM ChiTietHoaDon";
            ResultSet rs = statement.executeQuery(sqlMaxId);
            int maxId = 0;
            if (rs.next()) {
                maxId = rs.getInt(1);
            }
            int newId = maxId + 1;
            
            String sql = "INSERT INTO ChiTietHoaDon (cthd_id, idHoaDon, IDSach, SoLuong, ThanhTien) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setInt(1, newId);
            pre.setInt(2, chiTietHoaDon.getIdHoaDon());
            pre.setString(3, chiTietHoaDon.getTieuDeSach());
            pre.setInt(4, chiTietHoaDon.getSoLuong());
            pre.setDouble(5, chiTietHoaDon.getThanhTien());
            return pre.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
    public boolean xoaCTHD(int cthd_id) {
        try {
            String sql = "DELETE FROM ChiTietHoaDon WHERE cthd_id = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, cthd_id);
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean suaCTHD(ChiTietHoaDon chiTietHoaDon) {
        try {
            String sql = "UPDATE ChiTietHoaDon SET idHoaDon = ?, IDSach = ?, SoLuong = ?, ThanhTien = ? WHERE cthd_id = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setInt(1, chiTietHoaDon.getIdHoaDon());
            pre.setString(2, chiTietHoaDon.getTieuDeSach());
            pre.setInt(3, chiTietHoaDon.getSoLuong());
            pre.setDouble(4, chiTietHoaDon.getThanhTien());
            pre.setInt(5, chiTietHoaDon.getCthd_id());
            return pre.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
