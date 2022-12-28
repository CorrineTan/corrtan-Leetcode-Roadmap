class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        int sign = 1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int value = ch - '0';
                while (i < s.length() - 1 && Character.isDigit(s.charAt(i+1))) {
                    i++;
                    value = value * 10 + s.charAt(i) - '0';
                }
                res = res + sign * value;
            } else if (ch == '+') {
                sign = 1;
            } else if (ch == '-') {
                sign = -1;
            } else if (ch == '(') {
                stack.push(res);
                res = 0;
                stack.push(sign);
                sign = 1;
            } else if (ch == ')') {
                int formerSign = stack.peek();
                stack.pop();
                int formerRes = stack.peek();
                stack.pop();
                res = formerRes + formerSign * res;
            }
        }
        return res;
    }
}

