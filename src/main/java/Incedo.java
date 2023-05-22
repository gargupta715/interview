import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Incedo {
    public static void main(String args[]){

        // ll of Emp -> name and age
        // name which duplicate, sum of al duplicate.

        List<Emp> ll = new ArrayList<>();
        ll.add(new Emp("ram", 23));
        ll.add(new Emp("ram", 23));
        ll.add(new Emp("rohan", 23));
        long sum1 = ll.stream().collect(Collectors.groupingBy(Emp::getName, Collectors.counting())).entrySet().stream().filter(e -> e.getValue() >1).mapToLong(Map.Entry::getValue).sum();
        long sum =  ll.stream().collect(Collectors.groupingBy(Emp::getName, Collectors.counting())).values().stream().filter(aLong -> aLong > 1).mapToLong(l -> l).sum();
        System.out.println(sum);
    }

}

class Emp{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Emp(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private Integer age;


}
