/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int first = 0;
        int last = nums.length-1;
        return tree(first, last, nums);
    }
    public TreeNode tree(int first, int last, int[] nums){
        if(first>last){
            return null;
        }
        
        int mid = (first+last)/2;
        TreeNode root = new TreeNode(nums[mid]);
        
        root.left=tree(first, mid-1, nums);
        root.right=tree(mid+1, last, nums);
        return root;
    }
}