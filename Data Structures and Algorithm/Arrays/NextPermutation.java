class Solution {
    public void nextPermutation(int[] nums) {
        int ind1 = -1;
        int ind2 = -1;
        // we need to find the breakpoint
        for(int i=nums.length-2; i>=0; i--)
        {
            if(nums[i] < nums[i+1])
            {
                ind1 = i;
                break;
            }    
        }
        // couldn't find any breakpoint'
        if(ind1 == -1)
        {
            // if no breakpoint found, reverse the array
            reverse(nums,0);
        }
        else 
        {
        // initiated the next bioggest paremutation value
        for(int i=nums.length-1; i>=0; i--) 
        {
            if(nums[i] > nums[ind1])
            {
                ind2=i;
                break;
            }
        }
        // swap b/w the breakpoint and a value slightly greater than the breakpoint ie;
        // the second largest value in the array
        swap(nums,ind1,ind2);
        // reversed the right part (following after the dip)
        reverse(nums,ind1+1);
    }
    }
        // reverse the from n-1 to upto ind
        public void reverse(int[] nums, int start)
        {
            int i=start;
            int j=nums.length-1;
            while(i<j)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
        public void swap(int[] nums, int a, int b)
        {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }
    }
