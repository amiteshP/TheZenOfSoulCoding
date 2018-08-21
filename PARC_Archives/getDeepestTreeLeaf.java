//Get the deepest leaf node which is towards the left/ right.
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int data){val=data;}
}

class Solution{
	public static int getLeftDeepestLeaf(TreeNode root){
		Queue<TreeNode> qu = new LinkedList<>();
		qu.offer(root);
		int maxLeftLeaf=0;
		List<TreeNode> levelNodes = new ArrayList<>();
		while(!qu.isEmpty()){
			while(!qu.isEmpty()){
				levelNodes.add(qu.poll());
			}
			for(TreeNode tn:levelNodes){
				if(tn.left!=null){
					maxLeftLeaf = tn.left.val;
					qu.offer(tn.left);
				}
				if(tn.right!=null){
					qu.offer(tn.right);
				}
			}
			levelNodes.clear();
		}
		return maxLeftLeaf;
	}
	public static int getRightDeepestLeaf(TreeNode root){
		Queue<TreeNode> qu = new LinkedList<>();
		qu.offer(root);
		int maxRightLeaf=0;
		List<TreeNode> levelNodes = new ArrayList<>();
		while(!qu.isEmpty()){
			while(!qu.isEmpty()){
				levelNodes.add(qu.poll());
			}
			for(TreeNode tn:levelNodes){
				if(tn.left!=null){
					qu.offer(tn.left);
				}
				if(tn.right!=null){
					maxRightLeaf = tn.right.val;
					qu.offer(tn.right);
				}
			}
			levelNodes.clear();
		}
		return maxRightLeaf;
	}
	public static void main(String args[]){
		TreeNode root;
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
		root.right.right = new TreeNode(6);
		root.right.right.left = new TreeNode(7);
		System.out.println(getLeftDeepestLeaf(root));
		System.out.println(getRightDeepestLeaf(root));
	}
}