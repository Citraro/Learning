import java.util.*;

class Program {
  // This is an input class. Do not edit.
  static class BST {
    public int value;
    public BST left = null;
    public BST right = null;

    public BST(int value) {
      this.value = value;
    }
  }
	
	static class TreeInfo {
		public int rootIndex;
		
		public TreeInfo(int rootIndex) {
			this.rootIndex = rootIndex;
		}
	}

  public BST reconstructBst(ArrayList<Integer> preOrderTraversalValues) {
    TreeInfo treeInfo = new TreeInfo(0);
		
    return helper(Integer.MIN_VALUE, Integer.MAX_VALUE, preOrderTraversalValues, treeInfo);
  }
	
	public BST helper(int lowerBound, 
										int upperBound, 
										List<Integer> values, 
										TreeInfo currentSubTreeInfo) 
	{
		if(currentSubTreeInfo.rootIndex == values.size()) return null;
		
		int rootValue = values.get(currentSubTreeInfo.rootIndex);
		if(rootValue < lowerBound || rootValue >= upperBound) return null;
		
		currentSubTreeInfo.rootIndex++;
		BST leftSubTree = helper(lowerBound, rootValue, values, currentSubTreeInfo);
		BST rightSubTree = helper(rootValue, upperBound, values, currentSubTreeInfo);
		
		BST bst = new BST(rootValue);
		bst.left = leftSubTree;
		bst.right = rightSubTree;
		return bst;
	}
}
