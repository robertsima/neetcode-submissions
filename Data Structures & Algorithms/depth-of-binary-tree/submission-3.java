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
    int maxDepth = 0; 

    public int maxDepth(TreeNode root) {
        int currentDepth = 0;
        dfs(root, currentDepth); 

        return maxDepth; 
    }

    public void dfs(TreeNode root, int currentDepth) {
        if(root == null) { //base case
            return; 
        }

        currentDepth++; //incr current

        maxDepth = Math.max(maxDepth, currentDepth); //grab max depth

        dfs(root.left, currentDepth); //call both sides
        dfs(root.right, currentDepth);

    }
}
