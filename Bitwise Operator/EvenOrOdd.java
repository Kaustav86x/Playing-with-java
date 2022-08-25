import java.util.*;

public class EvenOrOdd {

    // check if a given number is even or odd
    public static boolean EvOrOd(int num) {
        if((num & 1) == 1) return false; else return true;
    }
    
    // set the ith bit to 1 if 0 or 1 either and returning the modified number
    public static void SetIthBit(int num, int i) {
        int result = num | (1 << (i-1));
        System.out.print(result); 
    }

    // reset the ith bit to 0 if 1 or 0 either and returning the modified number
    public static void ResetIthBit(int num, int i) {
        int fbit = (~(1 << (i-1)));
        int result = num & fbit;
        System.out.print(result); 
    }

    // find the ith bit of a number and return the bit
    public static int FindIthBit(int num, int i) {
        int result = num & (1 << (i-1)) >> (i-1);
        return result;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        // System.out.print("Specify the bit : ");
        // int bit = sc.nextInt();

        // to determine evern or odd
        String result1 = !EvOrOd(num) ? "Even" : "Odd";
        // SetIthBit(num, bit);
        // ResetIthBit(num, bit);
        // int result2 = FindIthBit(num, bit);

        System.out.print("Even or Odd : " + result1);
        // System.out.print("The ith Bit is : " + result2);

        sc.close();

    }
}