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
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> preOrderList = new ArrayList<>();
        if(root==null){
        	return preOrderList;
        }
        else{
        	int rooter = root.val;
        	preOrderList = traversePreOrder(root, preOrderList);
        	preOrderList.add(0, rooter);
        	return preOrderList;
        }
    }

    public ArrayList<Integer> traversePreOrder(Node root, ArrayList<Integer> preOrderList){
    	if(root.children!=null){
    		for(Node child: root.children){
    			preOrderList.add(child.val);
    			preOrderList = traversePreOrder(child, preOrderList);
    		}
    	}
    	return preOrderList;
    }
}