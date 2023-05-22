//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
//public class BelzabarNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        is_belzabar_number(40);
//        count_belzabar_numbers();
//        count_prime_belzabar_numbers();
//        sc.close();
//    }
//
//
//    static int i = 2;
//
//    static boolean is_prime(int n) {//Create a boolean array
//        // Corner cases
//        if (n == 0 || n == 1) {
//            return false;
//        }
//
//        // Checking Prime
//        if (n == i)
//            return true;
//
//        // Base cases
//        if (n % i == 0) {
//            return false;
//        }
//        i++;
//        return is_prime(n);
//    }
//
//    private static void count_prime_belzabar_numbers() {
//        // Calculate and print the count of prime Belzabar numbers less than or equal to 1 million.
//        int count = 0;
//        for (int i = 2; i < 1000001; i++) {
//            if (is_belzabar_number(i) && is_prime(i))
//                count += 1;
//        }
//        System.out.println("Number of prime Belzabar numbers less than or equal to 1 million:" + count);
//    }
//
//    private static void count_belzabar_numbers() {
//        // Calculate and print the count of Belzabar numbers less than or equal to 1 million.
//        int count = 0;
//        for (int i = 2; i < 1000001; i++) {
//            if (is_belzabar_number(i))
//                count += 1;
//        }
//        System.out.println("Number of Belzabar numbers less than or equal to 1 million:" + count);
//    }
//
//    private static boolean is_belzabar_number(int X) {
//        // Determine if a given number is a Belzabar number.Args: n (int): The number to check. Returns:
//        // bool: True if n is a Belzabar number, False otherwise.
//        // Check if n can be represented as (n + 18) * n or (n - 18) * n, where n is a prime number.
//        //some Belzabar numbers in the form of n(n-14) or n(n+14), where n is prime.
//        // So you have given the input X, find the count of all the Belzabar numbers less than or equal to X.
//        int[] primenum = sieveOfEratosthenes(X);
//        for (int i = 0; i < primenum.length; i++) {
//            if ((i * (i + 19)) == X || (i-19 > 1 && i* (i-19) == X))
//                return true;
//        }
//        return false;
//        List<String> ll = new ArrayList<?>();
//    }
//
//    static int[] sieveOfEratosthenes(int X) {
//        List<Integer> ll = new ArrayList<>();
//        // Create a boolean array "prime[0..n]" and initialize
//        // all entries it as true. A value in prime[i] will
//        // finally be false if i is Not a prime, else true.
//        boolean prime[] = new boolean[X + 1];
//        for (int i = 0; i < X; i++)
//            prime[i] = true;
//        for (int p = 2; p * p <= X; p++) {
//            // If prime[p] is not changed, then it is a prime
//            if (prime[p] == true) {
//                // Update all multiples of p
//                for (int i = p * 2; i <= X; i += p)
//                    prime[i] = false;
//            }
//        }
//        // Print all prime numbers
//        for (int i = 2; i <= X; i++) {
//            if (prime[i] == true)
//                ll.add(i);
//        }
//        return ll.stream()
//                .mapToInt(Integer::intValue)
//                .toArray();
//    }
//}
