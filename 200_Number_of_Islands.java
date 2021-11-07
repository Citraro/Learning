class Solution {
    public int numIslands(char[][] grid) {

        if(grid == null || grid.length == 0){
            return 0;
        }
        
        int numOfIslands = 0;
        
        for(int m = 0; m < grid.length; m++){
            for(int n = 0; n < grid[0].length; n++){
                if(grid[m][n] == '1'){
                    numOfIslands += DFS(grid,m,n);
                }
            }
        }
        return numOfIslands;
    }
    
    public int DFS(char[][] grid, int m, int n){
        if(m < 0 || m >= grid.length || n < 0 || n >= grid[0].length || grid[m][n] == '0'){
            return 0;
        }
        
        grid[m][n] = '0';
        
        //above
        DFS(grid,m-1,n);
        
        //below
        DFS(grid,m+1,n);
        
        //left
        DFS(grid,m,n-1);
        
        //right
        DFS(grid,m,n+1);
        
        return 1;
    }
}
