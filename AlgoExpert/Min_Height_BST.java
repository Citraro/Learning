import java.util.*;

class Program {
  public static BST minHeightBst(List<Integer> array) {
    return constructMinHeightBST(array,null,0,array.size() - 1);
  }
	
	public static BST constructMinHeightBST(List<Integer> array, BST bst, int startIndex, int endIndex) {
		if (endIndex < startIndex) return null;
		int middleIndex = (startIndex + endIndex) / 2;
		int valueToAdd = array.get(middleIndex);
		if(bst == null){
			bst = new BST(valueToAdd);
		} else {
			bst.insert(valueToAdd);
		}
		constructMinHeightBST(array,bst,startIndex, middleIndex - 1);
		constructMinHeightBST(array,bst,middleIndex + 1, endIndex);
		return bst;
		
	}

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
      left = null;
      right = null;
    }

    public void insert(int value) {
      if (value < this.value) {
        if (left == null) {
          left = new BST(value);
        } else {
          left.insert(value);
        }
      } else {
        if (right == null) {
          right = new BST(value);
        } else {
          right.insert(value);
        }
      }
    }
  }
}
