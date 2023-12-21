public Node get(int index)
	{
	    if(index < 0 || index >= length)
	        return null;
	    Node temp;
	    if(index < length/2)
	    {
	        temp = head;
	        for(int i=0; i<index; i++)
	            temp = temp.next;
	    }
	    else{
	        temp = tail;
	        for(int i=length-1; i>index; i--)
	            temp = temp.prev;
	    }
	    return temp;
	}
