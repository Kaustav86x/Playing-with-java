import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int in = sc.nextInt();
        try
        {
            String st = String.valueOf(in);  // converted to string
            System.out.println("Good job");
        }
        catch (Exception e)
        {
            System.out.println("Wrong answer");
        }
    }
}
