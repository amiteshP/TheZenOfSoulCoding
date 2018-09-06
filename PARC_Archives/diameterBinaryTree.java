class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int num){val=num;}
}

class Solution{

	int diameter = 0;
	public int returnTreeDiameter(TreeNode root){
		int maxLeft=0;
		int maxRight=0;
		return maxHeightSubtreesSum(root, maxLeft, maxRight);
	}

	public int maxHeightSubtreesSum(TreeNode node, int maxLeft, int maxRight){
		if(node==null)
			return diameter;
		else
		{
			if(node.left!=null)
			{
				return maxHeightSubtreesSum(node.left, maxLeft+1, maxRight);
			}
			if(node.right!=null)
			{
				return maxHeightSubtreesSum(node.right, maxLeft, maxRight+1);
			}
		}
		diameter = maxLeft+maxRight+1;
		return diameter;
	}

}