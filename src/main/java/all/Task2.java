package all;

import java.util.Arrays;

//https://algo.monster/problems/widest_path_without_trees
//https://www.linkedin.com/pulse/best-solutions-microsoft-interview-tasks-min-obtain-molchevskyi/
//https://cs.stackexchange.com/questions/140864/minimum-number-of-increment-decrement-operations-to-make-an-array-distinct
//First Observation:
//Consider the result array, which contains N
// distinct numbers between 1 and N
//.
//Since there are only N
// numbers between 1 and N
//, all those numbers must appear in the result array and no other numbers will appear.
//
//Second Observation:
//Consider 1
//, the smallest number in the result array. Which number in A
// should be changed to 1
// so as to incur the least cost? The smallest number of A
//.
//Then consider 2
//, the next smallest number in the result array. Which number among the remaining numbers in A
// should be changed to 2
// so as to incur the least cost? The smallest of the remaining numbers in A
//.
//Then consider 3
//, the next smallest number in the result array. Which number among the remaining numbers in A
// should be changed to 3
// so as to incur the least cost? The smallest of the remaining numbers in A
//.
//And so on.
//That is, we should change the k
//-th smallest number in the original array to k
//.
//
//So, the algorithm is
//
//sort A
//.
//return the sum of |A[i]−i|
//, with i
// ranging over 1..N
//, assuming A
// is 1-indexed.

public class Task2 {
//    public int solution(int[] A) {
//        Arrays.sort(A);
//        int count = 0;
//        for (int i = 1; i <= A.length ; ++i) {
//            count += Math.abs(A[i-1] - i);
//        }
//
//        return count;
//    }
//    public static int solution(String S) {
//        int count =0;
//        int BOcc = 0;
//        char prev = S.charAt(0);
//        for(int i=1;i<S.length();i++){
//            if(S.charAt(i)!=prev && prev == 'B'){
//                count = count + BOcc;
//                prev = S.charAt(i);
//            }else{
//                if(prev == 'B')
//                    BOcc++;
//                prev=S.charAt(i);
//            }
//        }
//        return count;
//    }

    public int solution(String S) {
        char CHAR_A = 'A';
        int numbs =0;
        int min_delete = 0;
        char prev = S.charAt(0);
        for(int i=0;i<S.length();i++){
            if(CHAR_A == S.charAt(i))
            {
                min_delete= Math.min(numbs , min_delete+1);
            }else{
                numbs++;

            }
        }
        return min_delete;
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        int swaps = 0;
        for (int i = 1; i <= A.length ; ++i) {
            // if (A[i] >= A[i + 1]) {
            //     int tmp = A[i + 1];
            //     A[i + 1] = A[i] + 1;
            swaps += Math.abs(A[i-1] - i);
            // }
        }

        return swaps;
    }

    public int solution(int[] X, int[] Y) {
        int maxWidth =0;
        Arrays.sort(X);
        for(int i=0;i<X.length-1;i++){
            maxWidth = Math.max(maxWidth, X[i+1]-X[i]);
        }

        return maxWidth;
    }

    public static void main(String args[]){
//        System.out.println(solution("BBABAA"));
        int [] a = {6,2,3,5,6,3};
        System.out.println(solution(a));


    }

}
