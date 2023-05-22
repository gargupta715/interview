public class OverTiding {
    public static void main(String args[]){
        X x = new X();
        x.test();
        X y = new Y();
        y.test();
    }
}

class X{
    public void test(){
        System.out.println("In X");
    }
}

class Y extends X{
    public void test(){
        System.out.println("In Y");
    }
}

