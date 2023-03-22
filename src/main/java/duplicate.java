import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class duplicate {
    public static void main (String[] args){

        //Remove duplicate elements or make duplicate number as 0 from the given array without using collections or in-built functions

//        int[] arr = {6,1,5,3,1,4,2,8,5,6};
//        int size = arr.length;
//        boolean[] trv = new boolean[256];
//        for(int i=0;i<size;i++){
//            int value  = arr[i];
//            if(trv[value])
//            {
//                arr[i] = 0;
//            }else{
//                trv[value] = true;
//            }
//        }
//
//        for(int i =0;i< size;i++)
//            System.out.println(arr[i]);

        // Sum of integers from the list using java8;
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        final Integer[] sum = {0};
        list.stream().forEach(integer -> {
            sum[0] = sum[0] + integer;
        });
        System.out.println(Arrays.stream(sum).findAny().get());

    }
}
