class Solution {
    List<List<Integer>> res = new ArrayList();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> path = new ArrayList();
        backTrack(n, k, path, 1);
        return res;
    }
    public void backTrack(int n, int k, List<Integer> path, int start) {
        if (k==0) {
            res.add(new ArrayList(path));
            return;
        }
        for(int i = start; i <= n - k + 1; i++) {
            path.add(i);
            backTrack(n, k-1, path, i+1);
            path.remove(path.size() - 1);
        }
    }

}