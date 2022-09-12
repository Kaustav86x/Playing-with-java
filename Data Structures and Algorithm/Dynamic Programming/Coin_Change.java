// coin change problem

import java.util.*;

public class Coin_Change {

    public static void main(String[] args) {
        int a[] = {7,5,1}; // coins with amount
        int amount = 18;   // amount to be made

        int dp[] = new int[amount+1];
        Arrays.fill(dp, -1);
        int result = Coin(amount, a, dp);
        System.out.println(result);
    }

        static int Coin(int amount, int a[], int dp[]) {
            if(amount == 0) return 0;

            int ans = Integer.MAX_VALUE; 
        
            for(int i=0; i<a.length; i++) {
                if(amount-a[i] >= 0) {
                    int subans = 0;
                    if(dp[amount - a[i]] != -1)
                        ans = dp[amount - a[i]];
                    else {
                        subans = Coin(amount-a[i], a, dp);
                    }
                    if(subans != Integer.MAX_VALUE && subans + 1 < ans)
                        ans = subans + 1;
                }
            }
            return ans;
        }
}