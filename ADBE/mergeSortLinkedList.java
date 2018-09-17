class mergeSortLinkedList{

	class Node{
		int val;
		Node next;
		Node(int num){val=num;}
	}

	public Node sortedMerge(Node left, Node right){
		Node res = null;

		if(left==null)
			return right;
		if(right==null)
			return left;

		if(left.val<=b.val)
		{
			res = left;
			res.next = sortedMerge(left.next, right);
		}
		else
		{
			res = right;
			res.next = sortedMerge(left, right.next);
		}
		
		return res;	
	}

	public Node mergeSort(Node head){
		if(head==null || head.next==null){
			return head;
		}

		Node mid = returnMiddle(head);
		Node midNext = mid.next;

		mid.next = null;

		Node left = mergeSort(head);
		Node right = mergeSort(midNext);

		Node sortedList = sortedMerge(left, right);
		return sortedList;
	} 

	public Node returnMiddle(Node n){
		if(n==null)
			return null;
		Node slow = n;
		Node fast = n;
		while(fast.next!=null || fast.next.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
}