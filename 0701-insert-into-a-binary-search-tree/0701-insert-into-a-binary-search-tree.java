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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = new TreeNode(val);
        if(root==null){
            root=node ;
            return root;
        }
        TreeNode curr=root;
        TreeNode curr1=root;
        while(curr!=null){
            if(curr.val<=val){
                curr1=curr;
                curr=curr.right;
            }
            else{
                curr1=curr;
                curr=curr.left;
            }
        }
        
        if(curr1.val<=val){
            curr1.right=node;
        }
        else{
            curr1.left=node;
        }
        return root;
    }
}