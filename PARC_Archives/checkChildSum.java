//Check if the child sum property of a binary tree holds.
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int data){val = data;}
}

class Solution{
	public boolean checkChildrenSum(TreeNode root){
		if(root==null)
			return true;
		int childSum = 0;
		if(root.left!=null)
			childSum+=root.left.val;
		if(root.right!=null)
			childSum+=root.right.val;
		if(childSum!=0 && childSum!=root.val)
			return false;
		return (checkChildrenSum(root.left) && checkChildrenSum(root.right));

	}
}