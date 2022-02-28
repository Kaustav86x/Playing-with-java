/* Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order. */

class Solution {
    public int[] inter(HashSet<Integer> set1, HashSet<Integer> set2)
    {
        int[] output = new int[set1.size()];
        int idx = 0;
        for(Integer s: set1)
        {
            if(set2.contains(s)) 
            {
                output[idx++] = s;
            }
        }
        return Arrays.copyOf(output, idx);
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        for(Integer n : nums1) 
        {
            set1.add(n);
        }
        HashSet<Integer> set2 = new HashSet<Integer>();
        for(Integer n : nums2) 
        {
            set2.add(n);
        }
        
        if(set1.size() > set2.size())
        {
            return inter(set2, set1);
        }
        else return inter(set1, set2);
    }
}
