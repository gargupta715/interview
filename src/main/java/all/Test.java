import java.util.*;

public class Test {
    public static void main(String[] args){
//        List<Employee> ll = new ArrayList();
//        Employee e1 = new Employee(1,"abc", "lck");
//        Employee e2 = new Employee(2,"xyz", "hkd");
//        Employee e3 = new Employee(2,"xyz", "hkd");
//        ll.add(e1);
//        ll.add(e1);
//        ll.add(e2);
//        ll.add(e3);
//        System.out.println(ll.size());
//
//        List<String> list = new LinkedList<>();
//        list.add("Geeks");
//        list.add("For");
//        list.add("Geeks");
//        list.add("GeeksforGeeks");
//        Iterator<String> iter = list.iterator();
//        while (iter.hasNext())
//            System.out.printf(iter.next() + " ");
//        System.out.println();

        String a =null;
        Optional<String> b = Optional.empty();
        System.out.println(a.length());
        System.out.println(b.orElse(" ").length());

//
//        Set<String> s = new LinkedHashSet();
//        s.add("3");
//        s.add("1");
//        s.add("3");
//
//        s.removeIf(i -> s.contains("1"));
//        s.add("2");
//        s.remove("2");
//        s.forEach(i->System.out.println(s+"-"));



    }

    // select * from ((select * from employee order by salary DESC limit 6) as T ) order by T.sal ASC limit 1;
}
