public class epam2 {
    public static void main(String args[]){
        String inputStr = "bananas"; // ana, anana, nan
        // identify all possible unique palindrome substrings
        findPalimdrome(inputStr);

    }

    private static void findPalimdrome(String inputStr) {
        int n = inputStr.length();
        boolean[][] d = new boolean[n][n];
        for(int i=0;i< inputStr.length();i++){
            for(int j=0;j< n;j++)
            {
                if(i==0){
                    d[i][j] =  true;
                }else if(i==1){
                    d[i][j] = inputStr.charAt(i) == inputStr.charAt(j);
                }else{
                    d[i][j] = inputStr.charAt(i) == inputStr.charAt(j) && d[i+1][j-1];
                }

                if(d[i][j])
                    System.out.println(inputStr.substring(i, j+1));
            }
        }
    }
}
