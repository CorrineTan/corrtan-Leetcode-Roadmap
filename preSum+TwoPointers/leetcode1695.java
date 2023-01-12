class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        int sums = 0;
        int largest = 0;
        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            while(hash.contains(nums[end])) {
                sums -= nums[start];
                hash.remove(nums[start]);
                start++;
            }
            sums += nums[end];
            hash.add(nums[end]);
            largest = Math.max(sums, largest);
        }
        return largest;
    }
}

