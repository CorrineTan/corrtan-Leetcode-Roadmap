## Array and Linkedlist

#### LeetCode 21 - Merge Two Sorted Lists

Question: Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

BrainStorming:

Still we nend to create a new dummy node -1. And add a pointer prev to dummy.

When both two lists are not null, update the smaller one to prev.next, then update prev and that list to next node, and update prev to next as well.

In the end, if any list has remaining elements (!=null), we need to append it to prev.next.
