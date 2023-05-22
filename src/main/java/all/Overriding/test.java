package Overriding;

public class test implements I2,I1 {

    // we can not invoke static method with intance of class
    public static void main(String[] args){
        I1 t = new test();

//        I1.testMethodHiding(); // Static method may be invoked on containing interface class only

//        t.testMethodOverriding();
        t.testDefaultMethod();

        test t2 =new test();
//        t2.testMethodOverriding();
//
//
//        t2.testMethodHiding(); //can not call static method of interface
//
        t2.testDefaultMethod();
    }
// default methods were introduced to provide backward compatibility for old interface.
    @Override
    public void testMethodOverriding() {
        System.out.println("In test class::testMethodOverriding");
    }

//    public static void testMethodHiding() {
//        System.out.println("In test class::testMethodHiding");
//    }


//    @Override
//    public void testDefaultMethod() {
//        System.out.println("In test class::testDefaultMethod");
////        I2.super.testDefaultMethod();
//        I1.super.testDefaultMethod();
//    }
}