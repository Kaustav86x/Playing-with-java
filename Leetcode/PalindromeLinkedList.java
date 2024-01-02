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
    public boolean isPalindrome(ListNode head) {
        // LinkedList<Integer> stack = new LinkedList<Integer>();
        // avector of type listnode
        ListNode val = head;
        ListNode n = head;
        int count = 0;
        while(val != null)
        {
            val = val.next;
            count += 1;
        }
        int result[] = new int[count];
        int i=0;
        while(n!=null)
        {
            result[i] = n.val;
            n = n.next;
            i += 1;
        }
        int first = 0;
        int second = result.length - 1;
        while(second >= first)
        {
            if(result[first] == result[second])
            {
                first ++;
                second --;
            }
            else
                break;
        }
        if(second < first)
            return true;
        else
            return false;
}
}
