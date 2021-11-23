class Solution {
    public int candy(int[] ratings) {
        if(ratings.length == 0) return 0;
        int len = ratings.length;
        int[] result = new int[len];
        Arrays.fill(result,1);
        
        for(int i = 1; i < len; i++){
            if(ratings[i] > ratings[i - 1]){
                result[i] = result[i - 1] + 1;
            }
        }
        
        for(int i = len - 1; i > 0; i--){
            if(ratings[i - 1] > ratings[i]){
                result[i - 1] = Math.max(result[i] + 1, result[i - 1]);
            }
        }
        int candiesGiven = 0;
        for(int candies : result) candiesGiven += candies;
        return candiesGiven;
    }
}
