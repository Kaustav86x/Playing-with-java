interface A 
{
	int i = 1;
}
class B implements A 
{
	void method()  // local host 
	{
		i = 2;
	}
}
class interface3 
{
	public static void main(String[] args) {
		B b1 = new B();
		b1.method(); 
	}
}