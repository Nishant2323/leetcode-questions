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
    int ans;
    public int rangeSumBST(TreeNode root, int low, int high) {
        traverse(root,low,high);
        return ans;
    }
    public void traverse(TreeNode root, int low, int high){
        if(root == null) return;
        if(root.val >= low && root.val <= high){
            ans += root.val;
        }
        traverse(root.left,low,high);
        traverse(root.right,low,high);

    }
}