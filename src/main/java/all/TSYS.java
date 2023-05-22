package all;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TSYS {
    public static void main(String args[]){

        // Given a list of integer, print the count of elements which starts with 1?
        //[10,25,50,19]
        List<Integer> ll = Arrays.asList(10,25,50,19, 100, 1000);
        Long count  = ll.stream().map(Object::toString).filter(i -> i.charAt(0) == '1').count();
        System.out.println(count);
        //  String[] arr = str.split("[/./?/!]");

        // Given two arraylist which are in sorted order, prepare third arraylist which is
        //combination of both Al and they are in sorted order.
        //Eample: {4,5, 8, 15}  {3, 4, 7, 18}  -> {3,4, 5, 7, 8, 15, 18}
        List<Integer> l1 = Arrays.asList(5, 8, 15);
        List<Integer> l2 = Arrays.asList(3, 4, 7, 18);
        List<Integer> set = new ArrayList<>();
//        set.addAll(l1);
//        set.addAll(l2);

//        set.stream().forEach(System.out::println);

        int n  = Math.max(l1.size(), l2.size()); // 3, 4 4 // 3,4, 5, 7, 8, 15 j=3, i=3
        int i = 0; //
        int j = 0;
        while(i< l1.size() && j< l2.size()){
           if(l1.get(i) < l2.get(j)){
               set.add(l1.get(i));
               i++;
           }else {
               set.add(l2.get(j));
               j++;
           }
        }
        while(i< l1.size()) {
            set.add(l1.get(i));
            i++;
        }
        while(j< l2.size()){
            set.add(l2.get(j));
            j++;
        }


    }
}
