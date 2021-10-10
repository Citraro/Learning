class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] returnArr = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int pos = nums.length - 1;
        
        while(left <= right){
            if((nums[left]*nums[left]) > (nums[right]*nums[right])){
                returnArr[pos] = nums[left] * nums[left];
                left++;
                pos--;
            }else{
                returnArr[pos] = nums[right] * nums[right];
                right--;
                pos--;
            }
        }
        
        
        return returnArr;
    }
}
