public void reverseBetween(int startIndex, int endIndex)
    {
        if(head == null) return;
        
        Node dummyNode = new Node(0); // a dummy node irl 
        dummyNode.next = head;
        Node prevNode = dummyNode;
        
        // set the prevnode to the starting index
        for(int i=0; i<startIndex; i++)
        {
            prevNode = prevNode.next;
        }
        // this is the current node
        Node curr = prevNode.next;
        for(int i=0; i<endIndex - startIndex; i++)
        {
            Node ntm = curr.next;
            curr.next = ntm.next;
            ntm.next = prevNode.next;
            prevNode.next = ntm;
        }
        head = dummyNode.next;
    }
