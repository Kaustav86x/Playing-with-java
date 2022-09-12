/**Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence. 
 * ex - num = [1,2,3,5,7,8,4]
 * output : 5 (cuz - 1,2,3,4,5 belong consecutively)
*/


import java.util.*;
import java.io.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++) {
            hs.add(nums[i]);
        }
        int length, max_length = 0;
        for(int j=0; j<nums.length; j++) {
            if(!hs.contains(nums[j]-1)) {
                length = 1;
                while(hs.contains(nums[j] + length))
                    length += 1;
                max_length = Integer.max(max_length, length);
            }
        }
        return max_length;
    }
}

public class LongSub {
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 2, 8, 9, 3, 9, 10};
        Solution s = new Solution();
        int res = s.longestConsecutive(arr);
        System.out.print(res);
    }
}