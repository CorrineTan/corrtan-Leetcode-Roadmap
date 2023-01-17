## Regression + Partition

#### LeetCode 46 -  Permutations

Question:
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

BrainStorm:

Same stategy as 77 and 78.

Steps:

In main function:

1. create a set(list of list of integer) and a subset(list of integer)

2. call the backtrack function. Initialize a value to 0/1.

3. return set.

In backTranck function:

1. Termination Condition

2. backTrack again

3. subset remove size-1