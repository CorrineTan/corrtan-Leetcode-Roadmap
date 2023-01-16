class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList();
        int len = nums.length;
        if (nums == null || len < 4) return res;
        Arrays.sort(nums);
        for (int i = 0; i <= len - 4; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            if((long)nums[i] + nums[i+1] + nums[i+2] + nums[i+3] > target) break;
            if((long)nums[i] + nums[len-1] + nums[len-2] + nums[len-3] < target) continue;
            for(int j = i + 1; j <= len - 3; j++) {
                if(j > i + 1 && nums[j] == nums[j-1]) continue;
                if((long)nums[i] + nums[j] + nums[j+1] + nums[j+2] > target) break;
                if((long)nums[i] + nums[j] + nums[len-1] + nums[len-2] < target) continue;
                int left = j + 1;
                int right = len - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while(left < right && nums[left] == nums[left+1]) {
                            left ++;
                        }
                        while(left < right && nums[right] == nums[right-1]) {
                            right --;
                        }
                        right --;
                        left ++;
                    } else if (sum < target) {
                        left ++; 
                    } else {
                        right --;
                    }
                } 
            }
        }
        return res;
    }
}

