// generate all the strings of n bits 

import java.util.*;
import java.io.*;

public class backtrac1 {
    int[] A ;

    public backtrac1(int n)
    {
        A = new int[n];
    }

    public void binary(int n)
    {
        if(n<=0)
        {
            System.out.println(Arrays.toString(A));
        }
        else {
            A[n-1] = 0;
            binary(n-1);
            A[n-1] = 1;
            binary(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        backtrac1 i = new backtrac1(n);
        i.binary(n);

        sc.close();
    }
}

