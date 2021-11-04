public class Try_and_catch {
    public static void main(String[] args) {
        int d, a;

        try 
        {
            d = 0;
            a = 42 / d; // exception
            System.out.println("This line will not get executed");
        }
        catch (ArithmeticException excp) // named a particular exception
        {
            System.out.println("Divison by zero didvison has occured. Stopped the execution furthur");
        }
    }
}
