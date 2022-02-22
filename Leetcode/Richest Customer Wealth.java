class Solution {
    public int maximumWealth(int[][] accounts) {
        int i, j, sum;
        int[] res = new int[accounts.length];
        for(i=0; i<accounts.length; i++)
        {
            sum = 0;
            for(j=0; j<accounts[i].length; j++)
            {
                sum += accounts[i][j];
            }
            res[i] = sum;
        }
        int max = Arrays.stream(res).max().getAsInt();
        return max;
    }
}
