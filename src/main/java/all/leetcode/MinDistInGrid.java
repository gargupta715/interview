package leetcode;

public class MinDistInGrid {
    public static void main(String args[]){
        char[][] grid = {
                {'H','O','I','J','L'},
                {'K','E','S','A','S'},
                {'H','K','L','L','O'}
        };//new char[3][5];
        System.out.println(isExist(grid, "Hello"));
    }

    static boolean isExist(char[][] grid, String word){
        for(int i=0;i< grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j] ==word.charAt(0) && dfs(grid, i, j,0, word))
                    return true;
            }
        }
        return true;
    }

    private static boolean dfs(char[][] grid, int i, int j, int count, String word) {
        if(count == word.length())
            return true;
        if(i== -1 || i == grid.length || j ==-1 ||j==grid[0].length || grid[i][j] != word.charAt(count))
            return false;
        char temp =  grid[i][j];
        grid[i][j] = '*';
        boolean found = dfs(grid, i-1, j, count, word) ||
                dfs(grid, i+1, j, count, word)||
                dfs(grid, i, j-1, count, word) ||
                dfs(grid, i, j+1, count, word);

        grid[i][j] =temp;
        return found;
    }
}
