package Overriding;

public interface I1 {

    void testMethodOverriding();

    static void testMethodHiding(){
        System.out.println("In I1 interface::testMethodHiding");
    }

    default void testDefaultMethod(){
        System.out.println("In I1 interface::testDefaultMethod");
    }
}
