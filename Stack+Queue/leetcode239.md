## Stack and Queue

#### LeetCode 239 - Sliding Window Maximum

Question: You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

BrainStorming:

Create a decreasing monostack to store temp largest value.

First consider the boundry when nums = 0 or k = 0, should print an empty list (new int[0]).

For the first three elements, use a empty sliding window first. There are not 3 elements in the window so we first determine the 1st element of the result list.

For the rest of the elements, use sliding window to go through the rest. Make a judgement of the newly added element with the peekLast to decide whehter to remove the peekLast. Then the peekFirst always represent the largest element.
