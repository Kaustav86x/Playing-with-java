class Solution {
    public int maxScore(String s) {
        int len = s.length();
        int ans = 0;
        // outer loop for traversal
        for(int i=0; i<len  - 1; i++)
        {
            int curr = 0;
            for(int j=0; j<i+1; j++)
            {
                if(s.charAt(j) == '0') 
                    curr ++;
            }
            for(int j=i+1; j<len; j++)
            {
                if(s.charAt(j) == '1')
                    curr ++;
            }
            ans = Math.max(ans, curr);
        }
        return ans;
    }
}
