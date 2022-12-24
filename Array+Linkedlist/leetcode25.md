## Array and Linkedlist

#### LeetCode 25 - Reverse Nodes in k-Group

Quetion: Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

Brainstorming:

Could use the same function of leetcode 206 to reverse the linkedlist. Only thing need to think is the K's group.

Idea is to break the K's set. Most important thing is to identify each step's starting node and ending node.

