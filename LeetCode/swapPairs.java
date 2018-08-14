/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
		if(head==null || head.next==null){
			return head;
		}        
		ListNode curr = head;
		ListNode next = curr.next;
		while(curr!=null){
			curr.next = next.next;
			next.next = curr;
			if(curr.next!=null)
				curr = curr.next;
			if(next.next!=null)
				next = next.next;
		}
		return head;
    }	
}
