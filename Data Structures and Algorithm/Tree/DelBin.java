import java.util.*;
import java.io.*;

class Node {
    int data;
    Node left , right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class DelBin {

    public static boolean DelFromBin(Node node, int val) 
    {
        boolean res = true;
        if(node == null)
            return false;
        Queue<Node> q = new LinkedList<Node>();
        // adding the root node to the q
        q.offer(node);
        while(!q.isEmpty()) {
            Node temp = q.poll();
            if(temp.data == val)
                temp = null;
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}
