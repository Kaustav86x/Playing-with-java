/*Write a program in java to create user defined Arithmetic exception and take the user input (Using Classes). */

import java.io.*;

class New_Expt extends Exception
{
    private int exp;
    New_Expt(int a)
    {
        exp=a;
    }
    public String toString()
    {
        return ("Exception occured:The number is even ");
    }
}

class excp5
{
    static void compute(int a)throws New_Expt
    {
        System.out.println("Function Called, value passed :- "+a);
        if(a%2 == 0)
            throw new New_Expt(a);
        System.out.println("Number is an Odd Number.");
    }
    public static void main(String args[])throws IOException
    {
        int c,b;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first number (Odd): ");
        b=Integer.parseInt(br.readLine());
        System.out.println("Enter the second number (Even): ");
        c=Integer.parseInt(br.readLine());
        try
        {
            compute(b);
            compute(c);
        }
        catch(New_Expt e)
        {
            System.out.println(e);
        }
    }
}