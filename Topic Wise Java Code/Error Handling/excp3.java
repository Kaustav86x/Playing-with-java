/* Write a program in java to create your own exception. */


import java.io.*;

class MyException1 extends Exception
{

	public String meth1()
	{
		return("This method is from an user-defined Exception class");
	}
}

class MyException2
{
	public void errr(int a) throws MyException1 
	{
		if(a%2 == 0)
		{
			throw new MyException1();
		}
	}
}

class excp3 
{
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter a number : ");
		int num1 = Integer.parseInt(bf.readLine());

		MyException2 obj1 = new MyException2();

		try
		{
			obj1.errr(num1);
		}
		catch (MyException1 exp)
		{
			System.out.println("\nThis is user defined exception\n");
			System.out.println(exp.meth1());
		}
	}
}