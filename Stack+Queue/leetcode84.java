class Solution {
    public int largestRectangleArea(int[] heights) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        int[] newHeights = new int[heights.length + 2];
        newHeights[0] = 0;
        newHeights[newHeights.length-1] = 0;
        for (int i = 0; i < heights.length; i++) {
            newHeights[i+1] = heights[i];
        }

        for (int i = 0; i < newHeights.length; i++) {
            while(!stack.isEmpty() && newHeights[i] < newHeights[stack.peek()]) {
                int cur = stack.pop();
                int curHeights = newHeights[cur];
                int leftIndex = stack.peek();
                int rightIndex = i;
                res = Math.max(res, curHeights * (rightIndex - leftIndex - 1));
            }
            stack.push(i);
        }
        return res;
        }
}