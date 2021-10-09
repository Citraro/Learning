class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length - 1;
        
        if(nums.length < 3){
            if(target == nums[left]){
                return left;
            }else if (target < nums[left]){
                return left;
            }else if (target == nums[right]){
                return right;
            }else if (target < nums[right]){
                return right;
            }else{
                right++;
                return right;
            }
        }
        
        while(left <= right){
            if(nums[left] == target){
                return left;
            }else if (nums[left] > target){
                return left;
            }else if (nums[right] == target){
                return right;
            }else if (nums[right] < target){
                right++;
                return right;
            }
            left++;
            right--;
        }
        
        right++;
        return right;
    }
}