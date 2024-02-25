class Solution {
    public List<List<Integer>> merge(int[][] intervals) {
    // we need to check the 2nd element of ith interval and 1st element of jth interval
    int n = intervals.length; 
        // sort the given intervals (sorting an array of arrays)
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
    List<List<Integer>> result = new ArrayList<>();
    // int[][] result = new int[intervals.length][2];
    for(int i=0; i<n; i++)
    {
        // if a non-overlapping pair/new pair is found, add it to the result
        if(result.isEmpty() || intervals[i][0] > result.get(result.size() - 1).get(1))
        {
            result.add(Arrays.asList(intervals[i][0], intervals[i][1]));
        }
            //result.add(Arrays.asList(intervals[i][0], intervals[i][1]));
        else
        {
            // result[result.length-1][1] = Math.max(result[result.length-1][1], intervals[i][1]);
            result.get(result.size()-1).set(1,Math.max(result.get(result.size()-1).get(1), intervals[i][1]));
        }
    }
    return result;
    }
}
