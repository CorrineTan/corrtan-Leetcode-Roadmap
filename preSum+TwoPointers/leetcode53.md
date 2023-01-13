## preSum + TwoPointer

#### LeetCode 53 - Maximum Subarray

Question:

Given an integer array nums, find the subarray with the largest sum, and return its sum.

BrainStorm:

Use a dp array as a array which has the same length of the nums.

To determine dp[i]:

1. dp[0] = nums[0]

2. loop i, if dp[i-1] < 0, then just directly copy the value from nums to dp.

3. if dp[i-1] > 0, then add the current nums[i] to dp[i-1]

Meanwhile, need to use a variable to store the maxvalue and use larger dp[i] to replace it.


