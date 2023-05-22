import java.util.*;

public class ArithmeticProgeress {
    public static void main(String[] args) throws Exception {
//        Test6 test = new Test6();
//        test.test();
        //find the first missing number in an AP
        // [2,4,6,10]  [2,6,8,10]
        //Answer is 8

        // l-a/n = will give diff of elements
        //sum n/2(a+l) a is first and l is last element if a+l % 2==0

        int[] arr = {2, 6, 8, 10};
        int first = arr[0];
        int diff = arr[0];
        List<Integer> ll = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - first == diff) {
                first = arr[i];
            } else {
                ll.add(first + diff);
                first = arr[i];
            }
        }
        ll.forEach(integer -> System.out.println(integer));
    }

    static int missingElementAP(int arr[], int n) {
        // Common Difference
        int d = (arr[n - 1] - arr[0]) / n;
        int low = 0;
        int high = n - 1;

        while (low < high) {
            // Find the middle index
            int mid = low + (high - low) / 2;

            // if mid and the immediate next element to mid are not in AP, then missing
            // element is arr[mid] + d.
            if (arr[mid + 1] - arr[mid] != d)
                return arr[mid] + d;

            // if mid and the immediate previous element to mid are not in AP, then missing
            // element is arr[mid-1] + d.
            if (mid > 0 && arr[mid] - arr[mid - 1] != d)
                return arr[mid - 1] + d;

            // if elements of the left half are in AP, then missing element is in right
            // half.
            if (arr[mid] == arr[0] + mid * d)
                low = mid + 1;

                // else missing element is in the left half.
            else
                high = mid - 1;
        }

        // Invalid Input
        return Integer.MAX_VALUE;
    }
}