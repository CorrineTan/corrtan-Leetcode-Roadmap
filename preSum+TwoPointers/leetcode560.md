## HashMap + HashSet + Map

#### LeetCode 560 - Subarray Sum Equals K

Question:

Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

BrainStorm:

Use a hashmap to store the preSum as key and frequency as value. 

Find if pre - k exist in key, if so, increase the count by the frequency of this pre.
 


