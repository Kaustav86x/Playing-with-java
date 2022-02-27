class Solution {
    public boolean checkIfExist(int[] arr) {
        int len = arr.length;  
        boolean res = false;
        for(int i=0; i<len; i++)
        {
            for(int j=0; j<len; j++)
            {
                if(arr[i] == 2 * arr[j] && i!=j)
                {
                    res = true;
                }
            }
        }
        return res;
    }
}
