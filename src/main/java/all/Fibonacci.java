package all;

import java.util.*;

class MaxStack {

    Stack<Integer> s = new Stack<>();
    Integer mx =  Integer.MIN_VALUE;

    void push(Integer i){
        if(mx< i )
            mx=i;
        s.push(i);
    }
    void pop(){
        s.pop();
    }
    Integer getMaxElement(){


        return mx;
    }
}

public class Fibonacci {
    public static void main(String args[]){

        List<Employee> ll = new ArrayList<>();
        Optional<Employee> maxSalaryEmp =
                ll.stream().max(Comparator.comparing(Employee::getSalary));

//        Collections.max(ll,
//                Comparator.comparing(Employee::getSalary)
//        )

        Optional<Employee> emp = ll.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();

        System.out.println(emp.get());

        MaxStack s = new MaxStack();
        s.push(1); //  p1,p2,p5,p3,p10,pop
        System.out.println(s.getMaxElement());
        s.push(2);
        System.out.println(s.getMaxElement());
        s.push(5);
        System.out.println(s.getMaxElement());
        s.push(3);
        System.out.println(s.getMaxElement());
        s.push(10);
        System.out.println(s.getMaxElement());
        s.pop();
        System.out.println(s.getMaxElement());

        // fibonacci no at position 5
//        int x = 100;
//        System.out.println(findFibonacciNumber(x));

    }
    // 0,1,1,2,3,5,

//    private static BigInteger findFibonacciNumber(int x) {
//        BigInteger m = new BigInteger(String.valueOf(0));
//        BigInteger n = new BigInteger(String.valueOf(1));
//        if(x==0)
//            return new BigInteger(String.valueOf(0));
//        if(x==1)
//            return new BigInteger(String.valueOf(1));
//        for(int i=2;i<=x;i++){
//            BigInteger sum = n.add(m);
//            m =n;
//            n= sum;
//        }
//        return n;
//    }



}
