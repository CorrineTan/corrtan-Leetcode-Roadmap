## Regression + Partition

#### LeetCode 111 - Minimum Depth of Binary Tree

Question: Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

BrainStorm:

In a tree, if there's something need to be checked on the same depth, use a queue to poll the root, then each time loop through the size of the queue.

