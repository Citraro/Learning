class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int count = 0;
        
        for(int i = 0; i < nums.length; i++){
            count = Math.max(nums[i], count + nums[i]);
            maxSum = Math.max(count, maxSum);
        }
        
        return maxSum;
        
    }
}