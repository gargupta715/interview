package all;

import java.util.Arrays;

public class Perst2 {
    public static void main(String args[]){
        int[] ar ={1,2,3,5,5,6};
        System.out.println(missingNumber(ar));
    }

    public static int missingNumber(int[] nums) { //binary search
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length;//6
        int mid= 0 ;// (left + right)/2;
        while(left<right){//(4<6)- 4<5
            mid = (left + right)/2; // 3-5-4
            if(nums[mid]>mid) right = mid; // 5->4
            else left = mid+1; // 4
        }
        return left;
    }
}
