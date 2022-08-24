import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

// iterative approach (logic only)
public class CountNode {
    public int CNode(TreeNode root) {
        int count = 0;
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(root);
        while(!s.isEmpty()) {
            TreeNode temp = s.pop();
            count ++;
            if(temp.left != null)
                s.push(temp.left);
            if(temp.right != null)
                s.push(temp.left);
        }
        return count;
    }
    // recursive appraoch
    public int CountBin(TreeNode root) {
        Stack<TreeNode> s = new Stack<TreeNode>();
        
    }
    public static void main(String[] args) {
        
    }
}
