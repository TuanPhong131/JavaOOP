package OnThi.src.Test;

public class Sample {
    public static void main(String[] args) {
        Derived derived = new Derived();
        Base base = derived;
        base.fun();
    }
}

class Base{
    public void fun(){
        System.out.println("1st");
    }
}

class Derived extends Base{
    public void fun(){
        System.out.println("2nd");
    }
}
