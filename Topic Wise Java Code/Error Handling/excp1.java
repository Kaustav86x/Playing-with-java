/* Write a program in java to implement Arithmetic System
defined exception.*/

import java.io.*;

class excp1 
{
	public static void main(String[] args) throws IOException {

		int num1, res;

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter a number:-  ");
		num1 = Integer.parseInt(bf.readLine());
		try{
			System.out.println("\nDividing by Zero.......");
			res = num1/0;
		}
		catch(Exception e){
			System.out.println("\nThe exception is = "+e);
		}
	}
}