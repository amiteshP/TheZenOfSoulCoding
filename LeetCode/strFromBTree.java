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
    public String tree2str(TreeNode t) {
    	if(t==null)
    		return null;
        StringBuilder sb = new StringBuilder();
        sb.append(t.val);
        
        if(t.left!=null){
        	sb.append("(");
        	sb = traversePreOrder(t.left, sb);	
        	sb.append(")");
        }
        if(t.right!=null){
        	sb.append("(");
        	sb = traversePreOrder(t.right, sb);	
       		sb.append(")");
        }
        return sb.toString();
    }

    public StringBuilder traversePreOrder(TreeNode t, StringBuilder sb){
    	if(t!=null){		
    		sb.append(t.val);
    		if(t.left!=null){
    			sb.append("(");
    			traversePreOrder(t.left, sb);
    			sb.append(")");
    		}

    		if(t.right!=null){
    			sb.append("(");
    			traversePreOrder(t.right, sb);
    			sb.append(")");
    		}
    		
    	}
    	return sb;
    }
}