interface x 
{
	void method();
}
class y implements x 
{
	public void method() // must be public
	{
		System.out.println("Hi");
	}
}
public class Interface2
{
	public static void main(String[] args) {
		y obj1 = new y();
		obj1.method();
	}
}