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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] dai=new int[1];
        if(root==null)return dai[0];
        int i= hie(root,dai);
        return dai[0];
    }
    public int hie(TreeNode root,int[] dai){
        if(root==null) return 0;
        int lh= hie(root.left,dai);
        int rh= hie(root.right,dai);
        dai[0]=Math.max(dai[0],(lh+rh));
        return 1+Math.max(lh,rh);
    } 
}