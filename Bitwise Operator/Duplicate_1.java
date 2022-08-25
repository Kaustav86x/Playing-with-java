// works only if the number of duplicate eliments are in evern numbers (each one of them) 
// or it'll XOR the odd number of elements and give the result

public class Duplicate_1 {

    public static int EvenDuplicate(int num[]) {
        int result = 0;
        for(int i=0; i<num.length; i++) 
            result = result^num[i];
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,3,4,4,5,5,3,7}; // should return 7
        int result = EvenDuplicate(arr);
        System.out.print(result);
    }
}
