class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            res = Math.max(res, w*h);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return res;
    }
}