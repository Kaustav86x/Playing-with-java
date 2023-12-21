public boolean isPalindrome()
	{
	    int count = 0;
	    int temp = 0;
	    Node first = head;
	    Node last = tail;
	    if(length <= 1)
	        return true;
	    while(temp < length/2)
	    {
	        if(first.value == last.value)
	        {
	            first = first.next;
	            last = last.prev;
	            count ++;
	        }
	        temp++;
	    }
	    if(count == length/2)
	        return true;
	    return false;
	}

}
