  class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        int n = nums.length;
        if(n == 0 || n < 3) return ans;
        Arrays.sort(nums);
        for(int i = 0; i < n; i++) {
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i + 1;
            int right = n - 1;
            while(left < right) {
                int sums = nums[i] + nums[left] + nums[right];
                if (sums == 0) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    //watch out for the repeated arrays
                    while(left < right && nums[left] == nums[left + 1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right - 1]){
                        right--;
                    }
                    left++;
                    right--;
                }
                if (sums < 0) left++;
                if (sums > 0) right--;
            }
        }
        return ans;
        }
}