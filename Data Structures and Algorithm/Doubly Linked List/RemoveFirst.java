public Node removeFirst()
	{
	    if(length == 0) 
	        return null;
	    Node temp = head;
	    
	    if(length == 1)
	    {
	        head = null;
	        tail = null;
	    }
	    if(length > 1)
	    {
	        // head moving to the next node of the DLL
	        head = head.next;
	        head.prev = null;
	        temp.next = null;
	    }
	    length --;
	    return temp;
	}
