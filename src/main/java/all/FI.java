package all;

import java.util.stream.IntStream;

public class FI {
//    ll.stream().filter(emp -> emp.getSalary()>10000).collect(collectors.toList());
    public static void main(String args[]){
        System.out.println(isprime(9));

    }
    static boolean isprime(int n){
        if(n<2)
            return false;
        return IntStream.range(2,n/2).noneMatch(i -> n%i == 0);

    }
}


