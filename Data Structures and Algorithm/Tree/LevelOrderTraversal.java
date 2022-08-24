import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
  // level order traversal (logic only)

public class LevelOrderTraversal {
    public List<List<Integer>> LevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> result = new ArrayList<Integer>();  // list to return 
        q.add(root);
        while(!q.isEmpty()) {
            List<Integer> temp = new LinkedList<Integer>(); // list for every layer
            // size of each layer is needed
            int length = q.size();
            for(int i=0; i<length; i++) {
                TreeNode tn = q.poll();
                if(tn != null) {
                    temp.add(tn.val);
                    q.add(tn.left);
                    q.add(tn.right);
                }
            }
            result.add(temp); // each layer being added 
        }
        result.remove(result.size() - 1); // checking the leaf node will give an empty list at the end of result
        return result;
    }
}
