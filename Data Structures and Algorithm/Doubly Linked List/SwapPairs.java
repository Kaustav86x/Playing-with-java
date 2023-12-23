public void swapPairs() {
        Node dummyNode = new Node(0);
        dummyNode.next = head;
        Node previousNode = dummyNode;
    
        while (head != null && head.next != null) {
            Node firstNode = head;
            Node secondNode = head.next;
    
            previousNode.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
    
            secondNode.prev = previousNode;
            firstNode.prev = secondNode;
            
            if (firstNode.next != null) {
                firstNode.next.prev = firstNode;
            }
    
            head = firstNode.next;
            previousNode = firstNode;
        }
    
        head = dummyNode.next;
        if (head != null) head.prev = null;
    }
