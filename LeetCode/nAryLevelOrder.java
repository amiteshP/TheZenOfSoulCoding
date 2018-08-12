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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> levelOrderList = new LinkedList();
        if (root == null){
        	return levelOrderList;
        }
        Queue<Node> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> li = new LinkedList();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                li.add(node.val);
                queue.addAll(node.children);
            }
            levelOrderList.add(li);
        }
        return levelOrderList;
    }
}