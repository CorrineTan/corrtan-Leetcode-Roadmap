## HashMap + HashSet + Map

#### LeetCode 697 - Degree of an Array

Question: Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.

Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.

BrainStorm:

Create a Hashmap, key is the element of the list. value is a list (1st element - frequency, 2nd element - first occured index, 3rd element - last occured index).

Pay attention to how to low a hashmap (hashmap.entrySet()).

Pay particular attention to when two element has the same degree, need to choose the minimum one.