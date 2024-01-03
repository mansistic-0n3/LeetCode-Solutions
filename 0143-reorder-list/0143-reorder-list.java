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
    public void reorderList(ListNode head) {
        ListNode node = head;
        int count =0;
        HashMap<Integer,ListNode> re = new HashMap<>();
        while(node!=null){
            re.put(count++, node);
            node=node.next;
        }
        
        int left = 0;
        int right = count-1;
        ListNode L = null;
        ListNode R = null;
     
        while(left<right){
            L=re.get(left);
            R=re.get(right);
            ListNode temp = L.next;
            L.next = R;
            R.next= temp;
            left++;
            right--;
            
        }
       re.get(left).next=null; 
    }
}