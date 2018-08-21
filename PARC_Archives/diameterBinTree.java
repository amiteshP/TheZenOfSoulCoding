//Diameter of a binary tree.

TreeNode node{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int data){val=data;}
}

class Solution{
	/**
	public int diameterOfTree(TreeNode node){
		if(node==null)
			return 0;
		int leftHeight = heightOfTree(node.left);
		int rightHeight = heightOfTree(node.right);

		int leftDiameter = diameterOfTree(node.left);
		int rightDiameter = diameterOfTree(node.right);

		return Math.max(leftHeight+rightHeight+1, Math.max(leftDiameter, rightDiameter));
	}

	private int heightOfTree(TreeNode node){
		if(node==null)
			return 0;
		return(1+Math.max(heightOfTree(node.left), heightOfTree(node.right)));
	}
	**/
	//An O(n) approach

	public int diameterOfTree(TreeNode node){
		if(node == null)
			return 0;
		int ans = Integer.MIN_VALUE;
		return heightOfTree(node, ans);
	}

	private int height(TreeNode node, int ans){
		if(node==null)
			return null;

		int leftHeight = height(node.left, ans);
		int rightHeight = height(node.right, ans);

		return Math.max(ans, leftHeight+rightHeight+1);

	}
}