class Solution {
    // giving us a whole row for every single line
    List<List<Integer>> result = new ArrayList<>();
    public List<Integer> SingleRow(int lineNum)
    {
        List<Integer> row = new ArrayList<>();
        int ans = 1;
        row.add(1);
        for(int i=1; i<lineNum; i++)
        {
            ans = ans*(lineNum - i);
            ans = ans/i;
            row.add(ans);
        }
        return row;
    }
    public List<List<Integer>> generate(int numRows) {
        for(int i=1; i<=numRows; i++)
            // List<Integer> temp = new ArrayList<>();
            result.add(SingleRow(i));
    return result;
    }
}
