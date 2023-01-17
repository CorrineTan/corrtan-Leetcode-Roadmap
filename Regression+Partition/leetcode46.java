class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> path = new ArrayList();
        Boolean[] used = new Boolean[nums.length];
        Arrays.fill(used, false);
        backTrack(nums, path, used, res);
        return res;
    }

    public void backTrack(int[]nums, List<Integer> path, Boolean[] used, List<List<Integer>> res){
        if(path.size() == nums.length) {
            res.add(new ArrayList(path));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                backTrack(nums, path, used, res);
                path.remove(path.size() - 1);
                used[i] = false;
            }
        }
        
    }
}