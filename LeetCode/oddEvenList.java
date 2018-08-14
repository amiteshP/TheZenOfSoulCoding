/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
 		if(head==null || head.next==null){
 			return head;
 		}       
 		ListNode oddNodeHead = head;
 		ListNode evenNodeHead = head.next;
 		ListNode evenNodeHeadKeep = evenNodeHead;
 		while(evenNodeHead!=null){
 			oddNodeHead.next = evenNodeHead.next;
 			if(evenNodeHead.next!=null)
 			{
 				evenNodeHead.next = evenNodeHead.next.next;
 				oddNodeHead = oddNodeHead.next;
 			}	
 			evenNodeHead = evenNodeHead.next;
 		}
 		oddNodeHead.next = evenNodeHeadKeep;
 		return head;
    }
}