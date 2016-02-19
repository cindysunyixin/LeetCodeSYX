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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        } return symmetric(root.left, root.right);
    }
    public boolean symmetric(TreeNode p, TreeNode r) {
        if (p == null && r == null) {
            return true;
        }
        if (p == null || r == null) {
            return false;
        } return p.val == r.val && symmetric (p.right, r.left) && symmetric(p.left, r.right);
    }
}
