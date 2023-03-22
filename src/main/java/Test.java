import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<Employee> ll = new ArrayList();
        Employee e1 = new Employee(1,"abc", "lck");
        Employee e2 = new Employee(2,"xyz", "hkd");
        Employee e3 = new Employee(2,"xyz", "hkd");
        ll.add(e1);
        ll.add(e1);
        ll.add(e2);
        ll.add(e3);
        System.out.println(ll.size());

        List<String> list = new LinkedList<>();
        list.add("Geeks");
        list.add("For");
        list.add("Geeks");
        list.add("GeeksforGeeks");
        Iterator<String> iter = list.iterator();
        while (iter.hasNext())
            System.out.printf(iter.next() + " ");
        System.out.println();

    }

    // select * from ((select * from employee order by salary DESC limit 6) as T ) order by T.sal ASC limit 1;
}
