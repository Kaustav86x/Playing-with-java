// example of thread creation by extending the thread class 

class ThreadCreate extends Thread
{
	public void run()
	{
		System.out.println("Hello");
	}

	public static void main(String[] args)
	{
		ThreadCreate t1 = new ThreadCreate();
		// t1.start(); // implicit call (executing a function without even calling it)
		t1.run(); // explicit call

	}
}