package OnThi.src.EmployeeTest;

import java.util.EmptyStackException;
import java.util.Scanner;

public class Activity {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        CompanyImpl company = new CompanyImpl();
        System.out.println("Nhap so luong nhan vien: ");
        int numOfEmployee = scanner.nextInt();
        scanner.nextLine();
        if (numOfEmployee > 500 || numOfEmployee < 0) {
            throw new Exception("So luong khong hop le");
        }

        //Them nhan vien
        for (int i = 0; i < numOfEmployee; i++) {
            System.out.println("Nhap thong tin nhan vien " + (i + 1));
            company.Add();
        }

        //Xuat danh sach theo ID tang dan
        company.SortByID();
        for (int i = 0; i < company.list.size(); i++) {
            System.out.println("Thong tin nhan vien " + (i + 1));
            company.list.get(i).Export();
        }

        //Chinh sua theo thong tin nhan vien ID
        System.out.println("Nhap ID nhan vien can sua thong tin:");
        int idToEdit = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < company.list.size(); i++) {
            if (idToEdit == company.list.get(i).getId()) {
                System.out.println("Nhap lai ten: ");
                String name = scanner.nextLine();
                company.list.get(i).setName(name);
                System.out.println("Nhap lai tuoi: ");
                int age = scanner.nextInt();
                company.list.get(i).setAge(age);
                scanner.nextLine();
                System.out.println("Nhap lai phong ban: ");
                String position = scanner.nextLine();
                company.list.get(i).setPosition(position);
            }
        }
        System.out.println("Thong tin da duoc cap nhat");

        //Sap xep danh sach theo phong ban sau khi cap nhat thong tin
        company.SortByPosition();
        for (int i = 0; i < company.list.size(); i++) {
            System.out.println("Thong tin nhan vien " + (i + 1));
            company.list.get(i).Export();
        }

        //Xoa nhan vien
        System.out.println("Nhap ID nhan vien can xoa: ");
        int idToDelete = scanner.nextInt();
        company.Delete(idToDelete);

        //Danh sach khi xoa va sap theo ID
        company.SortByID();
        for (int i = 0; i < company.list.size(); i++) {
            System.out.println("Thong tin nhan vien " + (i + 1));
            company.list.get(i).Export();
        }
    }
}
