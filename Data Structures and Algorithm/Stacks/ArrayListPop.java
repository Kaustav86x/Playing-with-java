public T pop()
    {
        int len = stackList.size();
        int top = len - 1;  // initially pointing at the last obj
        if(isEmpty())
            return null;
        if(stackList.size() > 0)
            top = len - 2;
        return stackList.remove(len - 1);
    }
