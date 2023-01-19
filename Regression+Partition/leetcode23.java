class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        if(lists.length == 1) return lists[0];
        if(lists.length == 2) return mergeTwoLists(lists[0], lists[1]);
        int mid = lists.length / 2;
        ListNode[] sub1 = new ListNode[mid];
        for(int i = 0; i < mid; i++) {
            sub1[i] = lists[i];
        } 
        ListNode[] sub2 = new ListNode[lists.length - mid];
        for(int i = mid; i < lists.length; i++) {
            sub2[i-mid] = lists[i];
        }
        ListNode l1 = mergeKLists(sub1);
        ListNode l2 = mergeKLists(sub2);
        return mergeTwoLists(l1, l2);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode pre = dummy;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val){
                pre.next = l1;
                l1 = l1.next;
            } else{
                pre.next = l2;
                l2 = l2.next;
            }
            pre = pre.next;
        }
        if(l1 != null) {
            pre.next = l1;
        }
        if(l2 != null) {
            pre.next = l2;
        }
        return dummy.next;
    }
}

