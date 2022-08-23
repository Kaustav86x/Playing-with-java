import java.util.*;

public class MagicNumber {

    public static int Mnumber(int num) {
        int ans = 0;
        int base = 5;
        while(num > 0) {
            int ldigit = num & 1;
            ans += ldigit * base;
            num = num >> 1;
            base *= 5;
        }
        return ans;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth number to find magic number : ");
        int num = sc.nextInt();
        int result = Mnumber(num);
        System.out.print(result);
        sc.close();
    }
}
