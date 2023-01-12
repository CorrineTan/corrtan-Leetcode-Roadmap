class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.get(nums[i])[0]++;
                map.get(nums[i])[2] = i;
            } else {
                map.put(nums[i], new int[]{1, i ,i});
            }
        }
        int numMax = 0;
        int minLen = 0;
        for(HashMap.Entry<Integer, int[]> entry: map.entrySet()) {
            int[] temp = entry.getValue();
            if(numMax < temp[0]) {
                numMax = temp[0];
                minLen = temp[2] - temp[1] + 1;
            } else if (numMax == temp[0]) {
                if (minLen > temp[2] - temp[1] + 1) {
                    minLen = temp[2] - temp[1] + 1;
                }
            }
        }
        return minLen;
    }
}

