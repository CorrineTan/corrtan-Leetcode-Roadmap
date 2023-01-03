## Stack and Queue

#### LeetCode 85 - Maximal Rectangle


Question: Given a rows x cols binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.


BrainStorm:

This is a harder version of LeetCode 84 - Largest Rectangle in Histogram.

Need to use the largestRectangleArea method. And that was the 1-dimension problem. Need to use 2-dimension for this problem. 

Build a list which has the size of the matrix row. Use two for-loops.

Accumulate the result when all elements above are 1. Whenever we meet 1, we overwrite the previous value, no matter what they might be, to 0.

Then to calculate the area, we need to use largestRectangleArea