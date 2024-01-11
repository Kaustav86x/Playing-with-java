import java.util.HashMap;

public class Main {

    public static boolean itemInCommon(int[] array1, int[] array2)
    {
        HashMap<Integer,Boolean> result = new HashMap<>();
        for(int i: array1)
            result.put(i, true);
        // result now contains - { 1:true, 3:true, 5:true }
        for(int j : array2)
        {
            // if the value exists in the hashmap return true
            if(result.get(j) != null)
                return true;
        }
        return false;
    }
    

    public static void main(String[] args) {

        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};

        System.out.println(itemInCommon(array1, array2));
        
        /*
            EXPECTED OUTPUT:
            ----------------
            true

        */
        
    }

}
