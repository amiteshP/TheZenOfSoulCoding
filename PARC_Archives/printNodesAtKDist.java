//Print all nodes which are at a distance k from a given node

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int num){val=num;}
}

class Solution{
	public void printNodesAtKDistance(TreeNode root, TreeNode n, int k){
		List<Integer> arrL = new ArrayList<Integer>();
		arrL = getNodeValsAtKDist(root, n, k, arrL);
		for(Integer val: arrL){
			System.out.print(val+" ");
		}
	}

	public ArrayList<Integer> getNodeValsAtKDist(TreeNode root, TreeNode target, int k, ArrayList<Integer> arrl){
		Queue<TreeNode> qu = new LinkedList<>();
		qu.offer(root);
		while(!qu.isEmpty())
		{
			TreeNode curr = qu.poll();
			if(curr == node){
				while(k-->0 && curr!=null)
				{
					TreeNode next = curr;
					if(next.left!=null){
						qu.offer(next.left);
						next = next.left;
					}
					if(next.right!=null){
						qu.offer(next.right);
						next = next.right;
					}

				}
				
			}
		}

	}
}