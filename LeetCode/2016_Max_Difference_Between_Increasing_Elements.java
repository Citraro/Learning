class Solution {
    public int maximumDifference(int[] nums) {
        int max = -1;
        int smallest = nums[0];
        for(int index = 1; index < nums.length; index++){
            if(nums[index] > smallest){
                max = Math.max(max, nums[index] - smallest);
            }
            smallest = Math.min(smallest,nums[index]);
        }
        return max;
    }
}
