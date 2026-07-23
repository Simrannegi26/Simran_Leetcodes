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
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root,0);
        
    }
    private int dfs(TreeNode node, int curr){
        if(node== null){
            return 0;
        }
        
        /*
        * curr << 1  -> Shift bits left (multiply by 2), making space for the next bit.
        * | node.val -> Append the current node's bit (0 or 1).
        * Initially: curr = 0, node.val = 1   */
  
        curr = (curr << 1) | node.val;
        if (node.left == null && node.right == null){
            return curr;
        }
        
        return dfs(node.left, curr) + dfs(node.right, curr);
    }
}