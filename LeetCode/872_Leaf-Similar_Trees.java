class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        helper(root1,a1);
        helper(root2,a2);
        return a1.equals(a2);
    }
    public void helper(TreeNode root,List<Integer> array){
        if(root == null) return;
        
        if(root.left == null && root.right == null){
           array.add(root.val);
        }
        helper(root.left,array);
        helper(root.right,array);
        
    }
}
