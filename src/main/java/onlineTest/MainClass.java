package onlineTest;

class Class1{
    public void display(int i){
        System.out.println("It's an integer");
    }
}

class Class2 extends Class1{
    public void display(String i){
        System.out.println("It's an string");
    }

}
public class MainClass {
    public static void main(String args[]){
        Class2 class2 = new Class2();
        class2.display('c');
        class2.display("string");
    }
}
