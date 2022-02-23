class Solution {
    public int numIdenticalPairs(int[] nums) {
        int i, j, len, count = 0;
        // len = (nums.length-1)*nums.length/2;
        // maximum number of iterations
        for(i=0; i<nums.length; i++)
        {
            for(j=0; j<nums.length; j++)
            {
                if((nums[i]==nums[j]) && (i < j))
                {
                    count += 1;
                }
            }
        }
        return count;
    }
}
