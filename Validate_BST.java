import java.util.*;

class Program {
  public static boolean validateBst(BST tree) {
    int minVal = Integer.MIN_VALUE;
		int maxVal = Integer.MAX_VALUE;
    return validate(tree,minVal,maxVal);
  }
	
	public static boolean validate(BST tree, int min, int max) {
		if(tree.value < min || tree.value >= max) {
			return false;
		}
		if(tree.left != null && !validate(tree.left, min, tree.value)){
			return false;
		}
		if(tree.right != null && !validate(tree.right, tree.value, max)){
			return false;
		}
		return true;
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
