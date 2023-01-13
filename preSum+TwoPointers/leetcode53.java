class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==0) return 0;
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < n; i++) {
            if (dp[i-1] > 0) {
                dp[i] = dp[i-1] + nums[i];
            } else{
                dp[i] = nums[i];
            }
            if (maxSum < dp[i]) {
                maxSum = dp[i];
            }
        }
        return maxSum;
    }
}

