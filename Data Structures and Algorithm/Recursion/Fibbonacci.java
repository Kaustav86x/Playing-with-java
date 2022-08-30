// without recursion

import java.lang.Math;

public class Fibbonacci {

    static int FiboCal(int n) {
            // program to find nth fibbonacci term
            return (int)(Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }
    public static void main(String args[]) {
        // for(int i=1; i<11; i++) {
            System.out.println(FiboCal(50));
        // }
    }
}