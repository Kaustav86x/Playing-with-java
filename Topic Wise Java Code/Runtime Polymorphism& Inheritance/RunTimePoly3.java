// Runtime polymorphism with constructor overloading and method overriding


class Asia
{
    int a;
    Asia()
    {
        System.out.println("\nThis is the biggest continent - Asia.");
    }
    Asia(int c)
    {
        a = c;
        System.out.println("\nThere are total "+a+" countries in Asia.");
    }
    public void Us(String coun)
    {
        System.out.println("\nThe country we live in is "+coun+".");
    }
}
class India extends Asia
{
    int z;
    India()
    {
        System.out.println("\nIndia is the country we live in.");
    }
    // constructor overloading
    India(int n, int t)
    {
        // constructor inherited
        super(n);
        z = t;
        System.out.println("\nIndia is the "+n+"th largest country of the world and the "+z+"nd largest country of the Asia.");  
    }
    // method overriding
    public void Us(String state)
    {
        // method inherited using super()
        super.Us("India");
        System.out.println("\nThe largest state of India is - "+state);
    }
}
public class RunTimePoly3 {
    public static void main(String args[])
    {
        // runtime polymorphism
        Asia obj1 = new India();
        Asia obj2 = new India(7, 2);
        obj1.Us("Rajasthan");
    }
}
