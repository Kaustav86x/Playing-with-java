class MyQueue {
    public Stack<Integer> stack1 = new Stack<>();
    public Stack<Integer> stack2 = new Stack<>();

    public MyQueue() {
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        if(stack2.isEmpty())
        while(!stack1.isEmpty())
            stack2.push(stack1.pop());
        int res = stack2.pop();
        return res;
    }
    
    public int peek() {
        if(stack2.isEmpty())
        while(!stack1.isEmpty())
            stack2.push(stack1.pop());
        int res = stack2.peek();
        return res;
    }
    
    public boolean empty() {
        return stack2.isEmpty() && stack1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
