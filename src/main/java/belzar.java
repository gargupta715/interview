//public class belzar {
//}
//    def is_belzabar_number(n):
//
//        """
//
//    Determine if a given number is a Belzabar number.
//
//    Args:
//
//    n (int): The number to check.
//
//    Returns:
//
//    bool: True if n is a Belzabar number, False otherwise.
//
//    """
//
//        # Check if n can be represented as (n + 18) * n or (n - 18) * n, where n is a prime number.
//
//        for i in range(2, int(n ** 0.5) + 1):
//
//        if n % i == 0:
//
//        return False
//
//        if n + 18 > 1 and n == (n + 18) // is_prime(n + 18):
//
//        return True
//
//        if n - 18 > 1 and n == (n - 18) // is_prime(n - 18):
//
//        return True
//
//        return False
//
//
//
//        def count_belzabar_numbers():
//
//        """
//
//    Calculate and print the count of Belzabar numbers less than or equal to 1 million.
//
//    """
//
//        count = 0
//
//        for i in range(2, 1000001):
//
//        if is_belzabar_number(i):
//
//        count += 1
//
//        print(f"Number of Belzabar numbers less than or equal to 1 million: {count}")
//
//
//
//        def count_prime_belzabar_numbers():
//
//        """
//
//    Calculate and print the count of prime Belzabar numbers less than or equal to 1 million.
//
//    """
//
//        count = 0
//
//        for i in range(2, 1000001):
//
//        if is_belzabar_number(i) and is_prime(i):
//
//        count += 1
//
//        print(f"Number of prime Belzabar numbers less than or equal to 1 million: {count}")
//
//
//        def is_prime(n):
//        # Create a boolean array
//        # "prime[0..n]" and initialize
//        #  all entries it as true.
//        # A value in prime[i] will
//        # finally be false if i is
//        # Not a prime, else true.
//        prime = [True for i in range(n+1)]
//        p = 2
//        while (p * p <= n):
//
//        # If prime[p] is not
//        # changed, then it is a prime
//        if (prime[p] == True):
//
//        # Update all multiples of p
//        for i in range(p * p, n+1, p):
//        prime[i] = False
//        p += 1
//
//        # Print all prime numbers
//        for p in range(2, n+1):
//        if prime[p]:
//        return True
//        return False
//
//
//        # Driver code
//        if __name__ == '__main__':
//        is_belzabar_number(40)
//        count_belzabar_numbers()
//        count_prime_belzabar_numbers()
//
//
//
//
//
//        name, email,score,
//        find out list of name of those student whose score is greater than 70
//
//        List<String> nameList = ll.stream().filter(s-> s.getscore()>70).map(e->e.getName()).collect(Collectors.toList());
//
//        // persistest Student in db.
//        ResponseEntity<Student>
//
//class ScoreException extends Exception{
//
//    public ScoreException (String error){
//        super(error);
//    }
//
//    validateScore(String score){
//        if(score<70)
//            retrne new ScoreEx("score must be grateer 70");
//
//
//    }
//}
//    new Sco("Score must be greater than 7");
//
//
//
//            int[] = {1,5,4,7,8,9,2}
//            int k = 6;
//
//
//// find out count of such pairs whose sume is equals to k
//
//public int countPairs(int[] arr, int k){
//        int count =0;
//        int n = ar.length;
//        Map<Integer,Integer> mp = new HashMap<>();
//        for(int i=0;i<n;i++){
//        {
//        if(mp.contains(arr[i])){
//        mp.put(arr[i], mp.get(arr[i]) +1);
//        }else{
//        mp.put(arr[i], 1); 1->1,5->1,4->1,7->1,8->1, 9->1,2->1
//        }
//        }
//
//        for(Map.Entry e : mp.entrySet()){
//        {
//        int rem = k-e.getKey(); 2
//        if(mp.contains(rem))
//        count++;
//        }
//        }
//
//        return count/2;
//        }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//        }
//
//
//
//
//
//
//
//
//
//
//
//        int[]