import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeTwoArray {

    public static void main (String[] args){
        String[] nums1 = {"1", "3", "4"};
        String[] nums2 = {"2", "5" , "4"};
        String[] merged = Stream.concat(Arrays.stream(nums1), Arrays.stream(nums2))
                .sorted()
                .toArray(String[]::new);
//        Arrays.stream(merged).forEach(System.out::println);

        int[] arr = {5,7,3,1,0};
        int[] arr1= {6,4,2,8,0};

        int[] ints = IntStream.concat(Arrays.stream(arr), Arrays.stream(arr1))
                .distinct()
                .sorted().toArray();
//        Arrays.stream(ints).forEach(System.out::println);

        // not working
        List<Object> tt = new ArrayList<>();
       Stream.of(arr, arr1).flatMap(Stream::of).forEach(tt::add);
//        System.out.println(Arrays.toString(tt.toArray()));

        // merge without any duplicate sorted
        Set<Integer> ll = new HashSet<Integer>();
        Arrays.stream(arr).forEach(ll::add);
        Arrays.stream(arr1).forEach(ll::add);
//        ll.stream().sorted();
//        ll.forEach(System.out::println);

        Map<Integer, String> map = new HashMap<>();
        map.put(4,"Garima");
        map.put(2,"Java");
        map.put(1,"Gupta");
        map.put(3,"interview");

//        Collections.sort(Arrays.asList(map.values().toArray()),null);

       List<String> ll1 =  map.values().stream().sorted().collect(Collectors.toList());
       ll1.forEach(System.out::println);

        Stream<Map.Entry<Integer,String>> sorted =
                map.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue());
        sorted.forEach(System.out::println);

    }

}
