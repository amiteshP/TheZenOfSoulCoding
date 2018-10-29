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
    public TreeNode increasingBST(TreeNode root) {
 		ArrayList<TreeNode> arrL = new ArrayList<>();
 		dfs(root, arrL);
 		TreeNode rootr = arrL.get(0);
 		TreeNode curr = rootr;
 		for(int i=1; i<arrL.size(); i++){
 			curr.right = arrL.get(i);
 			curr = curr.right;
 		}
 		return rootr;
    }

    public void dfs(TreeNode root, ArrayList<TreeNode> arrL){
    	if(root!=null)
    	{
    		dfs(root.left, arrL);
    		arrL.add(root);
    		dfs(root.right, arrL);
    	}
    }

}