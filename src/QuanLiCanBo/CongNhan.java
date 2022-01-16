package OnThi.src.QuanLiCanBo;

import java.util.Scanner;

public class CongNhan extends CanBo {
    private int bac;

    public CongNhan() {
    }

    public CongNhan(String name, int age, String gender, String address, int bac) {
        super(name, age, gender, address);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        super.Nhap();
        System.out.println("Nhap so bac cua cong nhan: ");
        bac = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("So bac: " + bac);
        System.out.println(("----------------"));
    }

}
