class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int num){val = num;}
}

class Solution{
	public TreeNode leastCommonAncestorForBST(TreeNode currNode, TreeNode a, TreeNode b){
		if(currNode==null){
			return null;
		}

		if(currNode.val<a.val && currNode.val<b.val)
			return leastCommonAncestorForBST(currNode.right, a, b);

		if(currNode.val>a.val && currNode.val>b.val)
			return leastCommonAncestorForBST(currNode.left, a, b);

		return currNode;
	}

	//Root to n1 and root to n2 paths and finding the common value
	public TreeNode leastCommonAncestorForBinaryTree(TreeNode currNode, TreeNode a, TreeNode b){
		ArrayList<TreeNode> arrLA = new ArrayList<>();
		ArrayList<TreeNode> arrLB = new ArrayList<>();

		arrLA = getPathToNode(root, a, arrLA);
		arrLB = getPathToNode(root, b, arrLB);

		for(int i=0; i<arrLA.size() && i<arrLB.size(); i++)
		{
			if(arrLA.get(i).val==arrLB.get(i).val)
				return arrLA.get(i);
		}
		return null;
	}	

	public ArrayList<TreeNode> getPathToNode(TreeNode root, TreeNode node, ArrayList<TreeNode> path){
		if(root==null)
			return null;
		path.add(root);
		if(root.val == node.val)
			return path;
		if(root.left!=null)
			getPathToNode(root.left, node, path);
		if(root.right!=null)
			getPathToNode(root.right, node, path);
	
		path.remove(path.size()-1);
		return path;
	}
}