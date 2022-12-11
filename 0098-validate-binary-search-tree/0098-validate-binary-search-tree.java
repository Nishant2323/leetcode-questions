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
// 2147483647 
class Solution {
    public boolean isValidBST(TreeNode root) {
        return isvaild(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean isvaild( TreeNode root,long min,long max){
        if(root==null )return true;
        if(root.val<=min||root.val>=max)return false;
       return isvaild(root.left,min,root.val)&& isvaild(root.right,root.val,max);
    }
}