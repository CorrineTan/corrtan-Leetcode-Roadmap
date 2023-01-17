## Regression + Partition

#### LeetCode 77 - Combinations

Quesiton: Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].

You may return the answer in any order.

BrainStorm: 

Same as 78. 

Steps:

In main function:

1. create a set(list of list of integer) and a subset(list of integer)

2. call the backtrack function. Initialize a value to 0/1.

3. return set.

In backTranck function:

1. Termination Condition

2. backTrack again

3. subset remove size-1
