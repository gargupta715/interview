package all;

import java.util.*;
public class SumOfSubArray {
    public static void main(String args[]){
        int[] ar = { -2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(findSum(ar));
        int[] ar1= {1, 1, 4, 7, 3, 6};
        System.out.println(largestSum(ar1, ar1.length));
        // Kadane’s algorithm
    }
//Initialize:
//    max_so_far = INT_MIN
//    max_ending_here = 0
//
//Loop for each element of the array
//
//  (a) max_ending_here = max_ending_here + a[i]
//  (b) if(max_so_far < max_ending_here)
//            max_so_far = max_ending_here
//  (c) if(max_ending_here < 0)
//            max_ending_here = 0
//return max_so_far

    public static int findSum(int[] arr){
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        int start = 0, end = 0,s = 0;
        for (int i=0;i<arr.length;i++) {
            max_ending_here = max_ending_here + arr[i];
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
                s = i+1;
            }
        }
        System.out.println(start + " , "+ end);
        return max_so_far;

    }

    // Returns sum of longest increasing subarray.
    static int largestSum(int arr[], int n) {
        // Initialize result
        int result = -9999999;

        // Note that i is incremented
        // by inner loop also, so overall
        // time complexity is O(n)
        for (int i = 0; i < n; i++) {
            // Find sum of longest
            // increasing subarray
            // starting from arr[i]
            int curr_sum = arr[i];
            while (i + 1 < n && arr[i + 1] > arr[i]) {
                curr_sum += arr[i + 1];
                i++;
            }

            // Update result if required
            if (curr_sum > result)
                result = curr_sum;
        }
        return result;
    }
// K-th Largest Sum Contiguous Subarray
// brute force  Store all the contiguous sums in another array and sort it and print the Kth largest.
// using Min-Heap:
//Create a prefix sum array of the input array
//Create a Min-Heap that stores the subarray sum
//Iterate over the given array using the variable i such that 1 <= i <= N, here i denotes the starting point of the subarray
//Create a nested loop inside this loop using a variable j such that i <= j <= N, here j denotes the ending point of the subarray
//Calculate the sum of the current subarray represented by i and j, using the prefix sum array
//If the size of the Min-Heap is less than K, then push this sum into the heap
//Otherwise, if the current sum is greater than the root of the Min-Heap, then pop out the root and push the current sum into the Min-Heap
//Now the root of the Min-Heap denotes the Kth largest sum, Return it


    static int kthLargestSum(int arr[], int N, int K) // k=6
    {
        //{10, -10, 20, -40 };
        // array to store prefix sums
        int sum[] = new int[N + 1];
        sum[0] = 0;
        sum[1] = arr[0]; //{0, 10, 0, 20, -20}
        for (int i = 2; i <= N; i++) // N=4
            sum[i] = sum[i - 1] + arr[i - 1];

        // priority_queue of min heap
        PriorityQueue<Integer> Q
                = new PriorityQueue<>();

        // loop to calculate the contiguous subarray
        // sum position-wise
        for (int i = 1; i <= N; i++) {

            // loop to traverse all positions that
            // form contiguous subarray
            for (int j = i; j <= N; j++) {
                // calculates the contiguous subarray
                // sum from j to i index
                int x = sum[j] - sum[i - 1];// {0, 10, 0, 20, -20} 10->-0->20->-20->-10->10

                // if queue has less than k elements,
                // then simply push it
                if (Q.size() < K)
                    Q.add(x);

                else {
                    // it the min heap has equal to
                    // k elements then just check
                    // if the largest kth element is
                    // smaller than x then insert
                    // else its of no use
                    if (Q.peek() < x) {
                        Q.poll();
                        Q.add(x);
                    }
                }
            }
        }

        // the top element will be then kth
        // largest element
        return Q.poll();
    }
}