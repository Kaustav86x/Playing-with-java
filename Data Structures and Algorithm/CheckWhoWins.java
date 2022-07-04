// 
// condition given that no two voters have got the same amount of vote (Only one winner)

public class CheckWhoWins {
    public static int Wins(int[] arr) {
        int cand = 0, n = arr.length, vote_count = arr[0], final_count = 0;
        for(int i=0; i<n; i++)
        {
            vote_count = 0;
            for(int j = i+1; j<n; j++) 
            {
                if(arr[i] == arr[j]) {
                    vote_count ++;
                }
            }
            if(vote_count > final_count) {
                final_count = vote_count;
                cand = arr[i];
                // System.out.println(cand);
            }
        }
        // System.out.println(final_count);
        return cand;
    }
    public static void main(String[] args) {
        int A [] = {1,5,3,7,5,6,6,6};
        int result = Wins(A);
        // Wins(A);
        System.out.println(result);
    }
}
