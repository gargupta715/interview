package onlineTest;

import java.util.TreeSet;

public class A1 {
    public static void main(String args[]){
        A a = new B1();
        System.out.println(a.getData());
        TreeSet<String> tt = new TreeSet<>();
        tt.add("hello");
        tt.iterator().next();
    }


}

class A{
    public Object getData(){
        return  null;
    }

}
class B1 extends A{
    public String getData(){
        return  "Hel";
        }

}
