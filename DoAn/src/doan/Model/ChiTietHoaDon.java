package doan.Model;

public class ChiTietHoaDon {
    private int cthd_id;
    private int idHoaDon;
    private String tieuDeSach;
    private int soLuong;
    private double thanhTien;

    public int getCthd_id() {
        return cthd_id;
    }

    public void setCthd_id(int cthd_id) {
        this.cthd_id = cthd_id;
    }

    public int getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(int idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public String getTieuDeSach() {
        return tieuDeSach;
    }

    public void setTieuDeSach(String tieuDeSach) {
        this.tieuDeSach = tieuDeSach;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
}

