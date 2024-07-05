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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> dis = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
        }
        for(int i=1; i<list.size()-1; i++){
            if ((list.get(i) > list.get(i - 1) && list.get(i) > list.get(i + 1)) ||
                (list.get(i) < list.get(i - 1) && list.get(i) < list.get(i + 1))) {
                dis.add(i);
            }
        }
        if(dis.size()<2){
            return new int[]{-1,-1};
        }
        int min= Integer.MAX_VALUE;
        for (int i = 1; i < dis.size(); i++) {
            min = Math.min(min, dis.get(i) - dis.get(i - 1));
        }
        int max = dis.get(dis.size() - 1) - dis.get(0);
        
        return new int[]{min,max};
    }
}