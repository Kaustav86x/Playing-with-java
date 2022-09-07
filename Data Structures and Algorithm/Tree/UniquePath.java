/**Given the root of a binary tree, return 
 * all root-to-leaf paths in any order.
 * A leaf is a node with no children. */

 // (string of list to be resturned)


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
 import java.util.*;
 import java.io.*;


public class UniquePath {
    List<Strings> result = new ArrayList<String>();

    public List<String> BinTreePath(TreeNode root) {
        String ans = "";
        subMethod(root, ans);
    }

    public void subMethod(TreeNode root, String ans) {
        if(root == null) return;

        if(root.left == null && root.right == null) {
            ans += root.val;
            result.add(res);
        }
        ans += root.val + "->"; // we gonna traverse more
        if(root.left != null)
            subMethod(root.left, ans);
        if(root.right != null)
            subMethod(root.right, ans);
    }

    public static void main(String[] args) {
        // write the required code
    }
}
