//Print right view/left view of a binary tree.
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int data){val = data;}
}

class Solution{
	public static List<Integer> printLeftView(TreeNode node){
		Queue<TreeNode> qu = new LinkedList<>();
		qu.offer(node);
		List<Integer> leftView = new ArrayList<>(); 
		while(!qu.isEmpty())
		{
			TreeNode topNode = qu.peek();
			leftView.add(topNode.val);
			List<TreeNode> levelNodes = new ArrayList<>();
			while(!qu.isEmpty()){
				levelNodes.add(qu.poll());
			}
			for(TreeNode tn: levelNodes){
				if(tn.left!=null)
					qu.offer(tn.left);
				if(tn.right!=null)
					qu.offer(tn.right);	
			}
		}
		return leftView;
	}
	public static List<Integer> printRightView(TreeNode node){
			Queue<TreeNode> qu = new LinkedList<>();
			qu.offer(node);
			List<Integer> rightView = new ArrayList<>();
			while(!qu.isEmpty())
			{
				List<TreeNode> levelNodes = new ArrayList<>();
				while(qu.size()!=1)
				{
					levelNodes.add(qu.poll());
				}
				rightView.add(qu.peek().val);
				levelNodes.add(qu.poll());
				for(TreeNode tn: levelNodes){
					if(tn.left!=null)
						qu.offer(tn.left);
					if(tn.right!=null)
						qu.offer(tn.right);
				}
			}
			return rightView;
	}
	public static void printTreeView(List<Integer> arrL){
		for(int n : arrL){
			System.out.print(n+" ");
		}
		System.out.println();
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
		printTreeView(printLeftView(root));
		printTreeView(printRightView(root));
	}
}