import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class tibco {
    public static void main(String args[]){
        int arr[] = {100, 14, 46, 47, 100, 94, 94, 52, 86, 36, 94, 89};
         Arrays.stream(arr).mapToObj(Integer::valueOf).collect(Collectors.toList());
        Set<Integer> ll = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        ll.stream().sorted(Integer::compareTo);
        Iterator<Integer> it = ll.iterator();
        int count =0;
        while(it.hasNext()){
            if(count ==2){
                System.out.println(it.next());
                break;
            }
            count++;
        }


        // input = 3
        //
        //calculation will be = 1-1/3+1/5
        //
        //input = 5
        //
        //calculation will be = 1-(1/3)+(1/5)-(1/7)+(1/9)
        //
        //input = 7
        //
        //calculation will be = 1-1/3+1/5-1/7+1/9-1/11+1/13
        //
        //input = n
        //
        //calculation will be = 1-1/3+1/5-1/7+1/9.....n

        int n =5;
        boolean sign = false;
        int sum = 1;
        int oddNum = 1;
        for(int i=1;i<n;i++){




        }
    }
}
