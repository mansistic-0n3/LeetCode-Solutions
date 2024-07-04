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
    public int getDecimalValue(ListNode head) {
        
        ListNode current = head;
        ArrayList<Integer> a = new ArrayList();
        while(current!=null){
            a.add(current.val);
            current=current.next;
        }
        
        StringBuilder binary = new StringBuilder();
        for (int num : a) {
            binary.append(num);
        }
        
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            int bit = binary.charAt(i) - '0';
            decimal = decimal * 2 + bit;
        }
        
        return decimal;
    }
}