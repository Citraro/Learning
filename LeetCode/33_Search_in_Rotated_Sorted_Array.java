class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0){
            return -1;
        }
        if(nums.length == 1){
            return nums[0] == target ? 0 : -1;
        }
                
        int index = binarySearch(nums,target,0,nums.length - 1);
        return index;
    }
    
    public int binarySearch(int[] nums, int target, int start, int end){
        
        if(start > end){
            return -1;
        }
        
        int middle = start + (end - start) / 2;
        
        int numAtStart = nums[start];
        int numAtEnd   = nums[end];
        int numAtMiddle= nums[middle];
        

        
        if(numAtStart == target){
            return start;
        }
        if(numAtEnd == target){
            return end;
        }
        if(numAtMiddle == target){
            return middle;
        }
        
        int returnVal = -1;
        
        if(numAtStart <= numAtMiddle){
            if(target >= numAtStart && target < numAtMiddle){
                returnVal = binarySearch(nums,target,start+1, middle - 1);
            }else{
                returnVal = binarySearch(nums,target,middle + 1, end - 1);
            }
        }else{
            if(target > numAtMiddle && target <= numAtEnd){
                returnVal = binarySearch(nums,target,middle + 1, end - 1);
            }else{
                returnVal = binarySearch(nums,target,start+1, middle - 1);
            }
        }
        return returnVal;
    }
}
