class Solution {
    public int maxProduct(int[] nums) {
        
        if(nums.length == 1)
            return nums[0];
        
        int maxProd = nums[0];
        int negativeProd = nums[0];
        int currentProd = nums[0];
        int prod = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            currentProd = prod * nums[i];
            prod = Math.max(nums[i],Math.max(currentProd, nums[i] * negativeProd));
            negativeProd = Math.min(nums[i],Math.min(currentProd, nums[i] * negativeProd));
            
            maxProd = Math.max(maxProd,prod);
        }
        
        return maxProd;
        
    }
}