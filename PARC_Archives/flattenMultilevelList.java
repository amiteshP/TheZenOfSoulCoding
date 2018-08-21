//Flatten a multilevel linked list.

class node{
	int val;
	Node next;
	Node child;
	Node(int data){val = data;}
}

class Solution{

	public Node returnFlattenList(Node head){
		Queue<Node> qu = new LinkedList<Node>();
		Node currHead = head;
		qu.offer(currHead);
		while(!qu.isEmpty()){
			Node curr = qu.poll();
			Node currHead2 = curr;
			while(currHead2.next!=null){
				if(currHead2.child!=null)
					qu.offer(currHead2.child);
				currHead2 = currHead2.next;
			}
			currHead2.next = qu.peek();
		}
		return head;
	}
}