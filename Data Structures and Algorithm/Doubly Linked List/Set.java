public boolean set(int index, int value)
	{
	    // fetching a node from an index
	    Node temp = get(index);
	    if(temp != null)
	    {
	        temp.value = value;
	        return true;
	    }
	    return false;
	}
