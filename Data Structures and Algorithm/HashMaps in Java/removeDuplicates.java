public void removeDuplicates()
    {
        Node temp = new Node(0); // new node with a value 0
        Node pt = temp;
        HashSet<Integer> values = new HashSet<Integer>();
        Node prev = null;
        Node current = head;
        while(current != null)
        {
            if(values.contains(current.value) == true)
            {
                prev.next = current.next;
                length --;
            }
            else{
                values.add(current.value);
                prev = current;
            }
            current = current.next;
        }
    }
