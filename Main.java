package OnThi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int tongNhanVien;
        Company company = new Company();
        Scanner scanner = new Scanner(System.in);
        int idToRemove;
        System.out.println("Nhap so nhan vien cua cong ty: ");
        tongNhanVien = scanner.nextInt();
        if (tongNhanVien > 500 || tongNhanVien < 0) {
            throw new Exception("Khong hop le");
        }
        for (int i = 0; i < tongNhanVien; i++) {
            System.out.println("Nhap thong tin nhan vien " + (i + 1));
            company.Add();
        }

        company.SortID();
        System.out.println("Danh sach nhan vien da duoc sap xep theo ID");
        for (int i = 0; i < company.employees.size(); i++) {
            System.out.println("Thong tin nhan vien " + (i + 1));
            company.employees.get(i).Export();

        }

        System.out.println("Nhap id nhan vien can sua: ");
        int idToEdit = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < company.employees.size(); i++) {
            if (idToEdit == company.employees.get(i).getId()) {
                System.out.println("Nhap lai ten:");
                String name = scanner.nextLine();
                company.employees.get(i).setName(name);
                System.out.println("Nhap lai tuoi: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                company.employees.get(i).setAge(age);
                System.out.println("Nhap lai phong ban: ");
                String position = scanner.nextLine();
                company.employees.get(i).setPosition(position);
            }
        }
        System.out.println("Thong tin da duoc cap nhat");

        company.SortPosition();
        System.out.println("Danh sach nhan vien da duoc sap xep theo phong ban");
        for (int i = 0; i < company.employees.size(); i++) {
            System.out.println("Thong tin nhan vien " + (i + 1));
            company.employees.get(i).Export();

        }

        System.out.println("Nhap id nhan vien can xoa:");
        idToRemove = scanner.nextInt();
        company.Delete(idToRemove);
        System.out.println("Danh sach nhan vien sau khi xoa nhan vien co ID: "+idToRemove);
        for (int i = 0; i < company.employees.size(); i++) {
            System.out.println("Thong tin nhan vien " + (i + 1));
            company.employees.get(i).Export();

        }
    }
}
