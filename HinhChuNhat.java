class hcn {
    private double chieuDai;
    private double chieuRong;

    public hcn(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double tinhChuVi() {
        return  (chieuDai + chieuRong) * 2;
    }

    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    public void hienThi() {
        System.out.println("Hình chữ nhật:");
        System.out.println("- Chiều dài: " + chieuDai);
        System.out.println("- Chiều rộng: " + chieuRong);
        System.out.println("- Chu vi: " + tinhChuVi());
        System.out.println("- Diện tích: " + tinhDienTich());
        System.out.println("-------------------------");
    }
}

public class HinhChuNhat {
    public static void main(String[] args) {
        hcn hcn1 = new hcn(18, 3);
        hcn hcn2 = new hcn(36, 4);
        hcn hcn3 = new hcn(7, 3.6);

        hcn1.hienThi();
        hcn2.hienThi();
        hcn3.hienThi();
    }
}
