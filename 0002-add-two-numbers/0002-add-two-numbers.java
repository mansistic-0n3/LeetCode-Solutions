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
        int carry=0;
        ListNode res = new ListNode(0);
        ListNode q = res;
        
        while(l1!=null || l2!=null){
            int sum=0+carry;
            if(l1!=null){
                sum=sum+l1.val;
                l1=l1.next;
                carry=0;
            }
            if(l2!=null){
                sum=sum+l2.val;
                l2=l2.next;
                carry=0;
            }
            if(sum>9){
                carry=sum/10;
                sum=sum%10;
            }
            q.next= new ListNode(sum);
            q=q.next;                
            }
        
            if(carry==1 && l1==null && l2==null){
                q.next=new ListNode(carry);
                q=q.next;
            }
        return res.next;
    }
}