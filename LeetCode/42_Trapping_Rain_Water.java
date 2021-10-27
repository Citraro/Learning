class Solution {
    public int trap(int[] height) {
        
        if(height.length <= 2) return 0;
        
        int totalTrapped = 0;
        int leftIndex = 0;
        int rightIndex = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        
        while(leftIndex < rightIndex){
            leftMax = Math.max(leftMax, height[leftIndex]);
            rightMax = Math.max(rightMax, height[rightIndex]);
            if(leftMax <= rightMax){
                totalTrapped += leftMax - height[leftIndex];
                leftIndex++;
            }else if (leftMax > rightMax) {
                totalTrapped += rightMax - height[rightIndex];
                rightIndex--;
            }
        }
        return totalTrapped;
    }
}
