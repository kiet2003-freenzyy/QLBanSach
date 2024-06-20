package doan.Model;
public class ChiTietThongKe {
    private String tenSach;
    private int soLuong;
    private double thanhTien;

    public ChiTietThongKe(String tenSach, int soLuong, double thanhTien) {
        this.tenSach = tenSach;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
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
