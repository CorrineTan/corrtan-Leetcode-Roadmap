## Stack and Queue

#### LeetCode 641 - Design Circular Deque

Question:
Implement the MyCircularDeque class:

    MyCircularDeque(int k) Initializes the deque with a maximum size of k.
    boolean insertFront() Adds an item at the front of Deque. Returns true if the operation is successful, or false otherwise.
    boolean insertLast() Adds an item at the rear of Deque. Returns true if the operation is successful, or false otherwise.
    boolean deleteFront() Deletes an item from the front of Deque. Returns true if the operation is successful, or false otherwise.
    boolean deleteLast() Deletes an item from the rear of Deque. Returns true if the operation is successful, or false otherwise.
    int getFront() Returns the front item from the Deque. Returns -1 if the deque is empty.
    int getRear() Returns the last item from Deque. Returns -1 if the deque is empty.
    boolean isEmpty() Returns true if the deque is empty, or false otherwise.
    boolean isFull() Returns true if the deque is full, or false otherwise.

BrainStorm:

Use an array which a size of k+1. Two pointers: front and rear. 

Front is the index of the beginning element of the array.

Rear is the NEXT index of the ending element of the array.

To understand the most, please check the graph here: https://zhuanlan.zhihu.com/p/393054279

So for adding front element, only need to move front pointer to left and insert value.

For adding rear element, only need to insert value then move rear pointer to right.

For removing front element, only need to move front pointer to right.

For removing rear element, only need to move rear pointer to left.

But the key thing here with this problem is that it is a circular deque. We need to consider out of index problem. Whenever head reaching to the leftmost or rear reaching to the rightmost, we need to + capacity then mod capacity; or directly mode capacity.

