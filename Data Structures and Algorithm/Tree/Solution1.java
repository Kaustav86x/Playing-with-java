import java.util.ArrayList;

import javax.swing.tree.TreeNode;

// convert a sorted list to a binary search tree

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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

// only the logic is here... we've' constucted the logic only

public class Solution1 {

    public TreeNode listtobin(ListNode head) {
        ArrayList<Integer> lst= new ArrayList<Integer>();
        while(head!=null) {
            lst.add(head.val);
            head = head.next;
        }

        return BinTree(lst, 0, lst.size()-1);
    }
    public TreeNode BinTree(ListNode node, int left, int right)
    {
        if(left > right)
            return null;
        int mid = (right+left)/2;
        TreeNode tnode = new TreeNode(node.get(mid));

        // constructing the left subtree
        tnode.left = BinTree(node, left, mid-1);
        // constructing the right subtree
        tnode.right = BinTree(node, mid+1, right);

        return tnode;
    };
    }
}