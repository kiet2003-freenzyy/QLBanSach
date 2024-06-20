package doan.Model;

public class ThongKe {
    private int quy;
    private double doanhThu;

    public ThongKe() {
    }

    public ThongKe(int quy, double doanhThu) {
        this.quy = quy;
        this.doanhThu = doanhThu;
    }

    public int getQuy() {
        return quy;
    }

    public void setQuy(int quy) {
        this.quy = quy;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    @Override
    public String toString() {
        return "ThongKe{" +
                "quy=" + quy +
                ", doanhThu=" + doanhThu +
                '}';
    }
}
