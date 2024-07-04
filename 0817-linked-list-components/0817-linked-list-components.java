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

// class Solution {
//     public int numComponents(ListNode head, int[] nums) {
//         Arrays.sort(nums);
//         int count = 0;
//         boolean inComponent = false;

//         ListNode current = head;
//         int i = 0;
//         int len = nums.length;

//         while (current != null) {
//             while (i < len && nums[i] < current.val) {
//                 i++;
//             }
            
//             if (i < len && nums[i] == current.val) {
//                 if (!inComponent) {
//                     count++;
//                     inComponent = true;
//                 }
//             } else {
//                 inComponent = false;
//             }

//             current = current.next;
//         }

//         return count;
//     }
// }

class Solution {
    public int numComponents(ListNode head, int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        boolean inComponent = false;

        ListNode current = head;
        while (current != null) {
            if (binarySearch(nums, current.val)) {
                if (!inComponent) {
                    count++;
                    inComponent = true;
                }
            } else {
                inComponent = false;
            }
            current = current.next;
        }

        return count;
    }

    private boolean binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}