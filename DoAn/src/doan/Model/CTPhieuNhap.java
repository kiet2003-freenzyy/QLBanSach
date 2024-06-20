package doan.Model;

public class CTPhieuNhap {
    private int ctpnsId;
    private int idPhieuNhap;
    private String idSach;
    private int soLuong;
    private double thanhTien;

    public CTPhieuNhap() {
    }

    public CTPhieuNhap(int ctpnsId, int idPhieuNhap, String idSach, int soLuong, double thanhTien) {
        this.ctpnsId = ctpnsId;
        this.idPhieuNhap = idPhieuNhap;
        this.idSach = idSach;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
    }

    public int getCtpnsId() {
        return ctpnsId;
    }

    public void setCtpnsId(int ctpnsId) {
        this.ctpnsId = ctpnsId;
    }

    public int getIdPhieuNhap() {
        return idPhieuNhap;
    }

    public void setIdPhieuNhap(int idPhieuNhap) {
        this.idPhieuNhap = idPhieuNhap;
    }

    public String getIdSach() {
        return idSach;
    }

    public void setIdSach(String idSach) {
        this.idSach = idSach;
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

    @Override
    public String toString() {
        return "CTPhieuNhap{" + "ctpnsId=" + ctpnsId + ", idPhieuNhap=" + idPhieuNhap + ", idSach=" + idSach + ", soLuong=" + soLuong + ", thanhTien=" + thanhTien + '}';
    }
}