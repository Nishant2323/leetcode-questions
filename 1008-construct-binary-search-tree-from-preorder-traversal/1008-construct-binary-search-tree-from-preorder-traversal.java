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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root =  new TreeNode(preorder[0]);
        
        for(int i = 1; i < preorder.length; i++){
            TreeNode temp = root;
            while(true){
            if(temp.val < preorder[i]){
                if(temp.right == null){
                     TreeNode node = new TreeNode(preorder[i]);
                     temp.right = node;
                     break;
                }
                else{
                     temp = temp.right; 
                }
            }
            else{
                if(temp.left == null){
                    TreeNode node = new TreeNode(preorder[i]);
                     temp.left = node;
                     break;
                }
                else{
                    temp = temp.left;
                }
            }
        }
    }
    return root;
    }
}