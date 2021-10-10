class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int left = 0;
        int right = numbers.length - 1;
        
        while(left <= right){
            
            int rightNum = target - numbers[left];
            
            if(rightNum == numbers[right]){
                return new int[]{left+1,right+1};
            }
            else if(rightNum < numbers[right]){
                right--;
            }else{
                left++;
            }
        }
        
        return new int[0];
    }
}
