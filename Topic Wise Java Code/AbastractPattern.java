abstract class Inheritence 
{
    int z;
    Inheritence(int a) {
        z = a;
    }
    abstract void Pattern();
}
class Pattern1 extends Inheritence
{
    Pattern1(int b)
    {
        super(b);    // constructor inherited
    }
    void Pattern()
    {
        for(int i=0; i<z; i++)
        {
            for(int j=0; j<(2*i+1); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

}
class Pattern2 extends Inheritence
{
    Pattern2(int c)
    {
        super(c);      // constructor inherited
    }
    void Pattern()
    {
        for(int i=z; i>=0; i--)
        {
            for(int j=(2*i-1); j>0; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class Pattern3 extends Inheritence 
{
    Pattern3(int d)
    {
        super(d);
    }
    void Pattern()
    {
        int line = z;
        for(int i=0; i<line; i++)
        {
            for(int j=z-1; j>0; j--)
            {
                System.out.print(" ");
            }
            z-=1;
            for(int k=0; k<(2*i+1); k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class AbastractPattern {
    public static void main(String args[])
{
    Pattern1 p1 = new Pattern1(6);
    p1.Pattern();
    Pattern2 p2 = new Pattern2(6);
    p2.Pattern();
    Pattern3 p3 = new Pattern3(6);
    p3.Pattern();
}
}
