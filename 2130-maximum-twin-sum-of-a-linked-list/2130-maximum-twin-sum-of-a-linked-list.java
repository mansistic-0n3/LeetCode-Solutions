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
    public int pairSum(ListNode head) {
        ListNode li = head;
        ArrayList<Integer> a = new ArrayList();
        while(li!=null){
            a.add(li.val);
            li=li.next;
        }
        int n = a.size();
        int count=0;
        for (int i = 0; i < n / 2; i++) {
            int twinIndex = n - 1 - i;
            int twinSum = a.get(i) + a.get(twinIndex);
            if (twinSum > count) {
                count = twinSum;
            }
        }
        return count;
    }
}