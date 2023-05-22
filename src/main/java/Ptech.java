import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ptech {

    public static void main(String args[]){
        List<Integer> integerList = Arrays.asList(10,11,7,8,9,12,13,14,11,2,3,4,5,6,7,8);
        integerList.stream().filter(i->i%2==0).max(Integer::compareTo);
        Optional<Double> max = integerList.stream().filter(i-> i%2==0).map(e -> Math.pow(e, 2)).max(Double::compareTo);

        List<Integer> integerList1 = Arrays.asList(10,11,7,8,9,12,13,14,11,2,3,4,5,6,7,8);
        for(Integer value : integerList1){
            if(value ==3 ){
                integerList.remove(value);
            }
        }
        System.out.println(integerList.toString());

        Iterator itr  = integerList.listIterator();

        while(itr.hasNext()){
            Integer value  = (Integer)itr.next();
            if(value == 3)
            {
                itr.remove();
            }
        }
    }

}
