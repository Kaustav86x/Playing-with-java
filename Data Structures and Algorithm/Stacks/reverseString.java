public static String reverseString(String string)
    {
        String result = "";
        Stack<Character> revString = new Stack<Character>();
        
        for(char ch : string.toCharArray())
        {
            revString.push(ch);
        }
        while(!revString.isEmpty())
        {
            result += revString.pop();
        }
        return result;
    }
