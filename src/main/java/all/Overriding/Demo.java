package Overriding;

public class Demo extends A{

    public static void m1(){
        System.out.println("Demo::m1");
    }

    @Override
    public void m2(){
        System.out.println("Demo::m2");
    }


    public static void main(String[] args) throws Exception {
        A d1= new A(); // instance of superclass
        A d2 = new Demo();

        d1.m1(); // static method
        d1.m2(); // method overriding
// override static method we do not get the benefit of run time polymorphism
        // for method hiding both method must be static
        d2.m1(); // static method we do not get
        d2.m2();

        B b1 = new B();
        b1.m2();
        b1.m1(); // will be accessed throw instance reference

        A b2 = new B();
        b2.m2();
        b2.m1();




    }
}
