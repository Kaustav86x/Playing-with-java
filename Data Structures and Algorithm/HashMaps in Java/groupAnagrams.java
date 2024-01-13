import java.util.*;


public class Main {
    
    // WRITE GROUPANAGRAMS METHOD HERE // 
    //                                 //
    //                                 //
    //                                 //
    //                                 //
    /////////////////////////////////////
    public static List<List<String>> groupAnagrams(String[] arrStr)
    {
        HashMap<String, List<String>> myMap = new HashMap<>();
        for(String string : arrStr)
        {
            // for the first element - "eat"
            char[] chars = string.toCharArray(); //['e', 'a', 't']
            Arrays.sort(chars); // ['a', 'e', 't']
            String cannonical = new String(chars); //"aet"
            
            if(myMap.containsKey(cannonical))
                myMap.get(cannonical).add(string);
            else
            {
                List<String> group = new ArrayList<>();
                group.add(string);
                myMap.put(cannonical, group);
            }
        }
        return new ArrayList<>(myMap.values());
    }
    

    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

        /*
            EXPECTED OUTPUT:
            ----------------
            1st set:
            [[eat, tea, ate], [tan, nat], [bat]]

            2nd set:
            [[abc, cba, bac], [foo], [bar]]

            3rd set:
            [[listen, silent], [triangle, integral], [garden, ranged]]

        */
        
    }
    
}
