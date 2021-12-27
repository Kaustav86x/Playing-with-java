import java.math.*;
import java.util.*;
import java.io.*;
import java.lang.*;


public class DecToBin 
{
    public static void main(String[] args) {
        // int num1, res;
        // String str;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number : ");
        // num1 = sc.nextInt();
        // str = Integer.toString(num1, 2);
        // // System.out.println(str);
        // Convert obj1 = new Convert();
        // res = obj1.MinMax(str);
        // System.out.println(res);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int consec1=0;
        String strBinary = Integer.toString(n, 2);
   // above is binary of given in in string
        String[] strparts = strBinary.split("0");
    //above we get all strings of ones, below find max from them
        for(int i=0;i<strparts.length;i++ )
        {
            if (consec1 < strparts[i].length()) 
            {
                consec1 = strparts[i].length();
            }
        }
            System.out.println(consec1);  //result
            in.close();
    }
}