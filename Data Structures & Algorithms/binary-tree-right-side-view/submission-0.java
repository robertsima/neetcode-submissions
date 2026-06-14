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
    List<Integer> nums = new ArrayList<>(); 
    int level = 0;

    public List<Integer> rightSideView(TreeNode root) {

        recursion(root, nums, level); 

        return nums; 
    }

    public void recursion(TreeNode root, List<Integer> nums, int level)  {
        if(root == null) { //base return case
            return;
        }

        //condition to add num to array - we add if null
        if(nums.size() == level || nums.size() == 0) { 
            nums.add(root.val);
            level++;

            recursion(root.right, nums, level); //try right first, then left
            recursion(root.left, nums, level); //try right first, then left
        } else {
            recursion(root.right, nums, level + 1); //skip level
            recursion(root.left, nums, level + 1); 
        }
    }
}
