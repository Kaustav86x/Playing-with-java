/* Write a program in java to implement several systems defined exceptions (Null Pointer, Array Index Out of Bound, String Index Out of Bound). */

class excp4
{
	public static void main(String[] args)
	{
		for(int i=0; i<3; i++)
		{
			int res;
			try
			{
				switch(i)
				{
					case 0:
					     int arr1[] = null;
					     res = arr1[0];
					     break;

					case 1:
					     int arr2[] = new int[10];
					     res = arr2[11];
					     break;
					case 2:
					     char ch = "Kaustav".charAt(20);
					     break;
					              
				}
			}
			catch(Exception ex)
			{
				System.out.println("\nTest case : "+i+"\t");
				System.out.println("The exception :- "+ex);
			}
		}
	}
}