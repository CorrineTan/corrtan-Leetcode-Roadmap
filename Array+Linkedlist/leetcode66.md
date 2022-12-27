## Array and Linkedlist

#### LeetCode 66 - Plus One

Quetion: You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Brainstorming:

9 is our special element here. We should loop from the end (Because it's meanless from the start if 9 in later elements). 

Whenever there's a 9, update current element to 0. Otherwise update element = element + 1.

Special case: when all digits are 9. Need to increase length of existing elements by 1 and update the 0 index to 1.
