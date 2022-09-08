/** Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.

Lily decides to share a contiguous segment of the bar selected such that:

The length of the segment matches Ron's birth month, and,
The sum of the integers on the squares is equal to his birth day.
Determine how many ways she can divide the chocolate.

Example
s = [2, 2, 1, 3, 2]
d = 4
m = 2

Lily wants to find segments summing to Ron's birth day d = 4,  with a length equalling his birth month m = 2, . In this case, there are two segments meeting her criteria:  

[2,2] and [1,3]

Function Description

Complete the birthday function in the editor below.

birthday has the following parameter(s):

int s[n]: the numbers on each of the squares of chocolate
int d: Ron's birth day
int m: Ron's birth month
Returns

int: the number of ways the bar can be divided*/


import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
import java.util.*;
// import java.util.concurrent.*; 
// import java.util.regex.*; 

class Result {
    public int birthday(List<Integer> s, int d, int m) {
    // Write your code here
    int result = 0;
    int count = 0;
    for(int i=0; i<m; i++) {
        result += s.get(i); // making the first frame
    }
    if(result == d) {
        count += 1;
    }
    for(int i=m; i<s.size(); i++) {
        result += s.get(i) - s.get(i-m);
        if(result == d) count += 1;
    }
    return count;
    }
}

public class Sliding_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> val = new ArrayList<Integer>();
        
        val.add(2);
        val.add(2);
        val.add(1);
        val.add(3);
        val.add(2);

        int frame_size = 2;
        int target_number = 4;
        Result res = new Result();
        int result = res.birthday(val, target_number, frame_size);
        System.out.print(result);

        bufferedReader.close();
        // bufferedWriter.close();
    }
}

