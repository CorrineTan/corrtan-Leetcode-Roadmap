## Regression + Partition

#### LeetCode 47 -  Permutations II

Question: 
Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.

BrainStorm:

Exact the same as 46.

But need to remove the duplicates by:

1. sort the array

2. if nums[i] == nums[i-1] continue. But pay attention that nums[i-1] need to be false here (end of checking). That's for avoiding all duplicated value being removed from the list.