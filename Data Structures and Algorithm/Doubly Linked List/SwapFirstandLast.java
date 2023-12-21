public void swapFirstLast()
	{
	    if(length < 2)
	        return;
	    int temp;
	    Node first = head;
	    Node last = tail;
	    temp = first.value;
	    first.value = last.value;
	    last.value = temp;
	    return;
	}
