class Manager 
{
    public void getData(String n)
    {
        System.out.println("\nManager Name: "+n);
    }
    // method overloading
    public void getData(String n, int id)
    {
        System.out.println("\nManager Name: "+n);
        System.out.println("\nId no: "+id);
    }
}
class Emp extends Manager
{
    public void getData(String n)
    {
        // constructor inheritance
        super.getData("Yash");
        System.out.println("\nEmployee Name: "+n);
    }
    // method overloading
    public void getData(String n, int id)
    {
        super.getData("Yash", 815);
        System.out.println("\nEmployee Name: "+n);
        System.out.println("\nId no: "+id);
    }
}
public class RunTimePoly4 {
    public static void main(String args[])
    {
        // runtime polymorphism
        Manager obj = new Emp();
        obj.getData("Kaustav");
        obj.getData("Kaustav", 731);
    }
}
