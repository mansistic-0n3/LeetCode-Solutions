/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
// private:
//     int result = 0;
//     int maxDepth(TreeNode *node)
//     {
//         if (!node) return 0;
//         int left = maxDepth(node->left);
//         int right = maxDepth(node->right);

//         // memorize
//         result = max(left + right, result);

//         return 1 + max(left, right);
//     }
// public:
//     int diameterOfBinaryTree(TreeNode* root) {
//         // if (!root) return 0;
//         // int left = maxDepth(root->left);
//         // int right = maxDepth(root->right);
//         maxDepth(root);

//         return result;
    
    public:
    int diameterOfBinaryTree(TreeNode* root) {
        int diameter =0;
        height(root,diameter);
        return diameter;
    }
    private:
    int height(TreeNode* node, int& diameter){
         if (!node) return 0;
        int lh = height(node->left, diameter);
        int rh = height(node->right, diameter);
        diameter = max(diameter, lh + rh);
        return 1 + max(lh,rh);
    }
};