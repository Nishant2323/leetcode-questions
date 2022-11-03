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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans= new ArrayList<>();
        rightview(root,ans,0);
        return ans;
    }
    //in this we use reverse preorder
    public void rightview(TreeNode root, List<Integer> a, int c){
        //base condition 
        if(root==null)return ;
        if(c==a.size())a.add(root.val);
        rightview(root.right,a,c+1);
        rightview(root.left,a,c+1);
    }
}