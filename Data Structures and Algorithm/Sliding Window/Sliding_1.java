import java.util.HashSet;

// length of the longest substring without repeating characters

public class Sliding_1 {
    public static int longest_substr(String target) {
        HashSet<Character> sh = new HashSet<Character>();
        int count = 0;
        int l_pointer = 0;
        int r_pointer = 0;
        while(r_pointer < target.length()) {
            if(!sh.contains(target.charAt(r_pointer))) {
                sh.add(target.charAt(r_pointer));
                r_pointer += 1;
                count = Math.max(count, sh.size());
            }
            else {
                sh.remove(target.charAt(l_pointer));
                l_pointer += 1;
            }
        }
        return count;
    }


    public static void main(String[] args) {

        String s = "bbbbb";
        int result = longest_substr(s);
        System.out.print("The length of the longest substring is : " + result);
        
    }
}