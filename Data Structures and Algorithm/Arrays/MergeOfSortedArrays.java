// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         // we'll apply the 2 pointer approach
//         int left = m-1; // last index of array nums1
//         int right = 0;
//         int k = m + n - 1;
//         // small values are on right, and large ones are on left
//         while(left >= 0 && right < n)
//         {
//             if(nums1[left] > nums2[right])
//             {
//                 int temp = nums1[left];
//                 nums1[left] = nums2[right];
//                 nums2[right] = temp;
//                 left--;
//                 right++;
//             }
//             else
//                 break;
//         }
//         // now we have nums1 with smaller values, nums2 with bigger values
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
//         for(int i=n-1; i>=0; i--)
//         {
//                 nums1[k] = nums2[i];
//                 k--;
//         }
//         for(int i=nums1.length-1; i>=m; i--)
//         {
//             if(k >= 0)
//             {
//                 nums1[k] = nums1[i];
//                 k--;
//             }
//             else
//                 break;
            
//         }
//     }
// some code fixes need to be done
// }

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}
