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
    public TreeNode bstFromPreorder(int[] preorder) {
        
        TreeNode root = null;
        
        for(int node : preorder){
            root = bst(root,node);
        }
        
        return root;
        
    }
    
    private TreeNode bst(TreeNode root, int node){
        if(root == null){
            return root = new TreeNode(node);
        }
        
        if(root.val > node){
            root.left = bst(root.left,node);
        }else{
            root.right = bst(root.right,node);
        }
        
        return root;
        
    }
}
