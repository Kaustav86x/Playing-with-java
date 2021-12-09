import java.io.*;

abstract class Abstract3
{
	abstract int meth1(int i, int j);

	abstract int meth2(int i, int j);
}
class Child_Abs3 extends Abstract3
{
	int meth1(int a, int b)
	{
		return (a+b);
	}

	int meth2(int a, int b)
	{
		return (a*b);
	}
}

class Abs3
{
	public static void main(String[] args) throws IOException {

		int num1, num2, res1, res2;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nEnter the 1st number : ");
		num1 = Integer.parseInt(bf.readLine());
		System.out.print("\nEnter the 2nd number : ");
		num2 = Integer.parseInt(bf.readLine());
		Child_Abs3 ca = new Child_Abs3();

		res1 = ca.meth1(num1, num2);
		res2 = ca.meth2(num1, num2);

		System.out.println("\n(Abstract method-1)Summation of two numbers is = "+res1);
		System.out.println("\n(Abstract method-2)Multiplication of two numbers is = "+res2);

	}
}