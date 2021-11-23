class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int duplicates = 0;
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                duplicates++;
            }
            
            nums[i - duplicates] = nums[i];
        }
        
        return nums.length - duplicates;
    }
}
