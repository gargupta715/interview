import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FuntionIntfExapl implements Sample, B {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add("abc");
        list.forEach(System.out::println);

        List<Integer> ll = new ArrayList<>();
        ll.add(2);
        ll.add(3);
        List<Integer> evenll = ll.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        evenll.forEach(System.out::println);
        FuntionIntfExapl object = new FuntionIntfExapl();
        object.absMethod();

        Sample i = () -> System.out.println("method one execution");
    }

    @Override
    public void absMethod(){
        System.out.println(1);
    }

    @Override
    public void methodOne() {
        System.out.println("method one execution");
    }
}


@FunctionalInterface
interface Sample{
    void absMethod();
}

@FunctionalInterface
interface A {
    void methodOne();
}

@FunctionalInterface
interface B extends A {
    void methodOne();
}

@FunctionalInterface
interface C {
    void methodOne();
}

// compile Time error
//@FunctionalInterface
//interface D extends C {
//    void methodTwo();
//}