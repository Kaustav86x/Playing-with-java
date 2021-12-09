import java.io.*;

abstract class Abstract5 
{
	int detective, horror;
	String writer_1, writer_2;

	abstract void display();

	Abstract5()
	{
		detective = 0;
		horror = 0;
		writer_1 = "";
		writer_2 = "";
	}

	void enter(int num1, int num2, String w1, String w2)
	{
		detective = num1;
		horror = num2;
		writer_1 = w1;
		writer_2 = w2;
	}

}

class Child_Abs5 extends Abstract5
{
	void display()
	{
		System.out.println("\nThere are "+detective+" detective books by "+writer_1);
		System.out.println("\nThere are "+horror+" horror books by "+writer_2);
	}
}

class Abs5
{
	public static void main(String[] args) throws IOException
	{
		int d, h;
		String detec_writer, hor_writer;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nEnter the number of detective books :");
		d = Integer.parseInt(bf.readLine());

		System.out.println("\nEnter the number of horror books");
		h = Integer.parseInt(bf.readLine());

		System.out.println("\nEnter the name of the writer of Detective Books : ");
		detec_writer = bf.readLine();

		System.out.println("\nEnter the name of the writer of Horror Books : ");
		hor_writer = bf.readLine();

		Child_Abs5 obj1 = new Child_Abs5();

		obj1.enter(d, h, detec_writer, hor_writer);

		obj1.display();
	}
}