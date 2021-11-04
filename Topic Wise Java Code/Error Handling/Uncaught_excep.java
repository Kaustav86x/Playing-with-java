public class Uncaught_exception 
{
    static void sub() // without creating object
    {
        int d = 0;
        int a = 50 / d; // exception
        System.out.println(a);
    }
    public static void main(String args[])
    {
        Error1.sub(); // without creating object
    }
}
