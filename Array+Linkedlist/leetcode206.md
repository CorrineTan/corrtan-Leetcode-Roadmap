## Array and Linkedlist

#### LeetCode 206 - Reverse Linked List

Given the head of a singly linked list, reverse the list, and return the reversed list.

BrainStorming:

Regression: to the next of the node each time.
Anytime set the next of the node, need to set it to "Null" first. <br>
Then we can safely set the next to the previous node. 

### Learn From Official Answer

Linked List Nodes: object that can store values and the reference to other objects. <br>
Linked List are the collection of these nodes. <br>
We can access any node and the value on the list if given the head (first node). Then we can traverse down the list to find the node we want. <br>

#### Approach 1: Iterative

```
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            
            // Prepare for the next element
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
```
Key thing to keep in mind from this approach:

1. Assign a null list ahead of head. <br>
2. Change the next node to "prev" node each time and update the prev node in a while loop. <br>
3. Additional thing to be considered - after assigning the node's next to another node, you cannot do "curr = curr.next" as "curr.next" has already changed (e.g. already chagned to prev null node). So we need to store the value of curr at the first space. 

Complexity analysis: Time complexity : O(n). Space complexity : O(1).


#### Approach 2: Recursive

```
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
```

Complexity analysis: Time complexity : O(n). Space complexity : O(n).