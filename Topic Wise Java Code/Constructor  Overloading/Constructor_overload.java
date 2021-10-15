public class OnlyConstruct {
    
    int mul1, sum;
    double mul2;
    float div;
    public OnlyConstruct(int a, int b)
    {
        mul1 = a * b;
        System.out.println("\n"+"Integer Multiplication of "+a+" and "+b+" is = " + mul1+"\n");
    }
    public OnlyConstruct(double a, double b)
    {
        mul2 = a * b;
        System.out.println("Double multiplication of "+a+" and "+b+" is = " + mul2+"\n");
    }
    public OnlyConstruct(char a, char b)
    {
        sum = a + b;
        System.out.println("The addition of two characters "+a+" and "+b+" is = " + sum+"\n");
    }
    public OnlyConstruct(float a, float b)
    {
        div = a/b;
        System.out.println("The float divison of "+a+" and "+b+" is = " + div+"\n");
    }

    public static void main(String args[])
    {
        OnlyConstruct o1 = new OnlyConstruct(10, 20);
        OnlyConstruct o2 = new OnlyConstruct(34.5, 89.3);
        OnlyConstruct o3 = new OnlyConstruct('A','B');
        OnlyConstruct o4 = new OnlyConstruct(34.5f, 89.3f);
     }
}
