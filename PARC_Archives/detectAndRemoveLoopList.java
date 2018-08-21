//Detect and remove loop in the linked list

class Node{
	int data;
	Node next;
	Node(int val){data=val;}
}
class Solution{
	public Node returnLoopFree(Node head){
		Node curr = head;
		Node faster = head;

		while(faster.next!=null || faster.next.next!=null){
			faster = faster.next.next;
			curr = curr.next;
			if(faster==curr)
			{
				System.out.print("Loop at : " + fater.data);
				faster = null;
			}
		}

		return head;
	}
}