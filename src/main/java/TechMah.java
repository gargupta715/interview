//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//import java.lang.*;
//public class Main {
//    public static void main(String[] args) {
//        //code : {"d","e","ed","co"} -true
////cars : {"c","ar","rs","a" ,"s"} -true
////sunflower  : {"sun","fl","lw","we", "o","r"} -false
//
//        String[] arr = {"d","e","ed","co"}; // de deed
//        List<String> ll = Arrays.stream(arr).collect(Collectors.toList()); // d, e, ed, co
//        String str = code;
//        String temp = "";
//        boolean con = false;
//
//        for(int i=0;i< str.length();i++){
//            String ch =  temp + String.valueOf(str.charAt(i));// d
//
//            if(ll.contains(ch)) //
//            {
//                temp = "";
//                con = true;
//            }
//        }
//
//        return con;
//
//    }
//}
//@Transaction()
//{
//        userA -> write()
//        }
//@Transaction{
//        userB -read();
//
//        }
//@Embaddleable
//public class comKey{
//    private final String id;
//    private final String name;
//}
//
//public class Address
//{
//    @JoinCol = student_id =id)
//}
//
//public final class Student {
//    private final String id;
//    private final String name;
//    @OneToMany(mappehy ="",ON_a)
//    private final List<Address> addre;
//
//
//
//
//
//
//    public String getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    Student(String id, String name){
//        this.id=id;
//        this.name=name;
//    }
//
//    public Address getaddress(){
//        Address clone =this.addre.clone;
//        return clone;
//    }
//
//
//
//
//}
//
//
//public class A {
//    int x = 20;
//}
//public class B extends A {
//    int x = 30;
//}
//
//
//
//    B b = new B();
//   System.out.println(b.x); // 30
//
//           A a = new A();
//           System.out.println(a.x); // 20
//
//           A a2 = new B();
//           System.out.println(a2.x);// 30
//
//
//
//public class A {
//    void m1() {
//        System.out.println("m1 in class A");
//    }
//}
//public class B extends A {
//    void m1() {
//        System.out.println("m1 in class B");
//    }
//}
//
//
//    B b = new B();
//     b.m1(); // m1 in class B
//
//             A a = new A();
//             a.m1(); // m1 in class A
//
//             A a2 = new B();
//             a2.m1();// m1 in class B
//
//
//
//
//             package pack1;
//
//public class A
//{
//    private int x = 50;
//    protected int y = 100;
//    int z = 200;
//}
//
//package pack2;
//
//        import pack1.A;
//public class B extends A {
//
//}
//
//
//
//import pack2.B;
//
//public class Test {
//    public static void main(String[] args)
//    {
//        B b = new B();
//        System.out.println(b.x);
//        System.out.println(b.y);
//        System.out.println(b.z);
//    }
//}
//
//
//
//
//
//
//    Map<String,String> map = new HashMap<>();
//		map.put("RED", "apple");
//                map.put("BLACK", null);
//                map.put("BLUE", "sea");
//                map.put("GREEN", "leaf");
//                map.put("WHITE", "");
//
//                Map<String, String> mp1 =  map.entrySet().stream().filter(e -> e.getValue !=null)
//        .collect(Collectors.toMap(e-> e.getKey, e.getValue, new HashMap<String,String>)));
//
//
//
//
//
//        List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 4, 5); =>3,4
//
//        ll.stream().collect(collectors.groupingBY(Funtion.identty(), Collectors.counting())).getValues().stream().filter(e-> e.getValue >1).collect(Collectors.toList());
//
//
//
//
//
//
//
//
