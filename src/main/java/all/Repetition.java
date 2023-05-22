package all;

import com.sun.javafx.logging.JFRInputEvent;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Repetition {
    public static void main(String args[]) {

        //Write a java program to find the first repeated character in a given string
        //Input: Java is cool!
        //Output: a
        String s = "cool";
        System.out.println(firstRepeating(s));

        Object linkedHashMap;
        Map<Character, Long> collect = "abcsdnvs".chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(Function.identity(),
//                linkedHashMap::new,
                Collectors.counting()));

//        Map<String, Integer> citiesWithCodes = new HashMap<String, Integer>();
//        citiesWithCodes.put("Berlin", 49);
//        citiesWithCodes.put("Frankfurt", 49);
//        citiesWithCodes.put("Hamburg", 49);
//        citiesWithCodes.put("Cologne", 49);
//        citiesWithCodes.put("Salzburg", 43);
//        citiesWithCodes.put("Vienna", 43);
//        citiesWithCodes.put("Zurich", 41);
//        citiesWithCodes.put("Bern", 41);
//        citiesWithCodes.put("Interlaken", 41);
//        Map<Integer, List<String>> result =  citiesWithCodes.entrySet().stream().collect(Collectors.groupingBy(
//                    Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey, Collectors.toList()))
//        );

        //    System.out.println(result);
        collect.forEach((x, y) -> System.out.println("Key: " + x + " Val: " + y));

        Optional<Character> firstNonRepeat = collect.entrySet().stream().filter((e) -> e.getValue() == 1).map(e -> e.getKey()).findFirst();
        if (firstNonRepeat.isPresent()) {
            System.out.println("First non repeating:" + firstNonRepeat.get());
        }
        Optional<Character> firstRepeat = collect.entrySet().stream().filter((e) -> e.getValue() > 1).map(e -> e.getKey()).findFirst();
        System.out.println("First repeating:" + firstRepeat.orElse(null));

    }

    // Returns first repeating character in str.
    static char firstRepeating(String str) {
        int n = str.length();
        char ans = ' ';
        int index = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            char temp = str.charAt(i);

            // Checking that character in temp repeats or not by running a for loop
            for (int j = i + 1; j < n; j++) {
                if (str.charAt(j) == temp) {

                    // if the index where it repeated is less than the index of the previously
                    // repeated character then store this character in ans variable
                    // and its index where it repeated in index variable
                    if (j < index) {
                        index = j;
                        ans = str.charAt(j);
                    }
                }
            }
        }
        return ans;
    }
}
