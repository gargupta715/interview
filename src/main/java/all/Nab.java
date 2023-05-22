package all;

import java.util.Objects;

public class Nab {
    public static void main(String args[]) {
    // Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        //ot: 4,-1,2,1= 6
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(findSum(nums));
    }

    private static int findSum(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int n = nums.length;
        // {-2,1,-3,4,-1,2,1,-5,4};
        for(int k =1;k<n;k++){
            int sum = 0;
            for(int i=0;i<k;i++){
                sum =  sum + nums[i];
            }
            if(maxsum < sum){
                maxsum = sum;
            }
        }

        return maxsum;
    }

}
