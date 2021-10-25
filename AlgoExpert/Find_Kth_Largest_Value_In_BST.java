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
	
	class TreeInfo {
		public int numberOfNodesVisited;
		public int lastestVisitedNodeValue;
		
		public TreeInfo(int _numberOfNodesVisited, int _lastestVisitedNodeValue){
			this.numberOfNodesVisited = _numberOfNodesVisited;
			this.lastestVisitedNodeValue = _lastestVisitedNodeValue;
		}
	}

  public int findKthLargestValueInBst(BST tree, int k) {
    TreeInfo treeInfo = new TreeInfo(0, -1);
    reverseInOrderTraverse(tree,k,treeInfo);
		return treeInfo.lastestVisitedNodeValue;
  }
	
	public void reverseInOrderTraverse(BST tree, int k, TreeInfo treeInfo){
		if(tree == null || treeInfo.numberOfNodesVisited >= k){
			return;
		}
		
		reverseInOrderTraverse(tree.right, k, treeInfo);
		if (treeInfo.numberOfNodesVisited < k){
			treeInfo.numberOfNodesVisited++;
			treeInfo.lastestVisitedNodeValue = tree.value;
			reverseInOrderTraverse(tree.left,k,treeInfo);
		}
		
	}
}
