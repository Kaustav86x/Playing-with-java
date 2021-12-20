import java.util.*;
import java.io.*;

class HashSol{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> phnbook = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phnbook.put(name,phone);  
        }
        boolean isKeyPresent;
        while(in.hasNext()){
            String s = in.next();
            isKeyPresent = phnbook.containsKey(s);
            
            if(isKeyPresent)
            {
                System.out.println(s+"="+phnbook.get(s));
            }
            else
            {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}