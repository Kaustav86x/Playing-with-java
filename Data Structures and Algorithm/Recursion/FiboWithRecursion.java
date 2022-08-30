import java.io.*;

public class FiboWithRecursion {
    public static void Fibbo(int terms) {
        int t1 = 0, t2 = 1, t3;
        System.out.print(t1 + " ");
        System.out.print(t2 + " ");
        // System.out.print(t3);
        for(int i=2; i<terms; i++) {
            t3 = t1 + t2;
            System.out.print(t3 + " ");
            t1 = t2;
            t2 = t3;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of terms : ");
        int num = Integer.parseInt(br.readLine());
        Fibbo(num);
    }
}
