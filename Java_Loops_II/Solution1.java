import java.util.*;
import java.io.*;

public class Solution1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int res = a;
            
            for(int j=0; j<n; j++){
                res += Math.pow(2, j)*b;
                System.out.printf("%s ", res);
            }
            System.out.println();
        }
        in.close();
    }
}