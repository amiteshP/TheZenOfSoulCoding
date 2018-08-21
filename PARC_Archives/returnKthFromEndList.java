//Return kth Node from the end (In a single pass)

class Node{
	int val;
	Node next;
	Node(int data){val = data;}
}

class Solution{
	public Node returnKthFromEnd(Node head, int k){
		Node curr = head;
		Node kthNode = head;

		while(k-->0){
			curr = curr.next;
		}

		while(curr!=null){
			curr = curr.next;
			kthNode = kthNode.next;
		}
		return kthNode;
	}
}