class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> sh = new LinkedHashSet<Character>();
        // sliding window
        int l_pointer = 0;
        int r_pointer = 0;
        int count = 0;
        
        while(r_pointer <= s.length()-1) {
            if(!sh.contains(s.charAt(r_pointer))) {
                sh.add(s.charAt(r_pointer));
                r_pointer += 1;
                count = Math.max(count, sh.size());
                
            }
            else {
                sh.remove(s.charAt(l_pointer));
                l_pointer += 1;
            }
        }
        return count;
        
    }
}
