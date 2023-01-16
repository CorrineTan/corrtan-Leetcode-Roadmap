## preSum + TwoPointer

#### LeetCode 69 - Sqrt(x)

Question:

Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

    For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

 BrainStorm:

 1. Large number need to add (long)

 2. Think of x as a list of number from 0 to x.

 Two pointers left and right, find the mid everytime and determine whether mid*mid less/equal or greater than the target x. If less/equal, move left to mid+1. Else if greater than, move right to mid-1. Remember to save the result of the last step as it might be overwritten by another mid*mid.