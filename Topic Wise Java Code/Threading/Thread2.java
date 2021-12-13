import java.lang.*;
import java.io.*;


class Thread2 implements Runnable
{
	public void run()
	{
		for(int i=0; i<6; i++)
		{
			try
			{
				Thread.sleep(1100);
			}
			catch (Exception e)
			{
				System.out.println("Exception Caught");
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		Thread2 t1 = new Thread2();
		Thread2 t2 = new Thread2();

		Thread th1 = new Thread(t1);
		th1.start();

		Thread th2 = new Thread(t2);
		th2.start();
	}
}