package OnThi.src.Test;

class Final {
    int xxx;
    void yyy(){
        xxx=1;
    }
}

class Example extends Final{
    final Final aFinal = new Final();
    final void yyy(){
        System.out.println("Trong phuong thuc yyy()");
        aFinal.xxx = 12345;
    }
}

