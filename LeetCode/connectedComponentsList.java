/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] G) {
        HashSet<Integer> hSet = new HashSet<>();
        if(head == null)
        	return 0;
        for(int num: G){
        	hSet.add(num);
        }
        int comp = 0;
        while(head!=null){
        	if(hSet.contains(head.val))
        	{
        		if(head.next!=null && hSet.contains(head.next.val))
                {
                    comp++;
                    if(head.next.next == null)
                    	break;
                }
                else if(head.next==null)
                	comp++;
        	}
        	head = head.next;
        }
        return comp;
    }
}