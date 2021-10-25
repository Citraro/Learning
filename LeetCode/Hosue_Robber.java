class Solution {
    public int rob(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }
        
        if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }
        
        int twoBeforeMax = nums[0];
        int oneBeforeMax = Math.max(nums[0], nums[1]);
        
        int currentMax = -1;
        
        for(int i = 2; i < nums.length; i++){
            currentMax = Math.max(twoBeforeMax + nums[i], oneBeforeMax);
            twoBeforeMax = oneBeforeMax;
            oneBeforeMax = currentMax;
        }
        
        return currentMax;
    }
}
