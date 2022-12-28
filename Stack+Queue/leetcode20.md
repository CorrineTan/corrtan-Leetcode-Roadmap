## Array and Linkedlist

#### LeetCode 20 - Valid Parentheses

Question: Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

Brainstorming:

Use stack. Create a new stack, push the left parenthese to stack and pop it whenever it met the right matched parenthese.

First convert string to charArray. Loop through the charArray. If it's left parenthese, push to stack. Else if stack is empty, meaning none of left paraenthese is in stack, we return false directly. 

End of for loop, only when stack is empty we return true. 

