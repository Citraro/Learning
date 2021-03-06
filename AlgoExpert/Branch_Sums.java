import java.util.*;

class Program {
  // This is the class of the input root. Do not edit it.
  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }

  public static List<Integer> branchSums(BinaryTree root) {
		List<Integer> sums = new ArrayList<Integer>();
    branchSumsHelper(root, sums,0);
		return sums;
  }
	
	public static void branchSumsHelper(BinaryTree root,List<Integer> sums,int currentSums){
		
		if(root == null){
			return;
		}
		
		int newSum = currentSums + root.value;
		if(root.left == null && root.right == null)
		{
			sums.add(newSum);
		}
		
		
		branchSumsHelper(root.left,sums,newSum);
		branchSumsHelper(root.right,sums,newSum);
		
	}
}
