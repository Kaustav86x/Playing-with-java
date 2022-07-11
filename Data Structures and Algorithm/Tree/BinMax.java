// finding the maximum value in a binary tree

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

public class BinMax {
    public static int MaxInBin(Node node)
    {
        if(node == null)
            return Integer.MIN_VALUE;
        int max = node.data;
        // recursively finding the leftmax and rightmax of the tree
        if(node != null) {
            int leftmax = MaxInBin(node.left);
            int rightmax = MaxInBin(node.right);
            if(leftmax > max) {
                max = leftmax;
            }
            if(rightmax > max)
                max = rightmax;
            }
            return max;
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
        scan.close();
        int val = MaxInBin(root);
        System.out.println("The maximum value : " + val);
    }
}
