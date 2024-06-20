package doan.Model;

public class Sach {
    private int sId;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private String theLoai;
    private double giaBan;
    private String moTa;

    public Sach() {
    }

    public Sach(int sId, String tieuDe, String tacGia, int namXuatBan, String theLoai, double giaBan, String moTa) {
        this.sId = sId;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.theLoai = theLoai;
        this.giaBan = giaBan;
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "Sach{" + "sId=" + sId + ", tieuDe=" + tieuDe + ", tacGia=" + tacGia + ", namXuatBan=" + namXuatBan + ", theLoai=" + theLoai + ", giaBan=" + giaBan + ", moTa=" + moTa + '}';
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    

}
