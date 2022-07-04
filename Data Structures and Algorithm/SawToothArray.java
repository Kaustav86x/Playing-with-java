import java.util.Arrays;

public class SawToothArray {
    public static void sawtoothpattern(int[] arr) {
        for(int i=1; i<arr.length; i+=2) {
            if(i+1 < arr.length) {
                swap(arr, i, i+1);
            }
        }
    }
    public static void swap(int[] A, int m, int n) {
        int temp;
        temp = A[m];
        A[m] = A[n];
        A[n] = temp;
    }
    public static void main(String[] args) {
        int[] A = {13, 7, 6, 45, 21, 9};
        Arrays.sort(A);
        sawtoothpattern(A);
        for(int i=0; i<A.length; i++)
        {
            System.out.println(A[i]);
        }
    }
}
