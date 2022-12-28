class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int leftNumber;
        int rightNumber;
        for (String token : tokens) {
            int ans;
            if (token.equals("+")) {
                rightNumber = stack.pop();
                leftNumber = stack.pop();
                ans = leftNumber + rightNumber;
            } else if (token.equals("-")) {
                rightNumber = stack.pop();
                leftNumber = stack.pop();
                ans = leftNumber - rightNumber;
            } else if (token.equals("*")) {
                rightNumber = stack.pop();
                leftNumber = stack.pop();
                ans = leftNumber * rightNumber;
            } else if (token.equals("/")) {
                rightNumber = stack.pop();
                leftNumber = stack.pop();
                ans = leftNumber / rightNumber;
            } else {
                ans = Integer.valueOf(token);
            }
            stack.push(ans);
        }
        return stack.peek();
    }
}

