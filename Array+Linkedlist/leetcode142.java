/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        // First, need to find if there's a cycle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // Second, set up another two pointers a and b
            if (slow == fast) {
                ListNode b = fast;
                ListNode a = head;
                while (a != b) {
                    a = a.next;
                    b = b.next;
                }
                return a;
            }
        }
        return null;
    }
}

