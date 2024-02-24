class Solution { 
    public void sortColors(int[] nums) {
    // optimal solution (Dutch National Flag algorithm) (0 ms)
    int low = 0; 
    int mid = 0; 
    int high = nums.length-1;
    int temp;
    while(mid <= high)
    {
        if(nums[mid] == 0)
        {
            temp = nums[mid];
            nums[mid] = nums[low];
            nums[low] = temp;
            mid ++;
            low ++;
        }
        else if(nums[mid] == 1)
        {
            mid ++;
        }
        else if(nums[mid] == 2)
        {
            // swap(nums[mid], nums[high]);
            temp = nums[mid];
            nums[mid] = nums[high];
            nums[high] = temp;
            high --;
        }
    }
    
    }
}
