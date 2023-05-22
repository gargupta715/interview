package Overriding;

public interface I2 {

    void testMethodOverriding();
    static void testMethodHiding(){
        System.out.println("In I2 interface::testMethodHiding");
    }

//    default void testDefaultMethod(){
//        System.out.println("In I2 interface::testDefaultMethod");
//    }
}
