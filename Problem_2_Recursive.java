// Time complexity - O(n)
// Space complexity - O(h), height of tree

// Recursive solution, push node and currsum together.

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
    
    public int sumNumbers(TreeNode root) {
        return helper(root,0);
    }
    
    private int helper(TreeNode root, int currSum){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return currSum*10 + root.val;
        }
        int left = helper(root.left,currSum*10 + root.val);
        int right = helper(root.right,currSum*10 + root.val);
        return left + right;
    }
}
