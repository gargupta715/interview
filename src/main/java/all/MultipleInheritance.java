//public class MultipleInheritance implements InterfaceX, InterfaceY {
//    public String geek() {
//        return "hello";
//    }
//}

interface InterfaceX
{
    int geek();
}
interface InterfaceY
{
    String geek();
}


interface bishal
{
    void show();
}

interface geeks
{
    int show();
}

//class Test implements bishal, geeks
//{
//    public void show() // Overloaded method based on return type, Error
//    {
//    }
////    public int show() // Error
////    {
////        return 1;
////    }
//}



interface InterfaceA
{
    int fun();
    default int test(){
        return 1;
    }
}
interface InterfaceB extends InterfaceA
{
    String moreFun();
    default int test(){
        return 0;
    }
}

class MainClass implements InterfaceA
{
    public String getStuff()
    {
        return "one";
    }
    @Override
    public int fun() {
        return 1;
    }


//    @Override
//    public int test() {
//        return 0;
//    }

//    @Override
//    public String moreFun(){
//        return "xyz";
//
//    }
}


// A class implementation of a method takes precedence over a default method. So, if the class already has the same method as an Interface, then the default method from the implemented Interface does not take effect.
// However, if two interfaces implement the same default method, then there is a conflict.
// In cases where one interface inherits another interface and both of them implement a default method, an implementing class would use the default method of the child interface.
// Also, an explicit call to an interface default method can be made from inside an implementing class using super. For example Interface.super.defaultMethod().