/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> resL = new ArrayList<>();
        if(root==null)
    		return resL;
        Queue<TreeNode> qu = new LinkedList<>();
        List<Integer> currL  = new ArrayList<>();
        currL.add(root.val);
        resL.add(currL);
        qu.offer(root);
        while(!qu.isEmpty())
        {
        	currL = new ArrayList<>();
        	TreeNode curr = qu.poll();
        	List<TreeNode> leveler = new ArrayList<>();
        	
        	if(curr.left!=null){
        		qu.offer(curr.left);
        	}
        	if(curr.right!=null){
        		qu.offer(curr.right);
        	}
        	while(!qu.isEmpty())
        		{

        				TreeNode l = qu.poll();
        				if(l.left!=null)
        					currL.add(l.left.val);
        				if(l.right!=null)
        					currL.add(l.right.val);

        			leveler.add(l);
        		}
        	for(TreeNode t: leveler){
        		qu.offer(t);

        	}
        	resL.add(currL);
        }
        Collections.reverse(resL);
        return resL;
    }
}