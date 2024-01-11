import java.util.*;


public class Main {
    
    public static List<Integer> findDuplicates(int[] arr)
    {
        HashMap<Integer, Boolean> checking = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int i:arr)
        {
            if(checking.containsKey(i))
            {
                if(!result.contains(i))
                    result.add(i);
            }
            checking.put(i, true);
        }
        return result;
    }
      

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates); 
        
        /*
            EXPECTED OUTPUT:
            ----------------
			[1, 2, 4]

        */
        
    }

}
