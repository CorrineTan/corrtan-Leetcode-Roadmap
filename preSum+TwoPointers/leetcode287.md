## preSum + TwoPointer

#### LeetCode 287 - Find the Duplicate Number

Question:

Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

BrainStorm:

It can convert to LinkedList with ring!!!

slow = fast = 0.

Slow move 1 step at a time and fast move 2 steps. But pay attention here that for each step, we need to convert the value as moving to the index of the array. value 3 means we need to move the pointer to index 3. 

The meeting point is point b. Then starting point a and b both move 1 step, and the meeting point of them is the starting point of the cycle.