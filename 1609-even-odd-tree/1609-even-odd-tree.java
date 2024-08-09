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

    public boolean isEvenOddTree(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        return helper(root, 0, levels);
    }

    public boolean helper(TreeNode root, int level, List<List<Integer>> levels) {
        if (root == null) {
            return true;
        }

        // Expand levels list if we're visiting a new level
        if (levels.size() == level) {
            levels.add(new ArrayList<>());
        }

        // Get the list of values at the current level
        List<Integer> currentLevel = levels.get(level);

        // Check if the value satisfies the odd/even condition based on the level
        if ((level % 2 == 0 && root.val % 2 == 0) || (level % 2 != 0 && root.val % 2 != 0)) {
            return false;
        }

        // Check the strictly increasing/decreasing order condition
        if (!currentLevel.isEmpty()) {
            int prevValue = currentLevel.get(currentLevel.size() - 1);
            if (level % 2 == 0 && root.val <= prevValue) {
                return false;
            }
            if (level % 2 != 0 && root.val >= prevValue) {
                return false;
            }
        }

        // Add the current node's value to the level
        currentLevel.add(root.val);

        // Recurse for left and right subtrees
        boolean leftCheck = helper(root.left, level + 1, levels);
        boolean rightCheck = helper(root.right, level + 1, levels);

        return leftCheck && rightCheck;
    }
}