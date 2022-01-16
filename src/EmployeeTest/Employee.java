package OnThi.src.EmployeeTest;

import java.util.Scanner;

public class Employee extends Person {

    private int id;
    private static int idCurrent = 100000;

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public Employee(){
        id = idCurrent++;
    }

    public Employee(String name,int age,int id,String position){
        super(name,age,position);
        this.id = id;
    }

    @Override
    public void Import() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name =scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap phong ban:");
        position = scanner.nextLine();
    }

    @Override
    public void Export() {
        System.out.println("Ten: "+name);
        System.out.println("Tuoi: "+age);
        System.out.println("ID: "+id);
        System.out.println("Phong ban: "+position);
        System.out.println("------------------------");
    }
}
