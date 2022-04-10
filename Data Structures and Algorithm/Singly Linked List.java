// singly linked list
import java.util.List;

import javax.sql.rowset.spi.SyncFactory;
import javax.swing.plaf.synth.SynthScrollBarUI;

import org.w3c.dom.NodeList;

// as java doesn't have the concept of pointers
// we need to make a node class first 
public class ListNode 
{
    protected int data;
    protected ListNode next;
    // constructor
    public ListNode(int d)
    {
        data = d;
        next = null;
    }
    // storing the data
    public void setData(int data)
    {
        this.data = data;
    }
    // returning the data
    public int getData()
    {
        return this.data;
    }
}

public class LinkedList
{
    //constructor
    public LinkedList()
    {
        length = 0;
    }
    ListNode head;
    private int length = 0;
    public synchronized ListNode getHead()
    {
        // returning the head of the list 
        return head;
    }
    //Insertion operations
    // Insert a node at the beginnin of the list
    public synchronized void insertAtBegin(ListNode node)
    {
        node.next = head;
        head = node;
        // node added
        length ++;
    }
    // insert a node at the end of the list
    public synchronized void insertAtEnd(ListNode node)
    {
        if(head == null)
            head = node;
        else {
            ListNode p,q;
            for(p=head; (q=p.next)!= null; p=q)
            {
                p.next = node;
                node.next = null;
            }
        }
        length ++;
    }
    // add a new value at a given position 
    public void insert(int data, int position)
    {
        // fixing the position
        if((position < 0) && (position > 0))
        {
            System.out.println("Please enter a valid position");
        }
        // now there are total 3 conditions : 
        // 1. empty list 
        // 2. adding at the beginning
        // 3. finding the given position and insert 
        // if the list is empty,makle it to be the only element 
        if(head == null)
        {
            head = new ListNode(data);
        }
        // if adding at the front of the list 
        else if(position == 0) {
            // creating a new node to be added
            ListNode temp = new ListNode(data);
            temp.next = head;
            temp = head;
        }
        // finding the correct position and insert
        else {
            ListNode temp = head;
            for(int i=0; i<position; i++)
            {
                // moving rightward 
                temp = temp.next;
            }
            ListNode newNode = new ListNode(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        length ++;
    }
    // Deletion operations
    // remove and return the head of the list
    public synchronized ListNode removeFromBegin()
    {
        ListNode node = head;
        if(node != null) {
            head = node.next;
            node.next = null;
        }
        return node;
    }
    // remove and return the end of the list
    public synchronized ListNode removeFromEnd()
    {
        // if the list is empty
        if(head == null)
            return null;
        ListNode p = head, q = null, r = head.next;
        // if there is only one node present
        if(r == null)
        {
            head = null;
            return p;
        }
        // if there are more than one node present 
        // the order of the variables are q, p, (p.next/next)
        while((next = p.next)!=null) {
            // shifting rightward
            q = p;
            p = next;
        }
        q.next = null;
        return p;
    }
    //remove the node matching the specified node
    public synchronized void removedMatched(ListNode node)
    {
        if(head == null)
            // returning nothing
            return;
        // checking for the head node 
        if(node.equals(head)) {
            // shifting the head
            head = head.next;
            return;
        }
        ListNode p = head, q;
        while((q = p.next)!= null) {
            if(node.equals(q)) {
                p.next = q.next;
                return;
            }
            p = q;
        }
    }
    // remove the value from a given position(not returniing anything)
    public void remove(int position) {
        if((position < 0) && (position > 0)) 
            System.out.println("Please enter a valid position !");
        // if nothing is in the list, do nothing
        if(head == null) 
            return;
        // removing the head 
        if(position == 0) {
            head = head.next;
        }
        else {
            ListNode temp = head;
            for(int i=0; i<position; i++) {
                //node shifting
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        length -= 1;
    }
    // returning a string representation of this collection
    public String toString() {
        String result = "[";
        if(head == null) {
            return result + "]";
        }
        // not empty list
        result = result + head.data;
        ListNode temp = head.next;
        while(temp!=null) {
            result = result + "," + temp.data;
            temp = temp.next;
        }
        return result + "]";
    }
    // return the current length of the list
    public int listLength(ListNode node)
    {
        ListNode temp = head;
        int length = 0;
        while(temp != null) {
            length += 1;
            temp = temp.next;
        }
        return length;
    }
    // reversing of the list 
    public synchronized ListNode reverseList() {
        ListNode prev = null;
        ListNode curr = node;
        ListNode next = null;

        while(curr!= null) {
            next.next = curr;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
}