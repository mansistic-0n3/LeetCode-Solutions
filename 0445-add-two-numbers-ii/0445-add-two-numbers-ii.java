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
        ListNode a = reverseLinkedList(l1);
        ListNode b = reverseLinkedList(l2);
        int carry=0;
        ListNode res= new ListNode(0);
        ListNode q=res;
        while(a!=null || b!=null){
            int sum=carry;
            if(a!=null){
                sum=sum+a.val;
                a=a.next;
                carry=0;
            }
            if(b!=null){
                sum=sum+b.val;
                b=b.next;
                carry=0;
            }
            if(sum>9){
                carry=sum/10;
                sum=sum%10;
            }
            q.next=new ListNode(sum);
            q=q.next;
            
        }
        
        if(carry>0){
            q.next=new ListNode(carry);
                // q=q.next;
        }
       return reverseLinkedList(res.next);
    }
    
   private ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}