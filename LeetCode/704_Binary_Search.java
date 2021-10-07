class Solution {
    public int search(int[] nums, int target) {
        return search(nums,0,nums.length-1,target);
    }
    
    public int search(int[] nums, int start, int end, int target){
        
        if(start == end){
            if(nums[start] == target){
                return start;
            }else{
                return -1;
            }
        }else if(start == end - 1){
            if(nums[start] == target){
                return start;
            }else if (nums[end] == target){
                return end;
            }else{
                return -1;
            }
        } else {
            int mid = (start+end) / 2;
            
            int temp = nums[mid];
            
            if(temp == target){
                return mid;
            }else if (temp > target){
                return search(nums,0,mid,target);
            }else {
                return search(nums,mid,end,target);
            }
        }
    }
}