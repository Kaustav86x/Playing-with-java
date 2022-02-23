import java.util.Arrays;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> res = new ArrayList<>(candies.length);
        // Boolean[] res = new Boolean[candies.length];
        int max, i, temp;
        for(i=0; i<candies.length; i++)
        {
            temp = candies[i] + extraCandies;
            max = Arrays.stream(candies).max().getAsInt();
            if(temp >= max)
            {
                res.add(true);
            }
            else
            {
                res.add(false);
            }
        }
        return res;
    }
}
