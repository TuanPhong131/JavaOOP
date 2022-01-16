package OnThi.src.Test;

public class ExceptionSample {
    public static void main(String[] args) {
        try{
            try{
                int b=39/0;
            }
            catch (ArithmeticException e){
                System.out.println("1st");
            }
            try {
                int a[] = new int[5];
                a[5]=4;
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("2nd");
            }
        }
        catch (Exception e){
            System.out.println("3rd");
        }
        finally {
            System.out.println("finally");
        }
    }
}

