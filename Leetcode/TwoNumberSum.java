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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // dummy node
        ListNode curr = dummy; // pointer
        int sum, mod, carry = 0, x, y;
        while(l1 != null || l2 != null || carry != 0)
        {
            x = (l1 != null)? l1.val : 0;
            y = (l2 != null)? l2.val : 0;
            sum = x + y + carry; // suppose, 9+9
            mod = sum%10;        // 8
            carry = sum/10;      // 1
            curr.next = new ListNode(mod);
            curr = curr.next;
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }
        return dummy.next;
    }
}
