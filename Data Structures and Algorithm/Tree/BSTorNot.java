import java.util.*;
import java.io.*;


class Node {
    int data;
    Node left;
    Node right;

    Node(int item) {
        data = item;
        left = right = null;
    }
 }

public class BSTorNot {
    boolean tag = false;
    public static boolean checkBST(Node root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root == null) {
            return true;
        }
        // checking whether the left subtree is bst or not
        boolean flag = checkBST(root.left);
        if(!flag) {
            return false;
        }
        res.add(root.data);
        flag = checkBST(root.right);
        if(!flag) {
            return false;
        }
        for(int i=0; i<res.size()-1; i++) {
            if(res.get(i) >= res.get(i+1)) {
                flag = false;
            }
        }
        return flag;
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
        
    }
}
