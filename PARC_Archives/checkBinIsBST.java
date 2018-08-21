//Check whether a binary tree is BST or not.

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int data){val = data;}
}

class Solution{
	public boolean checkIfBST(TreeNode root){
		return traverseTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	private boolean traverseTree(TreeNode node, int min, int max){
		if(node==null)
			return true;
		if(node.val<min || node.val>max)
			return false;
		return (traverseTree(node.left, min, node.val-1) && traverseTree(node.right, node.data+1, max));

	}
}