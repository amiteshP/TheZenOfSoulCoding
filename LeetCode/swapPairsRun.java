class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode second = head.next;
        head.next = swapPairs(head.next.next);
        second.next = head;
        return second;
    }
}