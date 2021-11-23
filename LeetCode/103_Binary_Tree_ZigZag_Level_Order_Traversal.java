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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        printZigZag(result, root, 0);
        return result;
    }
    
    
    public void printZigZag(List<List<Integer>> result, TreeNode root, int level){
        if(root == null) return;
        
        if(result.size() <= level){
            result.add(new ArrayList<>());
        }
        
        if(level % 2 == 0){
            result.get(level).add(root.val);
        }else{
            result.get(level).add(0,root.val);
        }
        
        printZigZag(result, root.left, level + 1);
        printZigZag(result, root.right, level + 1);
        
    }
}
