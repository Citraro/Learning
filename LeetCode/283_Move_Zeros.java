class Solution {
    public void moveZeroes(int[] nums) {        
        
        int pointer = 0;
        int nonZeroPointer = 0;
        
        while(pointer < nums.length){
            if(nums[pointer] != 0){
                nums[nonZeroPointer++] = nums[pointer++];
            }else{
                pointer++;
            }
        }
        
        while(nonZeroPointer < nums.length){
            nums[nonZeroPointer++] = 0;
        }
    }
}
