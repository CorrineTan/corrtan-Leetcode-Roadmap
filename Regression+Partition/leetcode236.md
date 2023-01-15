## Regression + Partition

#### LeetCode 236 - Lowest Common Ancestor of a Binary Tree

Question:
Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”


BrainStorm:

check if p and q exist in left or right branch.

If it doesn't exist in either right/left, return null;

If it doesn't exist in left, return right;

If it doesn't exist in right, return left;

If it both exist, return root.