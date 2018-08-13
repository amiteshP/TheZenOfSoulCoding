/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        l1 = reverseList(l1);
        l2 = reverseList(l2);

        int count1 = 0;
        int count2 = 0;

       	res = l1;
       	while(res!=null){
       		count1++;
       		res = res.next;
       	}

       	res = l2;
       	while(res!=null){
       		count2++;
       		res = res.next;
       	}
       	ListNode curr = res;
       	if(count1>count2){
       		int carr = 0;
       		while(l2!=null){
       			int tens = (l2.val+l1.val+carr)%10;
       			ListNode n = new ListNode(tens);
       			curr.next = n;
       			curr = curr.next;
				carr = (l2.val+l1.val)/10;
				l2 = l2.next;
				l1 = l1.next;
       		}
       		if(carr>0){
       			ListNode n2 = new ListNode(carr);
       			curr.next = n2;
       			curr = curr.next;
       		}
       		return reverseList(res);
       	}
       	else{
       		int carr = 0;
       		while(l1!=null){
       			int tens = (l2.val+l1.val+carr)%10;
       			ListNode n = new ListNode(tens);
       			curr.next = n;
       			curr = curr.next;
				carr = (l2.val+l1.val)/10;
				l2 = l2.next;
				l1 = l1.next;
       		}
       		if(carr>0){
       			ListNode n2 = new ListNode(carr);
       			curr.next = n2;
       			curr = curr.next;
       		}
       		return reverseList(res);
       	}
    }

    public ListNode reverseList(ListNode head){
    	ListNode curr = head;
    	ListNode prev = null;
    	ListNode nextn = head;
    	while(curr.next!=null){
    		nextn = curr.next;
    		curr.next = prev;
    		prev = curr;
    	}
    	nextn.next = prev;
    	head = nextn;
    	return head;
    }
}