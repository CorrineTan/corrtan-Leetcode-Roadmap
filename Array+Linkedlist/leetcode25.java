 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode pre = dummy;
        ListNode end = dummy;

        while (end.next!=null) {
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }
            if (end == null) {
                break;
            }

            // need to annotate what's the next starting node, and this starting node
            ListNode nextStart = end.next;
            ListNode start = pre.next;

            // cut this set
            end.next = null;
            pre.next = null;

            pre.next = reverseList(start);

            // note that start and end is reversed now!!! 
            start.next = nextStart;

            // update new pre and end now
            pre = start;
            end = start;
        }
        return dummy.next;
    }
    public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) {
        return head;
    }

    ListNode cur  = reverseList(head.next);
    head.next.next = head;
    head.next = null;

    return cur;
    }
}