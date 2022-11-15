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
    public int countNodes(TreeNode root) {
        if(root==null)return 0;
        int left_ex=1;
        TreeNode l=root.left;
        while(l!=null){
            l=l.left;
            left_ex=left_ex+1;
            
        }
         int right_ex=1;
        TreeNode r=root.right;
        while(r!=null){
            r=r.right;
            right_ex++;
            
        }
        if(left_ex==right_ex){
             return (int)Math.pow(2 , left_ex)-1;
            
        }
        return   1+countNodes(root.left)+countNodes(root.right);
    }
}