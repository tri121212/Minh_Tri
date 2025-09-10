import java.util.*;

public class TaiKhoan {
    private String soTaiKhoan;
    private String tenChu;
    private double soDu;
    private static double laiSuatNam = 0.05;

    public TaiKhoan(String soTaiKhoan, String tenChu, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChu = tenChu;
        this.soDu = soDu;
    }

    public void napTien(double soTien) {
        if (soTien > 0) soDu += soTien;
    }

    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) soDu -= soTien;
    }

    public void tinhLaiMotThang() {
        soDu += soDu * (laiSuatNam / 12);
    }

    public void hienThi() {
        System.out.println("STK: " + soTaiKhoan + ", Chủ TK: " + tenChu + ", Số dư: " + soDu);
    }

    public static void thayDoiLaiSuat(double laiSuatMoi) {
        laiSuatNam = laiSuatMoi;
    }

    public static void hienThiLaiSuat() {
        System.out.println("Lãi suất năm hiện tại: " + laiSuatNam);
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public double getSoDu() {
        return soDu;
    }

    public static void main(String[] args) {
        List<TaiKhoan> ds = new ArrayList<>();
        ds.add(new TaiKhoan("001", "Nguyen Van A", 5000));
        ds.add(new TaiKhoan("002", "Tran Thi B", 3000));
        ds.add(new TaiKhoan("003", "Le Van C", 10000));

        ds.get(0).napTien(2000);
        ds.get(1).rutTien(1000);
        ds.get(2).tinhLaiMotThang();

        for (TaiKhoan tk : ds) tk.hienThi();

        TaiKhoan.thayDoiLaiSuat(0.07);
        TaiKhoan.hienThiLaiSuat();

        System.out.println("Tìm kiếm STK 002:");
        for (TaiKhoan tk : ds) {
            if (tk.getSoTaiKhoan().equals("002")) tk.hienThi();
        }

        ds.sort((a, b) -> Double.compare(b.getSoDu(), a.getSoDu()));
        System.out.println("Danh sách sau khi sắp xếp:");
        for (TaiKhoan tk : ds) tk.hienThi();
    }
}