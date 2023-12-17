public int binaryToDecimal()  // 101 suppose
    {
        Node current = head;
        int num = 0;
        int i = 0;
        while(current != null)
        {
            /*num += (current.value + Math.pow(2,i));
            current = current.next;
            i += 1;*/
            num = num*2 + current.value;
            current = current.next;
        }
        return num;
    }
