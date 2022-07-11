// searching for an element in the binary tree without recursion
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
public class SearchInBin2 {

    public static boolean SearchWithoutRecursion(Node node, int val)
    {
        boolean res = true;
        if(node == null) 
            return false;
        Queue<Node> q = new LinkedList<Node>();
        // inserting the root node
        q.offer(node);
        while(!q.isEmpty()) {
            Node temp = q.poll();
            if(temp.data == val)
                return res;
            if(temp.left != null)
                q.offer(temp.left);
            if(temp.right != null)
                q.offer(temp.right);
        }
        // q is empty and the value is still not found
        res = false;
        return res;
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
        boolean val = SearchWithoutRecursion(root, item);
        if(val)
            System.out.println("Value found");
        else {
            System.out.println("Not found");
        }
    }
}
