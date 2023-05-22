import java.util.function.BiFunction;
import java.util.function.Function;

public class zemoso {
    public static void main(String args[]){

//        Function <Integer, Integer> f = (i) -> i*2;
//        System.out.println(f.apply(10));
        String s = "ABC";
        printPermutation(s, 0, s.length()-1 );
    }

    public static void printPermutation(String s, int l, int r){ // 0, 2
        // ABC // factorial way
        //
        if(l==r)
        {
            System.out.println(s);
        }else{
            for(int i=l;i< s.length();i++){// 0->3
                s = swapElements(s, l, i); // 0, 0
                printPermutation(s, l+1, r); // 1, 2
                s = swapElements(s, l, i);//

            }
        }

    }

    private static String swapElements(String s, int l, int r) {
        char[] chars = s.toCharArray(); // ABC
        char temp = chars[l];
        chars[l] = chars[r];
        chars[r] = temp;
        return String.valueOf(chars);
    }
}


