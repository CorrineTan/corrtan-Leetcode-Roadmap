class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        char charArray[] = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if (c == ')' && top == '(' || c == ']' && top == '[' || c == '}' && top == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
    return stack.isEmpty();
    }
}

