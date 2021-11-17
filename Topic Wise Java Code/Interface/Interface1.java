interface INF 
{
	void meth(int r); // inside the interface - no function definition
}
class S implements INF 
{
	public void meth(int x) // must be declared as public
	{
		double res1 = 4 * 3.14 * (x*x);
		System.out.println("Surface area = "+res1);
	}
}
class Vol implements INF 
{
	public void meth(int y)  // same here
	{
		double res2 = 4 * 3.14 * (y*y*y) / 3;
		System.out.println("Volume = "+res2);
	}
}
class Interface1 
{
	public static void main(String[] args) {
		S obj1 = new S();
		obj1.meth(10);
		Vol obj2 = new Vol();
		obj2.meth(12);
	}
}