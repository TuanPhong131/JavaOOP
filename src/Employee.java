package OnThi.src;

import java.util.Scanner;

public class Employee implements ImportExportEmployee {
    public static int idCurrent = 100000;
    private String name;
    private int id;
    private int age;
    private String position;

    public Employee() {
        id = idCurrent++;
    }

    public Employee(String name, int id, int age, String position) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void Import() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = scanner.nextLine();
        System.out.println("Nhap tuoi:");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap phong ban: ");
        position = scanner.nextLine();
    }

    @Override
    public void Export() {
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("ID: " + getId());
        System.out.println("Phong ban: " + position);
        System.out.println("------------------");
    }
}
