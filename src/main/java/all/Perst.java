package all;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Perst {
    public static void main(String args[]){
        // String s ="test";
        //t-2 e-1 s-1
        String s ="test";
        Map<Character, Integer> map = new HashMap<>();
        IntStream.range(0, s.length()).forEach(i-> {
            if(map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), map.get(s.charAt(i)) +1);
            else
                map.put(s.charAt(i), 1);

        });

        Map<String, Long> cc = IntStream.range(0, s.length())
                .mapToObj(i -> s.substring(i, i + 1))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.forEach((key, value) -> System.out.println(key + ":" + value));

        int[] a= {1,2,3,4,5,6};
        //odd elements with adding 1
        List<Integer> ot = Arrays.stream(a).filter(i -> i %2 !=0).map(j-> j+1).boxed().collect(toList());

    }
}
