package OnThi.src.QuanLiCanBo;

import java.util.Scanner;

public class CanBo {
    private String name;
    private int age;
    private String gender;
    private String address;

    public CanBo() {
    }

    public CanBo(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap gioi tính: ");
        gender = scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        address = scanner.nextLine();
    }

    public void Xuat() {
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Gioi tính: " + gender);
        System.out.println("Dia chi: " + address);
    }
}
