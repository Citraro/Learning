import java.util.*;

class Program {
  public static int findClosestValueInBst(BST tree, int target) {		
		return findClosestValueInBstHelper(tree, target, tree.value);
  }
	
	public static int findClosestValueInBstHelper(BST tree, int target, int closet) {
    
		if(tree == null){
			return closet;
		}
		
		if(Math.abs(closet - target) > Math.abs(target - tree.value)){
			closet = tree.value;
		}
		
		if(target < tree.value){
			return findClosestValueInBstHelper(tree.left, target, closet);
		}else if(target > tree.value){
			return findClosestValueInBstHelper(tree.right, target, closet);
		}else{
			return closet;
		}
  }

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}
