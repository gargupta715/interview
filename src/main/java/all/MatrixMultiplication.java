import java.util.*;

public class MatrixMultiplication {

    static class Pair{
        int first;
        int second;

        Pair(int i, int j){
            this.first=i;
            this.second=j;
        }
    }
    public static void main(String[] args){
//        int[][] a = {{1,2,3},{4,5,6}};
//        int[][] b = {{7,8,9},{3,5,6}};
//        mulMatrix(a,b);
        //Print all pairs in an unsorted array with equal sum
        //Input: A[] = { 1, 2, 3, 4, 5}
        //Expected Output:
        //List of Lists {
        // {(1, 4),(2, 3)},
        // {(1, 5),(2, 4)},
        // {(2, 5),(3, 4)}
        // }

        int[] arr = { 1, 2, 3, 4, 5};
        allPair(arr);
    }

    private static void allPair(int[] arr) {
        int size = arr.length;
        Map<Integer, Set<Pair>> map = new HashMap();

        // 1, 2, 3, 4, 5
        for(int i =0;i< size;i++){
            Set<Pair> ll = new HashSet<>();
            for(int j = i+1;j<size;j++){
                Pair p = new Pair(arr[i], arr[j]);
                ll.add(p);
                if(map.containsKey(arr[i] + arr[j])){
                    map.get(arr[i] + arr[j]).add(p);
                }else {
                    map.put(arr[i] + arr[j], ll);
                }
            }
        }
        //

        for(Map.Entry<Integer, Set<Pair>> m: map.entrySet()){
            for(int i=0; i< m.getValue().size();i++){
                System.out.println("{" + m.getValue().iterator().next().first + "," + m.getValue().iterator().next().second + "}");
            }
        }
    }



    private static void mulMatrix(int[][] a, int[][] b) {
        int row = a.length;
        int col = a[0].length;
        int[][] c = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0;j<col;j++){
                c[i][j] = a[i][j] * b[i][j];
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0;j<col;j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }


}
