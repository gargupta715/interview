import java.util.stream.*;

public class KSJF {


    //emp_number name		Salary	dept_id
    //1002		Anderson	57500	500
    //1004		Horvath		42000	501
    //1001		Smith		62000	500
    //1003		Everest		71000	501
    //1005		James		50000	501

    public static void main(String args[]){
//        IntStream.range(0,10).forEach();
        // select * from employee order by salary DESC
        // LIMIT 3,1;
        // partion by 7
        // Given an array of integers nums and an integer target,
        // return indices of the two numbers such that
        // they add up to target. nums = [2,7,11,15], target = 9
        int[] arr = {2,7,11,15};
        int[] indices = findindices(arr, 9);
        System.out.println(indices[0] + " - " + indices[1]);
    }

    public static int[] findindices(int[] arr, int num){
        int n = arr.length;
        int[] indices = new int[2];
        int[][] dp = new int[n+1][num+1];

        if(arr.length < 2)
            System.out.println("no pair exist");
        else {
            calindices(dp, arr, n, num);
            indices[0] = dp.length;
            indices[1] = dp[0].length;
        }
        return indices;
    }

    private static int calindices(int[][] dp, int[] arr, int n, int num) {
        if(dp[n][num] == num)
            return dp[n][num];

        if(arr[n] < num){
            return dp[n][num] = calindices(dp, arr, n-1, num-arr[n]) + calindices(dp, arr, n, num);
        }
        else
            return dp[n][num] = calindices(dp,arr, n, num);

    }
}
