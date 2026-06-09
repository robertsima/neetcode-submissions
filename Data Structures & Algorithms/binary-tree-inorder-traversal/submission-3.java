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
    Set<Integer> visited = new HashSet<>(); //track visited vals
    List<Integer> answer = new ArrayList<>(); 

    public List<Integer> inorderTraversal(TreeNode root) {
        traverseTree(root); 

        return answer; 
    }

    public void traverseTree(TreeNode root) { 
        //base case
        if(root == null) return; 

        //check if current node has unvisited children
        Boolean hasUnvisited = hasUnvisitedChildren(root); 

        if(hasUnvisited) { //we call recursion
            inorderTraversal(root.left);
            answer.add(root.val); 
            inorderTraversal(root.right); 
        } else {
            answer.add(root.val); 
        }
                 
    }

    public Boolean hasUnvisitedChildren(TreeNode root) { //helper to check if children have been visited
        if(root.left!= null && !visited.contains(root.left.val) || root.right != null && !visited.contains(root.right.val)){ 
            return true; 
        } else { 
            return false; 
        }
    }
}