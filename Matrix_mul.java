import java.io.*;

class Matrix 
{
	int i, j, k;
	public void Multiplication(int R[][], int A[][], int B[][], int r1, int c1, int c2)
	{
		for(i=0; i<r1; i++)
		{
			for(j=0; j<c2; j++)
			{
				for(k=0; k<c1; k++)
				{
					R[i][j] += A[i][k] * B[k][j];
				}
				System.out.print(R[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
}

class Matrix_mul
{
	public static void main(String[] args) throws IOException 
	{
		int row1, col1, row2, col2, i, j;

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("\nEnter the no of rows for Matrix-1 : ");
		row1 = Integer.parseInt(bf.readLine());

		System.out.print("\nEnter the no of columns for Matrix-1 : ");
		col1 = Integer.parseInt(bf.readLine());

		System.out.print("\nEnter the no of rows for Matrix-2: ");
		row2 = Integer.parseInt(bf.readLine());

		System.out.print("\nEnter the no of columns for Matrix-2: ");
		col2 = Integer.parseInt(bf.readLine());

		int arr1[][] = new int[row1][col1];
		int arr2[][] = new int[row2][col2];

		if(col1 != row2)
		{
			System.out.println("\nMatrix Multiplication is not possible !");
		}
		else
		{

			int arr3[][] = new int[row1][col2];

			System.out.println("\nTaking input for Matrix-1");

			for(i=0; i<row1; i++)
			{
				for(j=0; j<col1; j++)
				{
					System.out.print("\nEnter the "+"["+i+"]"+"["+j+"]"+"th value: ");
					arr1[i][j] = Integer.parseInt(bf.readLine());
				}
			}

			System.out.println("\nTaking input for Matrix-2");

			for(i=0; i<row2; i++)
			{
				for(j=0; j<col2; j++)
				{
					System.out.print("\nEnter the "+"["+i+"]"+"["+j+"]"+"th value: ");
					arr2[i][j] = Integer.parseInt(bf.readLine());
				}
			}

			Matrix mt = new Matrix();

			System.out.println("\nThe resultant Matrix : \n");

			mt.Multiplication(arr3, arr1, arr2, row1, col1, col2);
		
		}
	}
}