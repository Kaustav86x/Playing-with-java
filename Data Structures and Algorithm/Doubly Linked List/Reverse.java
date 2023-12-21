public void reverse()
	{
	    Node currentNode = head;
	    Node temporaryNode = null;
	    while(currentNode != null)
	    {
	        // changing the referance b/w tempnode and currnode
	        temporaryNode = currentNode.prev;
	        currentNode.prev = currentNode.next;
	        currentNode.next = temporaryNode;
	        // reversing the DLL 
	        currentNode = currentNode.prev;
	    }
	    temporaryNode = head;
	    head = tail;
	    tail = temporaryNode;
	}
