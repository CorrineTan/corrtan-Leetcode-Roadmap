class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sets = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        backTrack(0, nums, sets, subset);
        return sets;
    }
    public void backTrack(int i, int[] nums, List<List<Integer>> sets, List<Integer> subset) {
        sets.add(new ArrayList<Integer>(subset));
        if (i >= nums.length) {
            return;
        }
        for(int j = i; j < nums.length; j++) {
            subset.add(nums[j]);
            backTrack(j+1, nums, sets, subset);
            subset.remove(subset.size() - 1);
        }
    }
}