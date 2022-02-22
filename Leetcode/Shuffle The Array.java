class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans1 = new int[n];
        int[] ans2 = new int[n];
        int i, j;
        for(i=0,j=n; i<n && j<nums.length; i++,j++)
        {
            ans1[i] = nums[i];
            ans2[i] = nums[j];
        }
        for(i=0,j=0; i<nums.length&j<nums.length/2; i+=2,j++)
        {
            nums[i] = ans1[j];
            nums[i+1] = ans2[j];
        }
        return nums;
    }
}
