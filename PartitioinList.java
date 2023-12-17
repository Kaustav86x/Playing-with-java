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
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0);  // dummy node no 1
        ListNode dummy2 = new ListNode(0);  // dummy node no 2

        ListNode prev1 = dummy1;
        ListNode prev2 = dummy2;

        ListNode current = head;
        while(current != null)
        {
            if(current.val < x)
            {
                prev1.next = current;
                prev1 = current;
            }
            else
            {
                prev2.next = current;
                prev2 = current;
            }
            current = current.next;
        }
        prev2.next = null;  // tail
        prev1.next = dummy2.next;
        head = dummy1.next;

        return dummy1.next;
    }
}
