import java.util.*;

abstract class sportVisionShoppe
{
	String custOrderNo;
	String custOrderDate;
	float depositPymt;

	public abstract double calCharges(); 

	sportVisionShoppe(String con, String cod, float dp)
	{
		this.custOrderNo = con;
		this.custOrderDate = cod;
		this.depositPymt = dp;
		// System.out.println("Constructor called.....value assigned---");
	}
}
class cyclingGlass extends sportVisionShoppe
{
	char type_glass;
	boolean uvProtection;
	float depositPymt;

	cyclingGlass(String con, String cod, float dp, char tg, boolean uvp) // how to avoid writting all even if I don't need
	{
		super(con, cod, dp);
			type_glass = tg;
			uvProtection = uvp;
	}

	public double calCharges()
	{
		if(type_glass == 'T')
		{
			if(uvProtection==true)
				return (300.00 + 30.00);
			else
				return (300.00);
		}
		else if (type_glass  == 'P') 
		{
			if(uvProtection==true)
				return (350.00 + 30.00);
			else
				return (350.00);
		}
		else
		{
			if (uvProtection==true)
				return (400.00 + 30.00);
			else
				return (400.00);
		}
	}

	public String toString(char type_glass, boolean uvProtection)
	{
		return ("\nData member-1 of this class is = "+type_glass+" and Data member-2 of this class is = "+uvProtection+" and Data member-3 of this class is = "+this.depositPymt);
	}
}

class swimmingGlass extends sportVisionShoppe
{
	char Type;
	String style;
	swimmingGlass(String con, String cod, float dp, char ty, String sty)
	{
		super(con, cod, dp);
			Type = ty;
			style = sty;
	}
	public double calCharges()
	{
		if (Type == 'A')
		{
			if (style == "Retro")
				return (150.00 - (150.00*0.07));
			else if(style == "Warrior")
				return (150.00 - (150.00*0.3));
			else
				return (150.00 - (150.00*0.1));
		}
		else
		{
			if (style == "Retro")
				return (250.00 - (250.00*0.05));
			else if (style == "Warrior")
				return (250.00 - (250.00*0.2));
			
			 else
			 	return (250.00 - (250.00*0.07));
		}
	}
	public String toString(char Type, String style)
	{
		return ("\nData member-1 of this class is "+Type+" and Data member-2 of this class is "+style);
	}

}
public class Inherit2 
{
	public static void main(String[] args) 
	{
		int cnt1 = 0, cnt2 = 0, sum1 = 0, sum2 = 0, z = 0;
		float arr1[] = new float[10];
		double res1, res2;
		//Scanner sc = new Scanner(System.in);
		/*System.out.println("\nEnter the customer order number :- ");
		String a = sc.nextLine();
		System.out.println("\nEnter the customer order date :- ");
		String b = sc.nextLine();*/
		// sportVisionShoppe[] s = new sportVisionShoppe(a, b, c)[10];
		sportVisionShoppe[] s = new sportVisionShoppe[10];
		for(int i=0; i<10; i++)
		{
			int choice;
			Scanner sc = new Scanner(System.in);
			System.out.println("\nEnter the customer order number :- ");
			String a = sc.nextLine();
			System.out.println("\nEnter the customer order date :- ");
			String b = sc.nextLine();
			System.out.println("\nEnter 1 for cyclingGlass Class:- \nEnter 2 for swimmingGlass Class:- ");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1: 
				{ 
					//Scanner sc = new Scanner(System.in);
					System.out.println("\nEnter the type of the glass :- ");
					char gt1 = sc.next().charAt(0);
					System.out.println("\nEnter whether you want to have UV-Protection or not ? :- ");
					boolean bool1 = sc.nextBoolean();
					System.out.println("\nEnter the value of deposit payment :- ");
					float c = sc.nextFloat();
					//s[i] = new sportVisionShoppe(a, b, c);
					s[i] = new cyclingGlass(a, b, c, gt1, bool1);  // constructor called
					//sportVisionShoppe sps;       // creating another reference
					//sps = cg;
					res2 = s[i].calCharges();
					cnt1 +=1;     
					System.out.println("Cycle = "+res2);
					if(gt1 == 'T')
					{
						arr1[z] = c;
						z++;
					}
					break;
				}
				case 2:
				{
					float c = 0;
					//s[i] = new sportVisionShoppe(a, b, c);
					System.out.println("\nEnter the type of the glass :- ");
					char gt2 = sc.next().charAt(0);
					Scanner sc1 = new Scanner(System.in);
					System.out.println("\nEnter the style of the glass :- ");
					String gs = sc1.nextLine();
					// System.out.println("\nEnter the value of deposit payment :- ");
					s[i] = new swimmingGlass(a, b, c, gt2, gs);
					//sportVisionShoppe sps;
					//sps = sg;
					res2 = s[i].calCharges(); 
					System.out.println("Swimming = "+res2);
					if (gt2 == 'A')
						if (gs == "Retro"){
							res1 = s[i].calCharges();
						}
					else
					    if (gs == "Retro"){
					    	res1 = s[i].calCharges();
							sum1 += res1;

				}

					    //  total price of all retro glasses
					cnt2 += 1;      // counting people for swimming glass 
					break;
				}
			}
		}
		System.out.println("Cycle-2 = "+cnt1);
		System.out.println("Swim-2 = "+cnt2);
		System.out.println("Retro sum = "+sum1);
		for(int i=0; i<=z; i++)
		{
			System.out.println("Depo paym = "+arr1[i]);
		}
	}
}