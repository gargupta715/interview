import java.math.BigInteger;

public class Arr {
    // String s1= "12345" nad S2 ="879879"

    public static void main(String args[]){
        // 8888170778957643999888817077895764399988881707
        String s1= "789576439998888170778957"; // 14
        String s2= "335515"; // 6
        System.out.println(addTwoString(s1, s2));
    }
    private static String addTwoString(String s1, String s2) {
        if(s1== null || s2 == null)
            return null;
        StringBuilder s11 = new StringBuilder(s1);
        String news1= s11.reverse().toString();
        char[] ch1 = news1.toCharArray();

        StringBuilder s12 = new StringBuilder(s2);
        String news2= s12.reverse().toString();
        char[] ch2 = news2.toCharArray();

        for(int i = 0 ;i< ch1.length;i++){
            {
                for(int j=0;j<ch2.length;i++){

                    int a = (int)ch1[0] + (int) ch2[0];
                }
            }
        }

        return null;

    }
}
