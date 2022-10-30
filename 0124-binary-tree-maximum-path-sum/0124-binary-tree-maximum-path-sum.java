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
    public int size(TreeNode root){
        if(root==null) return 0;
        int left= size(root.left);
        int rigth= size(root.right);
        return 1+left+rigth;
    }
    public int maxPathSum(TreeNode root) {
        if(root==null) return 0;
        if(size(root)==1)return root.val;
        int[]  max= new int[1];
        max[0]= Integer.MIN_VALUE;
         int i= sum(root,max);
        return max[0];
    }
    public int sum(TreeNode root,int[] max){
        if(root==null) return 0;
        int left= Math.max(sum(root.left,max),0);
        int right= Math.max(sum(root.right,max),0);
        max[0]= Math.max(max[0],(left+right+root.val));
        return root.val+Math.max(left,right);
    }
}