## Stack and Queue

#### LeetCode 150 - Evaluate Reverse Polish Notation

Quesiton: You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.

BrainStorming:

Create a Stack. Everytime meet a number, convert string to value. 

Everytime meet a symbal, pop the first element from stack as rightnumber, and second element from stack as leftnumber. 

