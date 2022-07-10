import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
public class TopViewTree {
    public static void topView(Node root) {
        class QueueObj {
            Node node;
            int hd;
            
            QueueObj(Node nod, int d) {
                node = nod;
                hd = d;
            }
        }
        Queue<QueueObj> q = new LinkedList<QueueObj>();
        Map<Integer, Node> topViewMap = new TreeMap<Integer, Node>();
        
        if(root == null) {
            return;
        }
        else {
            q.add(new QueueObj(root, 0)); // horizental dis of root is always 0
        }
        while(!q.isEmpty()) {
            QueueObj temp = q.poll(); // popping the last value
            if(!topViewMap.containsKey(temp.hd)) 
            {
                topViewMap.put(temp.hd, temp.node); // popping from q , adding to the map
            }
            if(temp.node.left != null) {
                q.add(new QueueObj(temp.node.left, temp.hd - 1));
            }
            if(temp.node.right != null) {
                q.add(new QueueObj(temp.node.right, temp.hd + 1));
            }
        }
        Iterator <Integer> it = topViewMap.keySet().iterator();
        while(it.hasNext()) {
            int key=(int)it.next();  
            System.out.print(topViewMap.get(key).data + " ");  
        }
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
        topView(root);
    }	
}
