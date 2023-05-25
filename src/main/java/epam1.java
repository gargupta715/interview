import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Collections.reverseOrder;

public class epam1 {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6};// filter > 2, map -> mupli by 3 and sum of remaining
//
//        System.out.println(Arrays.stream(arr).filter(e-> e>2).map(e-> e*3).sum());

        List<Integer> ll = Arrays.asList(1,2,3,4,5,6);
        Collections.sort( ll , (o1, o2) -> o2.compareTo(o1));
        System.out.println(ll.get(1));
//        int max=
//                int secondmax = 0;
//        Arrays.stream(arr).forEach(
//
//        );



        int num = 12345; // 54321

        int reverse = 0;

        while(num > 0){
            int rem = num % 10;
            num = num /10;
            reverse = reverse * 10 + rem;
        }

        System.out.println(reverse);

        List<Integer> list = Arrays.asList(1,2,3,4);
        list.stream().sorted((o1, o2) -> o2.compareTo(o1)).forEach(System.out::println);
        // emp - > id, name, age

//        Emp emp1= new Emp(1,"abc");
//        Emp emp2= new Emp(1,"abc");
//        Set<Emp> empSet = new HashSet<>();
//        empSet.add(emp1);
//        empSet.add(emp2)
//        empSet.size();

    }

}
