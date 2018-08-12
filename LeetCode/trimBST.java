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
    public TreeNode trimBST(TreeNode root, int L, int R) {
    	TreeNode newBSTRoot;
    	newBSTRoot=null;
        return traverseAndCreateBST(root, newBSTRoot, L, R);
    }

    public TreeNode traverseAndCreateBST(TreeNode root, TreeNode newTreeRoot, int L, int R){
    	if(root!=null){
    		if(L<=root.val && root.val<=R)
    			newTreeRoot = insertNode(newTreeRoot, root.val);
    		newTreeRoot = traverseAndCreateBST(root.left, newTreeRoot, L, R);
    		newTreeRoot = traverseAndCreateBST(root.right, newTreeRoot, L, R);
    	}
    	return newTreeRoot;
    }

    public TreeNode insertNode(TreeNode treeRoot, int newNodeVal){
    	if(treeRoot == null){
    		treeRoot = new TreeNode(newNodeVal);
    	}
    	else if(newNodeVal<treeRoot.val){
    		treeRoot.left = insertNode(treeRoot.left, newNodeVal);
    	}
    	else if(newNodeVal>treeRoot.val){
    		treeRoot.right = insertNode(treeRoot.right, newNodeVal);
    	}
    	return treeRoot;
    }
}