import java.io.*;
import java.util.*;

public class ShellSort 
{

    public static void sort(int arr[])
    {
        int n = arr.length;
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];
                arr[j] = temp;
            }
        }
    }
    public static void main(String[] args) throws IOException { 
        int val, i, a;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter the no of terms : ");
        val = Integer.parseInt(bf.readLine());
        int arr[] = new int[val];
        System.out.println("\nEnter the values: ");
        for(i=0; i<val; i++)
        {
            a = Integer.parseInt(bf.readLine());
            arr[i] = a;
        }

        sort(arr);

        System.out.println("\nThe sorted array : \n");
        for(int j=0; j<val; j++)
        {
            System.out.println(arr[j]);
        }
    }
}