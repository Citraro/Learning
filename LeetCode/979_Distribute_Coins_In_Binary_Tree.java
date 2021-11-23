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
    
    static int moves;
    
    public int distributeCoins(TreeNode root) {
        moves = 0;
        returnLeftoverAmount(root);
        return moves;
    }
    
    private int returnLeftoverAmount(TreeNode root){
        if(root == null) return 0;
        
        int left = returnLeftoverAmount(root.left);
        int right = returnLeftoverAmount(root.right);
        int ret = left + right + root.val - 1;
        moves += Math.abs(ret);
        return ret;
    }
}
