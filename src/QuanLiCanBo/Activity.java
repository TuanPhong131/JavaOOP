package OnThi.src.QuanLiCanBo;

import java.util.Scanner;

public class Activity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLiCanBoImpl quanLiCanBo = new QuanLiCanBoImpl();

        while (true) {
            System.out.println("Chao mung den cong ty");
            System.out.println("1: Them nhan vien");
            System.out.println("2: Sap xep danh sach");
            System.out.println("3: Tim kiem nhan vien");
            System.out.println("4: Danh sach nhan vien");
            System.out.println("5: Thoat");
            System.out.println("Nhap lua chon:");
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1: {
                    quanLiCanBo.Them();
                    break;
                }
                case 2: {
                    quanLiCanBo.SapXepTheoTuoi();
                    break;
                }
                case 3: {
                    quanLiCanBo.TimKiem();
                    break;
                }
                case 4: {
                    quanLiCanBo.Xuat();
                    break;
                }
                case 5: {
                    System.exit(0);
                }
            }
        }
    }
}
