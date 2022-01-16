package OnThi.src.EmployeeTest;

public abstract class Person {
    protected String name;
    protected int age;
    protected String position;

    public Person(){
    }

    public Person(String name,int age,String position){
        this.name = name;
        this.age = age;
        this.position = position;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public abstract void Import();
    public abstract void Export();

}
