// searching for an element in binary tree

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

public class SearchInBin {
    
    public static boolean Search(Node node, int val) {
        if(node == null)
            return false;
        if(node.data == val)
            return true;
        return (Search(node.left, val) || Search(node.left, val));
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no. of nodes : ");
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        System.out.print("Enter the item you want to find : ");
        int item = scan.nextInt();
        scan.close();
        boolean val = Search(root, item);
        if(val)
            System.out.println("Value found");
        else {
            System.out.println("Not found");
        }
    }
}
