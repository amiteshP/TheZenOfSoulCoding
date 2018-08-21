//https://leetcode.com/problems/convert-bst-to-greater-tree/description/

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
    public TreeNode convertBST(TreeNode root) {
		recursiveRightSubTreeSum(root);		        
    	return root;
    }

    public int recursiveRightSubTreeSum(TreeNode node, int val){
    	if(node.right!=null){
    		node.val+=node.right.val;
    		node.val += recursiveRightSubTreeSum(node.right, node.right.val);
    	}
    	if(node.left!=null){
    		recursiveRightSubTreeSum(node.left);
    	}
    	return val;
    }
}