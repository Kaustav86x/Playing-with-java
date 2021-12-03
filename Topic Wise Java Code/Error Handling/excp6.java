/* Write a program in java to implement the multi customer Bank A/c program that displays the customer name, id and balances with the help of user input and improvise the exception if occurs. */

import java.io.*;

class BankSystemException
{
  public static void main(String args[])
  {
    for(int i=0; i<3; i++)
    {
      int k;
      try
      {
        switch(i)
        {
          case 0: 
                  int x[] = null;
                  k = x[0];
                  break;
          case 1: 
                  int y[] = new int[5];
                  k = y[6];
                  break;
          case 2: 
                  char c = "Kaustav".charAt(15);
                  break; 
        }
      }
      catch(Exception e)
      {
        System.out.println("\n Test Case #"+i+"\n");
        System.out.println("\t"+e+"\n");
      }
    }
  }
}

class The_Bank
{
  String name; int id; float balance;
  public The_Bank(String n, int i, float amt)
  {
    name = n;
    id = i;
    balance = amt;
  }
  public void disp()
  {
    //System.out.println("\n--------------------------");
    System.out.println("\n\t\tAccount holder's name: "+ name);
    System.out.println("\n\t\tAccount number: "+ id);
    System.out.println("\n\t\tAccount balance: "+ balance);
  }
}
class excp6
{
  public static void main(String args[]) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n=0;
    String name; int id; float balance;
    The_Bank b[];
    System.out.print("\nEnter the number of accounts you wish to create: ");
    n = Integer.parseInt(br.readLine());
    b = new The_Bank[n];
    for(int i=0; i<n; i++)
    {
      System.out.print("\nCREATE ACCOUNT #"+(i+1));
      System.out.print("\n\tEnter the name of the account holder: ");
      name = br.readLine();
      System.out.print("\n\tEnter the account number: ");
      id = Integer.parseInt(br.readLine());
      System.out.print("\n\tEnter the initial balance: ");
      balance = Float.parseFloat(br.readLine());
      b[i] = new The_Bank(name, id, balance);
    }
    System.out.println("\n--------------------------");
    System.out.println("\nACCOUNT DETAILS");
    for(int i=0; i<n; i++)
    {
      System.out.println("\n\tDetails of person #"+(i+1));
      b[i].disp();
    } 
  }
}
