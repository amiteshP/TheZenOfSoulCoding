/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
 		ListNode curr = root;
 		int count = 0;
 		while(curr!=null){
 			count++;
 			curr = curr.next;
 		}   
 		ArrayList<ListNode> arrL = new ArrayList<>();    
 		if(k>=count){
 			curr = root;
 			while(k>0){
 				if(curr!=null)
 				{	ListNode newNode = new ListNode(curr.val);
 					curr = curr.next;
 					arrL.add(newNode);
 				}
 				else
 					arrL.add(null);
 				k--;
 			}
 			return arrL.toArray(new ListNode[arrL.size()]);
 		}
 		else if(k<count){
 			curr = root;
 			ListNode prev = root;
 			int gp = count/k;
 			int rem = count%k;
 			while(k>0){
 				int gpC = gp;
 				ListNode newNode = new ListNode(curr.val);
 				while(gpC>1){
 					prev = curr;
 					curr = curr.next;
 					ListNode nn = new ListNode(curr.val);
 					gpC--;
 				}
 				if(rem>0)
 				{
 					ListNode newer = new ListNode(curr.val);
 					prev = curr;
 					curr = curr.next;
 					rem--;
 				}
 				arrL.add(newNode);
 				k-=gp;
 			}
 			return arrL.toArray(new ListNode[arrL.size()]);
 		}
 		return null;
    }
}