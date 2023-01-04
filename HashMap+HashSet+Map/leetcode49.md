## HashMap + HashSet + Map

#### LeetCode 49 - Group Anagrams

Question: Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Brainstorm:

Create a HashMap: a1e1t1 as Key, and a list as value ["eat", "ate", "tea"]

To convert a word to "a1e1t1", use a count list with the length of 26 to store the value of the occurence of each element.

charAt and (char) to convert between ASCII code and the alphbet letter.



