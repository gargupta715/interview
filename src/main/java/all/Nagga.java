package all;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Nagga {
    public static void main(String args[]){
        // Input {"Oracle", "Java", "DotNet", "Oracle", "Sql"}
        //
        //Output
        //{
        //"Oracle" : 2,
        //"Java" : 1,
        //"Sql" : 1,
        //"DotNet" : 1
        //}
        List<String> ll = new ArrayList<>();
        ll.add("Oracle");
        ll.add("Java");
        ll.add("DotNet"); ll.add("Oracle"); ll.add("Sql");

        Map<String, Long> map = ll.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((key, value) -> System.out.println(key + " : " + value));

    }
}

class SingltonClass {

    private  static SingltonClass singltonClass;
    private SingltonClass(){

    }

    public static SingltonClass getInstance(){

        if(singltonClass == null)
            singltonClass = new SingltonClass();

        return singltonClass;
    }


}
