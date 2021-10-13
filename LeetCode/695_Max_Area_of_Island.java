class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        int count = 0;
        
        for(int x = 0; x < grid.length; x++){
            for(int y =0; y < grid[0].length; y++){
                if(grid[x][y] == 1){
                    count = Math.max(count,dfs(grid,x,y));
                }
            }
        }
        
        return count;
    }
    
    public int dfs(int[][] grid, int x, int y){
        
        if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == 0){
            return 0;
        }
        
        grid[x][y] = 0; // we've seen and counted;
        
        int currentAreaOfIsland = 1;
        currentAreaOfIsland += dfs(grid,x+1,y);
        currentAreaOfIsland += dfs(grid,x-1,y);
        currentAreaOfIsland += dfs(grid,x,y+1);
        currentAreaOfIsland += dfs(grid,x,y-1);
        
        return currentAreaOfIsland;    
    }
}
