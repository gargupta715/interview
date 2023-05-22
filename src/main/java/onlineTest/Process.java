package onlineTest;

import java.util.HashMap;
import java.util.Objects;

class FirstClass{
    HashMap<Integer, Object> hm = new HashMap<>();

    public void add(int i, Integer value){
        hm.put(i, value);
    }
}
class SecondClass extends FirstClass{

    public void add(int i, String value){
        hm.put(i, value);
    }

    public void display() {
        Integer[] result = new Integer[hm.size()];
        hm.keySet().toArray(result);
        for(int i : result){
            System.out.println(hm.get(i%2));
        }
    }
}
public class Process {
    public static void main(String args[]){

        SecondClass sc = new SecondClass();
        sc.add(3, "three");
        sc.add(2, 2);
        sc.add(1, "One");
        sc.add(6, 6);
      sc.display();
    }
}
