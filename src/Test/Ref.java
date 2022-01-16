package OnThi.src.Test;

public class Ref {
    int i=99;
    public static void main(String[] args){
        Ref r = new Ref();
        r.amethod(r);
    }

    public void amethod(Ref r) {
        multi(r);
        System.out.println(i);
    }

    public static void multi(Ref r) {
        r.i = r.i * 2;
    }
}
