## Array and Linkedlist

#### LeetCode 283 - Move Zeroes

Q: Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Brainstorming:
Still use two pointers. One slow and one fast. 

Whenever hit 0: only fast++

Whenever hit non-0: should replace value on slow with current value. and still fast++

Then replace all element after index slow to 0.


### Learn From Official Answer

Two-Pointers: A faster one and a slow one:

The faster pointer: does the job of processing new elements - looping.

The slow pointer: record the position/index of the last found non-0 element. update it whenever a new non-0 elements found (update the value as well).

Time Complexity: O(n)

Space Complexity: O(1)