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
    public int goodNodes(TreeNode root) {
        if(root == null) return 0;
        return 1 + helper(root.left,root.val) + helper(root.right,root.val);
    }
    
    public int helper(TreeNode root, int maxValue){
        if(root == null) return 0;
        
        int count = 0;
        
        if(root.val >= maxValue){
            count++;
        }
        
        count += helper(root.left, Math.max(root.val,maxValue)) + helper(root.right, Math.max(root.val,maxValue));
        return count;
    }
}
