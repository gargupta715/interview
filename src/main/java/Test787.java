//import java.util.*;
//import java.util.stream.Collectors;
//
//public class Test787 {
//
//    public static void main(String args[]) {
//        String s = "This this is is done by Saket Saket";
//        String[] str = s.split(" ");
//        Map<String, Integer> map = new HashMap();
//        for(int i=0;i< str.length;i++)
//        {
//            if(map.containsKey(str[i])){
//                map.put(str[i], map.get(str[i]) + 1);
//            }else
//                map.put(str[i],1);
//        }
//        map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + "=" + e.getValue()));
//    }
//}
//
//// id,name, std, gen, dob
//
////       Map<String, Ineteger> =  ll.stream().filer(s -> s.getStd() == "10").collect(Collectors.groupingBy(s.getGen(), Collectors.counting()));
//
//
//// Write a Java Program to count the number of words in a string using Hash Map.
////Input: This this is is done by Saket Saket
////Output: {Saket=2, by=1, this=1, This=1, is=2, done=1}
//
//
