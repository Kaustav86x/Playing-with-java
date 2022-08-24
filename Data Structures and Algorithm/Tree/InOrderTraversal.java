import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// inorder traversal (logic only) (iterative approach)

public class InOrderTraversal {

    public static ArrayList<Integer> InOrder(TreeNode root) {
        Stack<TreeNode> s = new Stack<TreeNode>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        TreeNode node = root;
        boolean done = false;
        while(!done) {
            if(node != null) {
                s.push(node);
                // going to left
                node = node.left;
            }
            else {
                if(s.isEmpty())
                    done = true;
                else {
                    node = s.pop();
                    result.add(node.val);
                    node = node.right;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        TreeNode tnode = new TreeNode(5, null, null); // root node
    }
}

