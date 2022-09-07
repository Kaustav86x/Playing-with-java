/**Given an integer array nums and an integer k, return true if there are 
 * two distinct indices i and j in the array such that 
 * nums[i] == nums[j] and abs(i - j) <= k */

import java.util.*;

public class Sliding_2 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> result = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(result.containsKey(nums[i])) {
                if(i - result.get(nums[i]) <= k)
                    return true;
            }
            result.put(nums[i], i);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,4};
        int k = 3;
        boolean res = containsNearbyDuplicate(arr, k);
        System.out.print(res);
    }
}
