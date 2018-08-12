/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> postorder(Node root) {
 		ArrayList<Integer> postOrderList = new ArrayList<>();
 		
 		if(root == null){
 			return postOrderList;
 		}       
 		else
 		{
 			int rooter = root.val;
 			postOrderList = traversePostOrder(root, postOrderList);
 			postOrderList.add(rooter);
 			return postOrderList;
 		}
    }

    public ArrayList<Integer> traversePostOrder(Node root, ArrayList<Integer> postOrderList){
    	for(Node child : root.children){
    		if(child!=null)
    		{
    			Node parent = child;
    			postOrderList = traversePostOrder(child, postOrderList);
    			postOrderList.add(parent.val);
    		}
    	}
    	return postOrderList;
    }
}