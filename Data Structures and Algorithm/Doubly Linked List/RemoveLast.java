public Node removeLast()
	{
	    if(length == 0) return null;
	    Node temp = tail;
	    if(length == 1)
	    {
	        tail = null;
	        head = null;
	    }
	    if(length > 1)
	    {
	        tail = tail.prev;
	        tail.next = null;
	        temp.prev = null;
	    }
	    length --;
	    return temp;
	}
