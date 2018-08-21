//Add/Multiply/Subtract two numbers represented in the form of linked lists.

class Node{
	int val;
	Node next;
	Node(int data){val = data;}
}

class Solution{

	public Node returnListsSum(Node headA, Node headB){
		headA = reverseLinkedList(headA);
		headB = reverseLinkedList(headB);

		Node headRes = new Node(null);
		Node curr = headRes;
		int carry  = 0;
		while(headA.next!=null && headB.next!=null){
			int sum = headA.val+headB.val+carry;
			Node node = new Node(sum%10);
			curr.next = node;
			curr = node;
			carry = sum/10;
		}
		if(carry>0){
			Node node = new Node(carry);
			curr.next = node;
			node.next = null;
		}
		return headRes;
	}
	
	public Node returnListsProduct(Node headA, Node headB){
		
	}
	
	public Node returnListsDifference(Node headA, Node headB){
		
	}

	public Node reverseLinkedList(Node head){
		Node curr = head;
		Node prevNode = null;
		Node nextNode = curr.next;
		while(curr.next!=null){
			Node next = curr.next;
			curr.next = prevNode;
			prevNode = curr;
			nextNode = next;
		}
		curr.next = prevNode;
		head.next = curr;
		return head;
	}
}