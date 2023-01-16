## preSum + TwoPointer

#### LeetCode 125 -  Valid Palindrome

Question: A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

BrainStorm:

Two pointers from left and right. 

Break condition: left < right.

Whenever meet non-letter/digit characters, move the single pointer to the next.

Else move two pointers inner. 