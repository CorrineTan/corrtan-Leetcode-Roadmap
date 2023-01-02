class Solution {
    public int largestRectangleArea(int[] heights) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        int[] newHeights = new int[heights.length + 2];
        newHeights[0] = 0;
        newHeights[newHeights.length-1] = 0;
        for (int i = 1; i < heights.length + 1; i++) {
            newHeights[i] = heights[i - 1];
        }

        for (int i = 0; i < newHeights.length; i++) {
            while(!stack.isEmpty() && newHeights[i] < newHeights[stack.peek()]) {
                int cur = stack.pop();
                int curHeight = newHeights[cur];
                int leftIndex = stack.peek();
                int rightIndex = i;
                int curWidth = rightIndex - leftIndex - 1;
                res = Math.max(res, curWidth * curHeight);
            }
            stack.push(i);
        }
        return res;
        }
}

