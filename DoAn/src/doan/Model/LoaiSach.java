package doan.Model;

public class LoaiSach {
    private int lsId;
    private String ten;
    private String moTa;

    public LoaiSach() {
    }

    public LoaiSach(int lsId, String ten, String moTa) {
        this.lsId = lsId;
        this.ten = ten;
        this.moTa = moTa;
    }

    public int getLsId() {
        return lsId;
    }

    public void setLsId(int lsId) {
        this.lsId = lsId;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "LoaiSach{" + "lsId=" + lsId + ", ten=" + ten + ", moTa=" + moTa + '}';
    }
}