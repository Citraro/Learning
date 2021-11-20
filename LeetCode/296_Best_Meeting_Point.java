class Solution {
    public int minTotalDistance(int[][] grid) {
        List<Integer> X = new ArrayList<>();
        List<Integer> Y = new ArrayList<>();
        
        //o(x*y)
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    X.add(i);
                    Y.add(j);
                }
            }
        }
        
        return getMin(X) + getMin(Y);
    }
    
    
    public int getMin(List<Integer> nums){
        Collections.sort(nums); // o(nlogn)
        int result = 0;
        
        int mid = nums.get(nums.size() / 2);
        for(int num : nums){
            result += Math.abs(num - mid);
        }
        return result;
    }
}
