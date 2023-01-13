class A{
     final void show(){
        System.out.println("From Class 1");
    }
}

class B extends A{
//    void show(){
//        System.out.println("From Class B");
//    }
}

public class Pro_002 {
    public static void main(String[] args) {
        A ob = new A();
        B obj = new B();
        obj.show();
    }
}
