## Stack and Queue

#### LeetCode 42 - Trapping Rain Water


Question: Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

BrainStorm:

Boundary: when only 2 heights in the list, return 0 because it cannot trapping water.

Use a monostack (decreasing from bottom to top) to store the index. 

If heights is smaller than/equal to stack.peek or stack is empty, we push the index to stack. 

If heights is larger than stack.peek, we store the index (bottom) of the stack peek and pop it. Then get the math min of the updated stack.peek and height[i], which is the upper height, minus the previous stack peek (bottom). The weigth is the index i - stack.peek - 1. Don't forget to push the current index to the stack.
 
Accumulate the result and return it. 