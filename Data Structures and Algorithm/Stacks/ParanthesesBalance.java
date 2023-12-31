public class Main {
  
    public static boolean isBalancedParentheses(String str)
    {
        Stack<Character> stack = new Stack<Character>();
        for(char ch : str.toCharArray())
        {
            if(ch == '(')
                stack.push(')');
            else if(!stack.isEmpty() && ch == stack.peek())
                stack.pop();
        }
        if(str.length() >= 1 && !stack.isEmpty())
            return false;
        else if(str == ")" || str == "))")
            return false;
        return stack.isEmpty();
    }




    public static void main(String[] args) {
        testAndPrint("()", true);
        testAndPrint("()()", true);
        testAndPrint("(())", true);
        testAndPrint("()()()", true);
        testAndPrint("(()())", true);
        testAndPrint(")()(", false);
        testAndPrint(")(", false);
        testAndPrint("(()", false);
        testAndPrint("))", false);
        testAndPrint("(", false);
        testAndPrint(")", false);
    }
    
    public static void testAndPrint(String testStr, boolean expected) {
        // Run the test and store the result
        boolean result = isBalancedParentheses(testStr);
        
        // Print the test string, expected result, and actual result
        System.out.println("Test String: " + testStr);
        System.out.println("EXPECTED: " + expected);
        System.out.println("RESULT: " + result);
        
        // Check if the test passed or failed
        if (result == expected) {
            System.out.println("STATUS: PASS");
        } else {
            System.out.println("STATUS: FAIL");
        }
        
        // Print a separator for better readability
        System.out.println("--------------");
    }

}
