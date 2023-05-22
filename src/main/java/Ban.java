import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class Ban {

    private static String depat = "Cs";
    private String name;

    public void test(){
        // nw orianted, resource oriented
        final int i = 10;
        byte b = i; // convert int to byte without type cast
        System.out.println(i);
        System.out.println(b);
        System.out.println("Hello");
    }


    public static void main(String args[]){
        Stream.of(3,5,6).min(Integer::compareTo);

        BiFunction<Integer, Integer, Integer> f = (a, b)-> a+b;
        System.out.println(f.apply(10, 45));

        Ban b = new Ban();
        b.test();
    }


}
