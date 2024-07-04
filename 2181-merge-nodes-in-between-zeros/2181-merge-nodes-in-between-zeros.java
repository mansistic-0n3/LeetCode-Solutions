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
    public ListNode mergeNodes(ListNode head) {
        ListNode modify = head.next;
        ListNode nextsum = modify;
        
        while(nextsum!=null){
            int s=0;
            while(nextsum.val!=0){
                s+=nextsum.val;
                nextsum=nextsum.next;
            }
            modify.val = s;
            nextsum=nextsum.next;
            modify.next=nextsum;
            modify=modify.next;
        }
        
        return head.next;
    }
}