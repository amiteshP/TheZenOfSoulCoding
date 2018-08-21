//Reverse LinkedList using Recursion

class Node{
	int val;
	Node next;
	Node(int data){val = data;}
}
class Solution{
	public Node returnReversedList(Node head){
		Node curr = head;
		Node prevNode = null;
		Node nextNode = curr.next;
		Node headNode = reverseList(curr, prevNode, nextNode);
		head.next = headNode;
		return headNode;
	}

	public Node reverseList(Node curr, Node prevNode, Node nextNode){
		if(nextNode.next==null){
			return nextNode;
		}
		Node next = curr.next;
		curr.next = prevNode;
		nextNode = next;
		prevNode = curr;
		return reverseList(curr, prevNode, nextNode);
	}
}