import java.util.LinkedList;

class Node{
    int value;
    Node next;

    boolean isVisited;

    Node(int value){
        this.value = value;
        this.next = null;
        this.isVisited = false;
    }
}
public class DiagonalPrint {
    static Node root;
    public static void main(String args[]){
//        int[][] arr= {
//                {1,2,3,4,5},
//                {6,7,8,9,10},
//                {11,12,13,14,15},
//                {16,17,18,19,20},
//                {21,22,23,24,25}
//        };
//        //1 7 13 19 25
//        //2 8 14 20
//        //3 9 15
//        //4 10
//        //5
//        int[][] arr1= new int[5][5];
//
//        for(int i=0;i< arr.length;i++){
//            for(int j=0;j<arr.length;j++){
//                if(j>=i){
//                    arr1[j][i] = arr[i][j];
//                }
//            }
//        }
//
//        for(int i=0;i< 5;i++) {
//            for (int j = 0; j < 5; j++) {
//                if(arr1[i][j] > 0)
//                    System.out.print(arr1[i][j]);
//                System.out.print(" ");
//
//            }
//            System.out.println();
//        }
            System.out.println(isCircular(root));



    }

    private static boolean isCircular(Node root) {
        if(root == null)
            return false;

        while(root.next != null){
            if(!root.isVisited) {
                root = root.next;
                root.isVisited = true;
            }
            else
                return true;
        }
        return false;
    }
}
