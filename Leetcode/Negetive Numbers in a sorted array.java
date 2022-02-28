/*Count Negative Numbers in a Sorted Matrix (for-each loop is used)*/

class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int[] n1: grid)
        {
            for(int n2: n1)
            {
                if(n2 < 0)
                    count ++;
            }
        }
        return count;
    }
}
