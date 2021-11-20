/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        
        TreeNode root = helper(nums,0,nums.length - 1);
        return root;
    }
    
    
    public TreeNode helper(int[] nums, int start, int end){
        if(start > end){
            return null;
        }
        
        int maxIndex = findMax(nums,start,end);
        
        TreeNode root = new TreeNode(nums[maxIndex]);
        
        root.left = helper(nums,start, maxIndex - 1);
        root.right = helper(nums,maxIndex + 1, end);
        
        return root;
    }
    
    public int findMax(int[] nums, int start, int end){
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for(int i = start; i <= end; i++){
            if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
