/* Write a program in java to implement exception handling with method overriding.
argument.
*/

import java.io.*;

class Excep_Par
{
	void meth1()
	{
		System.out.println("Parent Class");
	}
}
class Excep_Child1 extends Excep_Par
{
	// Checked Exception
	void meth1() throws IOException
	{
		System.out.println("Child Class - 1");
	}
}

class excp2 {
	public static void main(String[] args) {
		
		Excep_Child1 obj1 = new Excep_Child1();
		obj1.meth1(); // Will give error 
	}
}