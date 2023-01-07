class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        int n = cpdomains.length;
        for (String s: cpdomains) {
            int idx = 0;
            while(idx < s.length() && s.charAt(idx) != ' ') idx++;
            int count = Integer.parseInt(s.substring(0, idx));
            int start = idx + 1;
            idx = s.length() - 1;
            while(idx >= start) {
                while(idx >= start && s.charAt(idx) != '.') idx--;
                String cur = s.substring(idx+1);
                map.put(cur, map.getOrDefault(cur, 0) + count);
                idx--;
            }
        }
        List<String> ans = new ArrayList<>();
        for (String key : map.keySet()) {
            ans.add(map.get(key) + " " + key);
        }
        return ans;
    }
}

