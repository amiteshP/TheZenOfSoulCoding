//Least common ancestor of a binary search tree

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int data){val = data;}
}

class Solution{
	public TreeNode returnLCA(TreeNode root, int node1, int node2){
		TreeNode node = root;
		while(node!=null){
			if(node1<node.val && node2<node.val)
				node = node.left;
			else if(node1>node.val && node2>node.val)
				node = node.right;
			else break;
		}
		return node;
	}
}