/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        } 
        int l = height(root.left);
        int r = height(root.right);
        int dif = Math.abs(r - l);
        if (dif <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
            return true;
        } else {
            return false;
        }

    }
     
    
    public int height(TreeNode curr) {
        if (curr == null) {
            return -1;
        } return 1 + Math.max(height(curr.left), height(curr.right));
       
}
}
