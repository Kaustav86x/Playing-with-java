/*Write a program that will take an integer upto 50 and will convert in into letters (eg: 44 will be converted to Forty Four)*/

import java.io.*;

class Convert
{
	// to reuse 
	String nstr2 = "Twenty"; 
	String nstr3 = "Thirty";
	String nstr4 = "Forty";
	String nstr5 = "Fifty";

	String res1;
	public String Convert1(int num1)
	{

		if(num1 == 1)
		{
			res1 = "one";
		}
		else if(num1 == 2)
		{
			res1 = "Two";
		}
		else if(num1 == 3)
		{
			res1 = "Three";
		}
		else if (num1 == 4) 
		{
			res1 = "Four";
		}
		else if(num1 == 5)
		{
			res1 = "Five";
		}
		else if(num1 == 6)
		{
			res1 = "Six";
		}
		else if(num1 == 7)
		{
			res1 = "Seven";
		}
		else if(num1 == 8)
		{
			res1 = "Eight";
		}
		else if(num1 == 9)
		{
			res1 = "Nine";
		}

		return res1;
	}

	public String Convert2(int num1)
	{
		if (num1 >=10 && num1 <= 19)
		{
			if(num1 == 10)
			{
				res1 = "Ten";
			}
			else if(num1 == 11)
			{
				res1 = "Eleven";
			}
			else if(num1 == 12)
			{
				res1 = "Twelve";
			}
			else if(num1 == 13)
			{
				res1 = "Thirteen";
			}
			else if(num1 == 15)
			{
				res1 = "Fifteen";
			}
			else
			{
				res1 = (Convert1(num1%10)+""+"teen");
			}
		}
		return res1;
	}

	public String Convert3(int num1)
	{
		if(num1 >= 20 && num1 <= 29)
		{
			if(num1 == 20)
			{
				res1 = nstr2;
			}
			else
			{
				res1 = (nstr2+" "+(Convert1(num1%10)));
			}
		}
		return res1;
	}

	public String Convert4(int num1)
	{
		if(num1 >= 30 && num1 <= 39)
		{
			if(num1 == 30)
			{
				res1 = nstr3;
			}
			else 
			{
				res1 = (nstr3+" "+(Convert1(num1%10)));
			}
		}
		return res1;
	}

	public String Convert5(int num1)
	{
		if(num1 >= 40 && num1 <= 50)
		{
			if(num1 == 40)
			{
				res1 = nstr4;
			}
			else if(num1 == 50)
			{
				res1 = nstr5;
			}
			else
			{
				res1 = (nstr4+" "+(Convert1(num1%10)));
			}
		}
		return res1;
	}
}

class IntToString
{
	public static void main(String[] args) throws IOException {
		
		int n1, n2;
		String res = "";

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("\nEnter a number to be converted to string: ");
		n1 = Integer.parseInt(bf.readLine());

		Convert con = new Convert();

		System.out.println("\n1. Enter 1 to convert any number from 1-9\n2. Enter 2 to convert any number from 10-19\n3. Enter 3 to convert any number from 20-29\n4. Enter 4 to convert any number from 30-39\n5. Enter 5 to convert any number from 40-50\n");
		n2 = Integer.parseInt(bf.readLine());

		switch(n2)
		{
			case 1:
			{
				res = con.Convert1(n1);
			}
			case 2:
			{
				res = con.Convert2(n1);
			}
			case 3:
			{
				res = con.Convert3(n1);
			}
			case 4:
			{
				res = con.Convert4(n1);
			}
			case 5:
			{
				res = con.Convert5(n1);
			}
		}

	System.out.println("The string representation of "+n1+" is "+res);
	}
}
