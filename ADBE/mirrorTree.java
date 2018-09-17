import java.util.*;
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int num){
		val = num;
	}
}

class Solution{
	public static TreeNode getMirrorTree(TreeNode root){
		Queue<TreeNode> qu = new LinkedList<>();
		qu.offer(root);
		while(!qu.isEmpty())
		{
			TreeNode curr = qu.poll();
			if(curr.left!=null || curr.right!=null)
			{
				TreeNode temp = curr.left;
				curr.left = curr.right;
				curr.right = temp;
			}
			if(curr.left!=null)
				qu.offer(curr.left);
			if(curr.right!=null)
				qu.offer(curr.right);
		}
		return root;
	} 

	public static void printTree(TreeNode root){
		Queue<TreeNode> qu = new LinkedList<>();
		qu.offer(root);
		System.out.println("Tree: ");
		while(!qu.isEmpty())
		{
			TreeNode curr = qu.poll();
			System.out.print(curr.val+" ");
			if(curr.left!=null)
				qu.offer(curr.left);
			if(curr.right!=null)
				qu.offer(curr.right);
		}
		System.out.println();
	}

	static public void main(String args[]){
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(6);

		printTree(root);

		root = getMirrorTree(root);

		printTree(root);
	}
}