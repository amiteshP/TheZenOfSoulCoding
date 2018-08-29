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
    public boolean isSymmetric(TreeNode root) {
    	Queue<TreeNode> qu = new LinkedList<>();
    	if(root==null)
    		return true;
    	qu.offer(root);
    	while(!qu.isEmpty())
    	{
    		ArrayList<TreeNode> arrL = new ArrayList<>();
    		while(!qu.isEmpty())
    		{
    			TreeNode curr = qu.poll();
    			arrL.add(curr);
    		}
    		StringBuilder sb = new StringBuilder();
    		for(TreeNode t: arrL){	
    			if(t.left==null){
    				TreeNode nullN = new TreeNode(0);
    				qu.offer(nullN);
    				sb.append(nullN.val);
    			}
    			else
    				{
    					qu.offer(t.left);
    					sb.append(t.left.val);
    				}
    			
    			if(t.right==null){
    				TreeNode nullN = new TreeNode(0);
    				qu.offer(nullN);
    				sb.append(nullN.val);
    			}
    			else	
    				{
    					qu.offer(t.right);
    					sb.append(t.right.val);
    				}
    		}
    		System.out.println("SB EACH LEVEL : "+sb.toString());
    		boolean leafs = true;
    		for(TreeNode nodeCheck: qu){
    			if(nodeCheck.val!=0)
    				{
    					leafs = false;
    					break;
    				}
    		}
    		if(leafs)
    			break;
    		if(!isPalindrome(sb))
    			return false;
    		
    	}
    	return true;
    }

    public boolean isPalindrome(StringBuilder sb){
    	System.out.println("New Level: ");
    	System.out.println(sb.toString());
    	System.out.println(sb.reverse().toString());
    	if(sb.toString() == sb.reverse().toString())
    		{	System.out.println("Palin!");
    			return true;
    		}
    	else
    		{
    			System.out.println(sb.toString());
    			System.out.println(sb.reverse().toString());
    			System.out.println("Not Palin");
    		}
    	return false;
    }

}