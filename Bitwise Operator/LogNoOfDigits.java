// no of digits in base b of no. n (like 10 = 2^(3.32) so the ans will be 4 )
// considering the integer value (as it's more than 3) 
import java.lang.Math;

public class LogNoOfDigits {
    public static int NoOFDigits(double val, double b) {
        int result = (int) (Math.log(val) / Math.log(b)) + 1;
        return result;
    }
    public static void main(String[] args) {
        double val = 17.0, b = 2.0;
        int result = NoOFDigits(val,b);
        System.out.print(result);
    }
}
