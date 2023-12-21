public boolean insert(int index, int value)
	{
	    if(index < 0 || index > length)
	        return false;
	    if(index == 0)
	    {
	        prepend(value);
	        return true;
	    }
	    if(index == length)
	    {
	        append(value);
	        return true;
	    }
	    Node newNode = new Node(value);
	    Node before = get(index-1);
	    Node after = before.next;
	    newNode.prev = before;
	    newNode.next = after;
	    before.next = newNode;
	    after.prev = newNode;
	    length ++;
	    return true;
	}
