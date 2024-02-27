class Solution {
    // Linked list cycle method
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        // why do while ? cuz for the first iteration slow == fast
        do
        {
            // using indexes as the refeerence to the next value
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        while(slow != fast);
        fast = nums[0];
        // when fast == slow, it's the repeated value
        while(slow != fast)
        {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}

// better solution :-)

// class Solution {
//     public int findDuplicate(int[] nums) {
//        boolean arr[] =new boolean[nums.length];
//        for(int num : nums)
//             if(arr[num]==false)
//                 arr[num]=true;
//             else
//                 return num;
//        return 0;
//     }
// }
