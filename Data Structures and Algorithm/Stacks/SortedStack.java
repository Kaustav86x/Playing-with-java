public static void sortStack(Stack<Integer> stack)
    {
        // Stack<Integer> sorted_stack = new Stack<Integer>();
        // sorted_stack.push(Integer.MIN_VALUE())
        // int len = stack.size(); 
        // int temp;
        // int top = stack.size() - 1; // top 
        // int index = top; // current index
        // while(sorted_stack.size() != stack.size())
        // {
        //     if(stack.peek() > sorted_stack.peek())
        //     {
        //         temp = stack.pop();
        //         stack.push(sorted_stack.pop());
        //         sorted_stack.push(temp);
        //     }
        //     index --;
            
        // }
        // to hold the sorted elements
        Stack<Integer> additionalStack = new Stack<Integer>();
        int temp;
        while(!stack.isEmpty())
        {
            // removing the top element of the original stack
            temp = stack.pop();
            while(!additionalStack.isEmpty() && additionalStack.peek() > temp)
            {
                stack.push(additionalStack.pop());
            }
            additionalStack.push(temp);
        }
            while(!additionalStack.isEmpty())
            {
                stack.push(additionalStack.pop());
            }
        }
    
