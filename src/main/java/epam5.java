public class epam5 {
    public static int optimalPath(int[][] arr) {

        int row = arr.length;
        int col = arr[0].length;
        int[][] dp = new int[row][col];
        for(int i=0; i<row;i++){
            for(int j=col-1;j>=0;j--){
                if(i == 0 && j == col-1) dp[i][j] = arr[i][j];
                else if(i == 0) dp[i][j] = arr[i][j] + dp[i][j+1];
                else if(j==col-1) dp[i][j] = arr[i][j] + dp[i-1][j];
                else dp[i][j] = arr[i][j] + Math.max(dp[i-1][j], dp[i][j+1]);
            }
        }
        return dp[row-1][0];
    }

    static int arr[]
            = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
    static int findWater(int n)
    {
        // left[i] contains height of tallest bar to the
        // left of i'th bar including itself
        int left[] = new int[n];

        // Right [i] contains height of tallest bar to
        // the right of ith bar including itself
        int right[] = new int[n];

        // Initialize result
        int water = 0;

        // Fill left array
        left[0] = arr[0];
        for (int i = 1; i < n; i++)
            left[i] = Math.max(left[i - 1], arr[i]);

        // Fill right array
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--)
            right[i] = Math.max(right[i + 1], arr[i]);

        // Calculate the accumulated water element by
        // element consider the amount of water on i'th bar,
        // the amount of water accumulated on this
        // particular bar will be equal to min(left[i],
        // right[i]) - arr[i] .
        for (int i = 0; i < n; i++)
            water += Math.min(left[i], right[i]) - arr[i];

        return water;
    }

}
