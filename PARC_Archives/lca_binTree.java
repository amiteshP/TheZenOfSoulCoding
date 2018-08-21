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
		private List<Integer> path1 = new ArrayList<>();
		private List<Integer> path2 = new ArrayList<>();

		if(!findPath(root, node1, path1) || !findPath(root, node2, path2)){
			System.out.println((path1.size() > 0) ? "n1 is present" : "n1 is missing");
           	System.out.println((path2.size() > 0) ? "n2 is present" : "n2 is missing");
           	return -1;
		}

		int i;
		for(int i=0; i<path1.size() && i<path2.size(); i++){
			if(!path1.get(i).equals(path2.get(i)))
				break;
		}
		return path1.get(i-1);
	}

	private boolean findPath(TreeNode root, int nodeVal, List<Integer> path){
		if(root==null){
			return false;
		}
		path.add(root);
		if(root.data==nodeVal)
			return true;
		if(root.left!=null && findPath(root.left, nodeVal, path))
			return true;
		if(root.right!=null && findPath(root.right, nodeVal, path))
			return true;
		path.remove(path.size()-1);
		return false;	
	}
}