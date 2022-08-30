import java.util.*;
import java.io.*;

public class VowelnString {

    public static void countVowel(String src) {
        Map<Character, Integer> dic = new HashMap<>();
        String vowel = "aeiou";
        // int total_count = 0;
        for(int i=0; i<vowel.length(); i++) {
            int count = 0;
            for(int j=0; j<src.length(); j++) {
                if(vowel.charAt(i) == src.charAt(j)) {
                    count += 1;
                dic.put(src.charAt(j), count);
                }
            }
        }
        System.out.print(dic);
        // System.out.print(count);

    }
    public static void main(String[] args) throws IOException{
        // Map<Character, Integer> result = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the string : ");
        String str = br.readLine();
        
        String src = str.toLowerCase();
        countVowel(src);

        br.close();
    }
}