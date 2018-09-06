import java.util.Queue;
import java.util.LinkedList;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int num){val = num;}
}

class TreeTemplate{
	public static void main(String args[]){

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		
		printGraphicTree(root);
	}

	//BFS Traversal -- Level Order
	public static void printTree(TreeNode root){
		Queue<TreeNode> qu = new LinkedList<>();
		qu.offer(root);
		while(!qu.isEmpty()){
			TreeNode curr = qu.poll();
			System.out.print(curr.val+" ");
			if(curr.left!=null)
				qu.offer(curr.left);
			if(curr.right!=null)
				qu.offer(curr.right);
		}
	}

	//BFS Traversal -- Print Graphic Tree
	public static void printGraphicTree(TreeNode root){
		Queue<TreeNode> qu = new LinkedList<>();

		qu.offer(root);
		while(!qu.isEmpty()){
			//Traverse Current Level
			int size = qu.size();
			for(int i=0; i<size; i++)
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
	}
}