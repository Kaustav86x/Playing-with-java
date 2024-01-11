import java.util.*;


public class Main {
    
    public static Character firstNonRepeatingChar(String string)
    {
        HashMap<Character, Integer> myMap = new HashMap<>();
        // Hashmap<Character, Boolean> filtering = new HashMap<>();
        ArrayList<Character> myList = new ArrayList<>();
        char[] result = string.toCharArray();
        int count = 0;
        Character c = null; // char c = null does not work !!!
        for(char ch:result)
        {
            // hashMap with values l:0, e:1, t:2, c:3, o:4, d:5
            if(!myMap.containsKey(ch))
            {
                myMap.put(ch,count);
                count += 1;
            }
            else
                myList.add(ch);
        }
            // values inside myList are the duplicate values
        for(int i=0; i<myList.size(); i++)
            myMap.remove(myList.get(i));
            // after this loop myMap would looks like - l:0, t:2, c:3, o:4, d:5 (collection of non-repeating characters)
        for (Character chr : myMap.keySet() ) 
        {
            // string the first non-repetative character
            c = chr;
            break;
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));
        
        /*
            EXPECTED OUTPUT:
            ----------------
            l
            h
            null

        */
        
    }
    
}
