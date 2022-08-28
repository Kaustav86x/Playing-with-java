import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// method-1 ) using bit manipulation
// let's focus on the method-2 for now
// method-2 ) using backtracking

public class Subsequence {
    
    // // using bit manipulation
    // public static void Method1() {
        
    // }

    // using backtracking
    public static void Method2(int i, String s, String f) {
        if(i == s.length()) {
            System.out.print(f+" ");
            return;
        }
        // each and every step gives up two options 
        // choose a character or don't choose a character

         // choice no 1 ( have considered the next index value )
        Method2(i+1, s, f+s.charAt(i)); 
        // choice no 2 ( have not considered the next index value )
        Method2(i+1, s, f); 
    }
    public static void main(String[] args) throws IOException {
          BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //   String initial[] = bf.readLine().split(" ");
        String initial = bf.readLine();

          String f = "";
          System.out.println("Power set : ");
          Method2(0, initial, f);
    }
}
