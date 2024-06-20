package doan.Model;

import java.util.ArrayList;
import java.util.Date;

public class HoaDon {
    private int hd_id;
    private Date ngay;
    private String nhanVien;
    private String tenKhachHang;
    private String ghiChu;
    private double tongTien;
    private ArrayList<ChiTietHoaDon> danhSachChiTiet;

    public HoaDon() {
    }

    public HoaDon(int hd_id, Date ngay, String nhanVien, String tenKhachHang, String ghiChu, double tongTien) {
        this.hd_id = hd_id;
        this.ngay = ngay;
        this.nhanVien = nhanVien;
        this.tenKhachHang = tenKhachHang;
        this.ghiChu = ghiChu;
        this.tongTien = tongTien;
    }

    public ArrayList<ChiTietHoaDon> getDanhSachChiTiet() {
        return danhSachChiTiet;
    }

    public void setDanhSachChiTiet(ArrayList<ChiTietHoaDon> danhSachChiTiet) {
        this.danhSachChiTiet = danhSachChiTiet;
    }
    public int getHd_id() {
        return hd_id;
    }

    public void setHd_id(int hd_id) {
        this.hd_id = hd_id;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public String getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(String nhanVien) {
        this.nhanVien = nhanVien;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "hd_id=" + hd_id + ", ngay=" + ngay + ", nhanVien=" + nhanVien + ", tenKhachHang=" + tenKhachHang + ", ghiChu=" + ghiChu + ", tongTien=" + tongTien + '}';
    }
}