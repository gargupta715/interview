import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test7777 {
    public static void main(String args[]){
//        List<Long> ar = Arrays.asList(5,7,8,2,7);
//
//        ar.stream().mapToLong(i -> i).sum();

        // int a[] = {2,3,4,2,3,4,4,1,5}
        //2->2
        //3->2
        //4->3

        int[] ar = {2,3,4,2,3,4,4,1,5};
        Map<Integer, Integer> map =  new HashMap<>();
        int n = ar.length;
        IntStream.range(0, n).forEach(i -> {
            if(map.containsKey(ar[i]))
            {
                map.put(ar[i], map.get(ar[i]) + 1);
            }else
                map.put(ar[i], 1);
        });
        //map.entrySet().forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));

        map.entrySet().stream().filter(e -> e.getValue() > 1).forEach(e -> System.out.println(e.getKey() + " - " + e.getValue() ));

    }


    //    public int compareTo(String value, String anotherString) {
//        int len1 = value.length;
//        int len2 = anotherString.value.length;
//        int lim = Math.min(len1, len2);
//        char v1[] = value;
//        char v2[] = anotherString.value;
//
//        int k = 0;
//        while (k < lim) {
//            char c1 = v1[k];
//            char c2 = v2[k];
//            if (c1 != c2) {
//                return c1 - c2;
//            }
//            k++;
//        }
//        return len1 - len2;
//    }
}
