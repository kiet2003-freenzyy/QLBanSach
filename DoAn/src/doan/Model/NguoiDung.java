package doan.Model;

public class NguoiDung {
    private String madn;
    private String tennd;
    private String matkhau;
    private String tennv;
    private String role;

    public NguoiDung(String madn, String tennd, String matkhau, String tennv, String role) {
        this.madn = madn;
        this.tennd = tennd;
        this.matkhau = matkhau;
        this.tennv = tennv;
        this.role = role;
    }

    // Default constructor
    public NguoiDung() {
    }

    // Getters and setters
    public String getMadn() {
        return madn;
    }

    public void setMadn(String madn) {
        this.madn = madn;
    }

    public String getTennd() {
        return tennd;
    }

    public void setTennd(String tennd) {
        this.tennd = tennd;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "NguoiDung{" + "madn=" + madn + ", tennd=" + tennd + ", matkhau=" + matkhau + ", tennv=" + tennv + ", role=" + role + '}';
    }
}
