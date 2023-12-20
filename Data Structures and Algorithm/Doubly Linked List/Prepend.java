public void prepend(int value)
	{
	    Node newNode = new Node(value);
	    if(length == 0)
	    {
	        head = newNode;
	        tail = newNode;
	    }
	    if(length > 0)
	    {
	        newNode.next = head;
	        head.prev = newNode;
	        head = newNode;
	    }
	    length++;
	}
