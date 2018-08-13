/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
 		ListNode middle = head;
 		ListNode faster = head;

 		while(faster!=null && faster.next!=null){
 			middle = middle.next;
 			faster = faster.next.next;
 		}

 		ListNode prev = null;
 		ListNode curr = middle;
 		while(curr!=null){
 			ListNode nextNode = curr.next;
 			curr.next = prev;
 			prev = curr;
 			curr = nextNode;
 		}

 		while(prev!=null){
 			if(head.val!=prev.val)
 				return false;
 			prev = prev.next;
 			head = head.next;	
 		}
 		return true;
	}
}