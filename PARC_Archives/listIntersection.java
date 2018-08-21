//Intersection Point of two linked lists
class Node{
	int val;
	Node next;
	Node(int data){val = data;}
}

class Solution{
	public Node findIntersect(Node headA, Node headB){
		if(headA==headB)
			return headA;

		Node currA = headA;
		Node currB = headB;
		int changeCount = 0;

		while(currA!=null && currB!=null){
			if(currA==currB)
				return currA;
			currA = currA.next;
			currB = currB.next;
			if(currA == null)
				{
					currA = headB;
					changeCount++;
				}
			if(currB == null)
			{
				currB = headA;
				changeCount++;
			}
			if(changeCount>4)
				return null;
		}
	}
}