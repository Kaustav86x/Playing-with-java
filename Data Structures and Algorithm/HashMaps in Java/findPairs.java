import java.util.*;


public class Main {
    
    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target)
    {
        List<int[]> result = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        for(int i : arr1)
        {
            set1.add(i);
        }
        for(int i : arr2)
        {
            if(set1.contains(target - i))
                result.add(new int[]{i, target-i});
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }

        /*
            EXPECTED OUTPUT:
            ----------------
            [5, 2]
            [3, 4]
            [1, 6]
            
        */
        
    }
    
}

    
