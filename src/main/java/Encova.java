import java.util.Arrays;

public class Encova {
    public static void main(String args[]){
//        // int
//        int[] ar = {4,5,2,7,8,9};
//        int max = Integer.MIN_VALUE;
//        int secondMax = max;
//        for(int i=0;i< ar.length;i++){
//            if(max < ar[i]){
//                secondMax = max; //8
//                max = ar[i]; // 9
//            }else{
//                if(secondMax < ar[i] && secondMax < max)
//                {
//                    secondMax = ar[i];
//                }
//            }
//
//        }
//        System.out.println(secondMax);

        // Input:  {{1,    2,   3,   4},
        //              {5,    6,   7,   8},
        //             {9,   10,  11,  12},
        //            {13,  14,  15,  16 }}
        //Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10


//        int[][] ar = {
//                {1,    2,   3,   4},
//                {5,    6,   7,   8},
//                {9,   10,  11,  12},
//                {13,  14,  15,  16}};
//        int row = ar.length;
//        int col = ar[0].length;

        // Input:N = 5arr[] = {0, 0, 1, 1, 0} Output: 0 0 0 1 1

        int[] arr =  {0, 0, 1, 1, 0};
        int len = arr.length;
        int k =0;
        for(int i=0;i< len;i++){
            for(int j=len-1;j>i;j--){
                if(arr[i] == 1 && arr[j]==0){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] =temp;
                }
            }
        }
//        for(int i =0 ;i< len;i++){
//           if(arr[i] ==1 ){
//               swapElement(arr, i , k);
//               k++;
//            }
//        }


        Arrays.stream(arr).forEach(System.out::println);
    }
    private static void swapElement(int[] arr, int i, int k) {
        int temp = arr[k];

    }
}
