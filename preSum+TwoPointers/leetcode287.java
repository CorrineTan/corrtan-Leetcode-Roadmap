class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        while(slow == 0 && fast == 0 || slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        int b = fast;
        int a = 0;
        while(a != b) {
            a = nums[a];
            b = nums[b];
        }
        return a;
    }
}
