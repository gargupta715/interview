import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Epam4 {

    public static int[] repeatedSubstring(String s){
        if(s.length() == 0) return new int[]{-1,0};
        if(s.length() == 1) return new int[]{0,1};
        int idx = -1;
        int maxCharCount = 0;
        int count = 1;
        int i;
        for(i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)){
                count++;
            }else{
                if(count > maxCharCount){
                    maxCharCount = count;
                    idx = i - count;
                }
                count = 1;
            }
        }
        if(count > maxCharCount){
            maxCharCount = count;
            idx = i - count;
        }
        return new int[]{idx, maxCharCount};
    }
    public static void main(String args[]){
//        int[]  re = repeatedSubstring("10000111");
//        System.out.println(re[0] + " -" + re[1]);

        String[][]ll  = {{"ram" , "34"},
                {"ram", "78"},
                {"rohan" , "32"}};
        Map<String, List<Integer>> mp = new HashMap<>();

        Map<String, List<String>> map = Arrays.stream(ll).collect(Collectors.groupingBy(e-> e[0], Collectors.mapping(v-> v[1], Collectors.toList())));
//                .values().stream().forEach(e -> e.stream().collect(Collectors.averagingInt(value -> value.)));
        Arrays.stream(ll).forEach(e-> {

            if(mp.containsKey(e[0])){
                List<Integer> l = mp.get(e[0]);
                l.add(Integer.parseInt(e[1]));
                mp.put(e[0], l);

            }else{
                List<Integer> l = new ArrayList<>();
                l.add(Integer.parseInt(e[1]));
                mp.put(e[0],l);
            }

        });

        int max = Integer.MIN_VALUE;

        for(Map.Entry<String, List<Integer>> e: mp.entrySet()){
            int avg=  e.getValue().stream().collect(Collectors.averagingInt(i-> i)).intValue();
            if(max< avg){
                max= avg;
            }
        }



//        List<Integer> integerList = Arrays.asList(4,8,23,8,10,19);
//        System.out.println((Integer) integerList.stream().filter(e -> e % 2 == 0).mapToInt(e -> e).sum());

    }
}
