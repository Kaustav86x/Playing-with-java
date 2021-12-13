// example of thread creation by implementing the Runnable class 

class ThreadCreateInt implements Runnable
{
	public void run()
	{
		System.out.println("Hello");
	}

	public static void main(String[] args)
	{
		ThreadCreateInt t2 = new ThreadCreateInt();
		Thread th1 = new Thread(t2);
		th1.start();
		// th1.run();
	}

}