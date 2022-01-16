package OnThi.src.QuanLiCanBo;

import java.util.Scanner;

public class NhanVien extends CanBo {
    public String congViec;

    public NhanVien() {

    }

    public NhanVien(String name, int age, String gender, String address, String congViec) {
        super(name, age, gender, address);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public void Nhap() {
        super.Nhap();
        System.out.println("Nhap cong viec cua nhan vien: ");
        Scanner scanner = new Scanner(System.in);
        congViec = scanner.nextLine();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Cong viec: " + congViec);
        System.out.println(("----------------"));

    }
}
