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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        
        ListNode temp = current;
        int count = 0;
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }
        
        if (count < k) {
            return head;
        }
        
        count = 0;
        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if (next != null) {
            head.next = reverseKGroup(next, k);
        }
        
        return prev;
    }
}
