package onlineTest;

import java.util.Arrays;
// -2

public class ParseEmptyArray {
    public static void main(String args[]){
        String[][] data = {{"Present"},{"Present", "Present"}};
        System.out.println(Arrays.stream(data).flatMap(d->Arrays.stream(d)).findAny().orElse("Nothing"));
        System.out.println(Arrays.stream(data).flatMap(d->Arrays.stream(d)).findFirst().orElse("Nothing"));
    }
}
