## Array and Linkedlist

#### LeetCode 142 - Linked List Cycle II

Quesiton: <br>
Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

BrainStorming:

First, need to find if there's a cycle:

Setup pointer fast and slow. Fast move two steps a time (fast = fast.next.next), and slow moves one step a time (slow = slow.next). If they meet, there's a cycle exist.

Second, need to find if the entry point of the cycle:

Set up another two pointers a and b, a is from the start of the linkiedlist, and b is the point which fast and slow from the last step met. If they met, then it's the entry point of the cycle:

```
x = n(x+y) - y
```

