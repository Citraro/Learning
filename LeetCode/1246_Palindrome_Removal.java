class Solution {
    public int minimumMoves(int[] arr) {
        int size = arr.length;
        
        int[][] dp = new int[size+1][size+1];
        for(int len = 1; len <= size; len++){
            for(int i = 0, j = len - 1; j < size; i++, j++){
                if(len == 1){
                    dp[i][j] = 1;
                    continue;
                }
                
                dp[i][j] = 1 + dp[i+1][j];
                
                if(arr[i] == arr[i + 1]){
                    dp[i][j] = Math.min(dp[i][j], 1 + dp[i+2][j]);
                }
                if(arr[i] == arr[j] && j > i + 1){
                    dp[i][j] = Math.min(dp[i][j], dp[i + 1][j - 1]);
                }
                
                for(int k = i + 2; k < j; k++){
                    if(arr[i] == arr[k]){
                        dp[i][j] = Math.min(dp[i][j], dp[i + 1][k - 1] + dp[k + 1][j]);
                    }
                }
            }
        }
        
        return dp[0][size-1];
    }
}
