class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int num){
		val = num;
	}
}

class Solution{
	public boolean isSumTree(TreeNode root){
		if(root==null || (root.left==null && root.right==null))
			return true;

		int rootVal = rootVal;

		int lSum = sumTree(root.left);
		int rSum = sumTree(root.right);

		if(rootVal == (lSum+rSum))
			return true;

		return false;
	}

	public int sumTree(TreeNode n){
		if(n==null)
			return 0;
		return sumTree(n.left)+n.val+sumTree(n.right);
	}
}