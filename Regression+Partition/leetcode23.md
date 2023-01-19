## Regression + Partition

#### LeetCode 226 - Invert Binary Tree

Question: You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.


BrainStorm:

Use mergeTwoLists we used before.

Recap of mergeTwoLists:

Setup a dummy node (ListNode(-1)). and a prev pointer to dummy.

Each time we find which element is smaller in l1.val and l2.val, and move pre.next to l1 or l2. Then move l1 to l1.next, or l2 to l2.next. Then pre to pre.next.

After that, a listnode might be not null and need to be added together to the merged list. Need to put pre.next to that not null list. 

In the last return dummy.next.

