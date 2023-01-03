## Stack and Queue

#### LeetCode 84 -  Largest Rectangle in Histogram

Question: Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.

BrainStorming:

Need to add two 0s in the beginning and endings (need to bring all the element out of stack).
Use a monostack to store the index (increasing). Then for ith element, find the right index q(the 1st element's index that's smaller than ith element) and left index p (the 1st element's index that's smaller than the ith element). 

Area is newHeights[i] * (q-p-1). Find the largest area.

