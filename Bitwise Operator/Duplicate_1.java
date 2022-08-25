import java.util.Arrays;

// works only if the number of duplicate eliments are in evern numbers (each one of them) 
// or it'll XOR the odd number of elements and give the result

public class Duplicate_1 {

    public static int EvenDuplicate(int num[]) {
        int result = 0;
        for(int i=0; i<num.length; i++) 
            result = result^num[i];
        return result;
    }

    // works only if the number of duplicate eliments are in odd numbers (each one of them) 
    // or it'll XOR the odd number of elements and give the result

    public static int EvenOrOddDuplicate(int num[]) {
        // int result = 0;
        int val[] = new int[num.length];
        for(int i=0; i<num.length; i++) {
            int level = 0;
            for(int j=0; j<num.length; j++) {
                if(num[i] == num[j]) 
                    level += 1;
            }
            val[i] = level; // val[0] = 3
        }
        int temp_arr[] = val.clone();
        Arrays.sort(val); // extract the last digit to get the largest number
        int temp = temp_arr[val.length-1]; // value of the last index of temp_arr (3)
        int res_index = 0;
        for(int i=0; i<num.length; i++) {
            if (temp_arr[i]%temp == 0)
                res_index = num[i];
        }     // result = result | num[i]; 
        return res_index;
    }
    public static void main(String[] args) {
        // int arr1[] = {2,2,3,4,4,5,5,3,7}; // should return 7
        int arr2[] = {2,3,3,2,4,5,5,4,3,4,2,5,6,6,7,6}; //  should return 7
        // int result1 = EvenDuplicate(arr1);
        int result2 = EvenOrOddDuplicate(arr2);
        // System.out.print(result);
        System.out.print(result2);
        // EvenOrOddDuplicate(arr2);
    }
}
