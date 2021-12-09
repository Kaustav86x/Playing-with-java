import java.io.*;


abstract class Fruit
{
	abstract void getcolor();

	void getshape()
	{
		System.out.println("\nThis method will determine the shape of the fruit. ");
	}
}

class Mango extends Fruit
{
	void getcolor()
	{
		System.out.println("\nThis method will determine the color of the fruit. ");
	}
}

class Abs4
{
	public static void main(String[] args)
	{
		Mango mg = new Mango();

		mg.getcolor(); // abstract method
		mg.getshape(); // non-abstract method
	}
}