public void append(int value)
	{
	    // new node has been created
	    Node newNode = new Node(value);
	    if(length == 0)
	    {
	        head = newNode;
	        tail = newNode;
	    }
	    if(length > 0)
	    {
	        tail.next = newNode;
	        newNode.prev = tail;
	        tail = newNode;
	    }
	    length ++;
	}
