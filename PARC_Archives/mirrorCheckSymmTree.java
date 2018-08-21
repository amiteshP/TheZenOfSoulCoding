//Mirror of a binary tree, additionally check if the tree is symmetric/foldable

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int data){val=data;}
}

class Solution{
	public TreeNode returnMirroredTree(TreeNode root){
		reverseTreeNodes(root);
		return root;
	}
	private void reverseTreeNodes(TreeNode node){
		if(node.left!=null || node.right!=null){
			TreeNode temp = node.right;
			node.right = node.left;
			node.left = temp;
		}
		if(node.left!=null)
			reverseTreeNodes(node.left);
		if(node.right!=null)
			reverseTreeNodes(node.right);
	}
	private boolean checkSymmetry(TreeNode root, TreeNode mirrorRoot){
		if(root==null && mirrorRoot==null)
			return true;

		if(root!=null && mirrorRoot!=null && root.val==mirrorRoot.val){
			return (checkSymmetry(root.left , mirrorRoot.right) && checkSymmetry(root.right, mirrorRoot.left));
		}

		return false;
	}
}