import java.util.*;

class BinaryTreeNode {
    public int data;
    BinaryTreeNode left, right;
    // root node
    public BinaryTreeNode(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
public class Tree_Travel {
    // static ArrayList<Integer> res1= new ArrayList<Integer>();
    // static ArrayList<Integer> res2= new ArrayList<Integer>();
    // static ArrayList<Integer> res3= new ArrayList<Integer>();
    // root of the tree
    BinaryTreeNode node;
    Tree_Travel() 
    {
        node = null;
    }
    void InOrderTravel(BinaryTreeNode root) {
        if(root != null) {
            InOrderTravel(root.left);
            System.out.print(root.data);
            InOrderTravel(root.right);
        }
    }
    void PreOrderTravel(BinaryTreeNode root) {
        if(root != null) {
            System.out.print(root.data);
            PreOrderTravel(root.left);
            PreOrderTravel(root.right);
        }
    }
    void PostOrderTravel(BinaryTreeNode root) {
        if(root != null) {
            PostOrderTravel(root.left);
            PostOrderTravel(root.right);
            System.out.print(root.data);
        }
    }
    void InOrder() {
        InOrderTravel(node);
    }
    void PreOrder() {
        PreOrderTravel(node);
    }
    void PostOrder(){
        PostOrderTravel(node);
    }
    public static void main(String[] args) {
        Tree_Travel obj1 = new Tree_Travel();
        obj1.node = new BinaryTreeNode(1);
        obj1.node.left = new BinaryTreeNode(2);
        obj1.node.right = new BinaryTreeNode(3);
        obj1.node.left.left = new BinaryTreeNode(4);
        obj1.node.left.right = new BinaryTreeNode(5);
        // obj1.node.right.left = new BinaryTreeNode(6);
        // obj1.node.right.right = new BinaryTreeNode(7);
        

        System.out.println("InOrder");
        obj1.InOrder();
        System.out.println();
        System.out.println("PostOrder");
        obj1.PostOrder();
        System.out.println();
        System.out.println("PreOrder");
        obj1.PreOrder();
        
    }
}