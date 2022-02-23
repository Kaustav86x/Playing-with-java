class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        int i, j, count;
        for(i=0; i<nums.length; i++)
        {
            count = 0;
            for(j=0; j<nums.length; j++)
            {
                if(nums[j] < nums[i] && j != i)
                {
                    count += 1;
                }
            }
            res[i] = count;
        }
        return res;
    }
}
