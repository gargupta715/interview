import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Impetus {
    public static void main(String args[]){
        int[] ar ={6,3,5,8,2,2,2,9};
        Set<Integer> set = Arrays.stream(ar).boxed().collect(Collectors.toSet());
        for(int i=0;i< ar.length;i++){
            set.add(ar[i]);
        }

//        if(set.size() != 0){
//            if(set.size()>5)
//                System.out.println(set.iterator().get(5));
//            else
//                System.out.println(set.get(0));
//        }


    }
}
