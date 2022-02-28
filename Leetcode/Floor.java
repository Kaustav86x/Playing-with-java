public class Floor
{
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 1;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    // return the index of greatest no <= target no
    static int floor(int[] arr, int target) {

        // what if the target no. is the smallest no so, greatest no. smaller than the target won't be found
        if (target < arr[0]) {
            // just an indication that target no is the samllest no. 
            return Integer.MAX_VALUE;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return end;
    }
}
