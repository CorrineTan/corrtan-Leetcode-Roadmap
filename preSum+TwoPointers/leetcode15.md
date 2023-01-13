## preSum + TwoPointer

#### LeetCode 15 - 3Sum

Problem: Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

BrainStorm:

Use three points, loop i, left = i + 1, right = length - 1.

The smartest solution for this problem is they sort the array forst (Arrays.sort(nums))!!!!

If three nums sum = 0, then left++, right--, and store the List to the list of list

Pay extreme attention to the repeated array, if found the last element left+1 and left are equal, or right-1 and right are equal, then ++ and -- respectively.

If sum < 0, left++.

If sum > 0, right--.
