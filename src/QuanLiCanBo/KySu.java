package OnThi.src.QuanLiCanBo;

import java.util.Scanner;

public class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu() {
    }

    public KySu(String name, int age, String gender, String address, String nganhDaoTao) {
        super(name, age, gender, address);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        super.Nhap();
        System.out.println("Nhap ten nganh dao tao: ");
        nganhDaoTao = scanner.nextLine();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Nganh dao tao: " + nganhDaoTao);
        System.out.println(("----------------"));

    }
}
