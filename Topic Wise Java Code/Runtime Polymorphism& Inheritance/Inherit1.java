class Dog 
{
	String name;
	int legs;
	int teeth;
	Dog (String name, int legs, int teeth) // constructor
	{
		this.name = name;
		this.legs = legs;
		this.teeth = teeth;
		System.out.println("\nThe constructor is called\n");
		System.out.println("The name of the breed is = "+this.name);
		System.out.println("The no of legs this breed has = "+this.legs);
		System.out.println("This breed has = "+this.teeth+" teeth.");
	}
	// public void getAttributes() // checking if the assignment process is workibg fine or not
	// {
	// 	/* shortcut for System.out.println() is pl */
	// 	System.out.println("The name of the breed is = "+this.name);
	// 	System.out.println("The no of legs this breed has = "+this.legs);
	// 	System.out.println("This breed has = "+this.teeth+" no of teeth.");
	// }
}
class Bulldog extends Dog 
{
	double hgt;
	Bulldog(String nm, int leg, int teeth, double height)
	{
		super(nm, leg, teeth);
		this.hgt = height; 
		System.out.println("The height of a bulldog is comparatively small, "+hgt);
	}
}
class German_Shep extends Dog
{
	String color;
	double height;
	German_Shep(String nm, int leg, int teeth, double hgt, String clr)
	{
		super(nm, leg, teeth);
		height = hgt;
		color = clr;
		System.out.println("A German Shepherd is comparatively tall, "+height);
		System.out.println("The common color is "+color);
	}
}
public class Inherit1 
{
	public static void main(String[] args) {
		Dog bd = new Bulldog("Bulldog", 4, 42, 19.87); 
		// bd.getAttributes();
		Dog gs = new German_Shep("German Shepherd", 4, 42, 27.98, "Black with gray shade");
		System.out.println("\nProgram is finished");
	}
}