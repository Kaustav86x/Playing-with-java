class Dogs
{
   public void All()
   { 
      System.out.println("\nRepresenting all the Dogs.\n");
   }
}

class Bulldog extends Dogs 
{
   int d1;
   boolean d2;
   // Method Overriding
   public void All()
   {
      super.All();
      System.out.println("\nRepresenting the Bulldog.\n");
   }
}

public class RunTimePoly1 {
    public static void main(String args[])
    {
      Bulldog obj1 = new Bulldog();
      // printing default constructor 
      System.out.println("d1 = " + obj1.d1);
      System.out.println("d2 = " + obj1.d2);
      obj1.All();
    }
}
