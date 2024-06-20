package doan.Model;
import java.util.ArrayList;

public class PhieuNhap {
    private int pnsId;
    private String ghiChu;
    private String ngay;
    private String nhanVien;
    private double tongTien;
    private ArrayList<CTPhieuNhap> danhSachChiTiet;

    public PhieuNhap() {
    }

    public PhieuNhap(int pnsId, String ghiChu, String ngay, String nhanVien, double tongTien) {
        this.pnsId = pnsId;
        this.ghiChu = ghiChu;
        this.ngay = ngay;
        this.nhanVien = nhanVien;
        this.tongTien = tongTien;
    }
    public ArrayList<CTPhieuNhap> getDanhSachChiTiet() {
        return danhSachChiTiet;
    }

    public void setDanhSachChiTiet(ArrayList<CTPhieuNhap> danhSachChiTiet) {
        this.danhSachChiTiet = danhSachChiTiet;
    }
    public int getPnsId() {
        return pnsId;
    }

    public void setPnsId(int pnsId) {
        this.pnsId = pnsId;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(String nhanVien) {
        this.nhanVien = nhanVien;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return "PhieuNhap{" + "pnsId=" + pnsId + ", ghiChu=" + ghiChu + ", ngay=" + ngay + ", nhanVien=" + nhanVien + ", tongTien=" + tongTien + '}';
    }
}