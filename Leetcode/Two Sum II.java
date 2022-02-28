/*Two Sum II - Input Array Is Sorted*/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int h = numbers.length - 1;
        while(h >= l)
        {
            int res = numbers[l] + numbers[h];
            if(res == target)
            {
                return new int[] {l+1, h+1};
            }
            else if(res > target)
                h --;
            else
                l ++;
        }
        return new int[] {l+1, h+1};
    }
}
