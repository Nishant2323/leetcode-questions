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
// class Solution {
//     int total = 0;
//     long  ans = 0;
//     public int maxProduct(TreeNode root) {
//         total = sum(root);
//         int res = sum(root);
//          int mod = (int)Math.pow(10,9)+7;
//         return  (int)ans%mod;
//     }
//     public int sum(TreeNode root){
//         if(root==null)return 0;
//         // int left = sum(root.left);
//         // int rigth= sum(root.right);
//         // return left+right+root.val;
//         int sum = sum(root.left)+ sum(root.right)+ root.val;
//         ans= Math.max((sum*(total-sum)),ans);
//          return sum;
//     }
// }
class Solution {
    int mod = 1000000007;
    long max = 0;
    long total;
    public int maxProduct(TreeNode root) {
        this.total = dfs(root);
        traverse(root);
        return (int)(max%mod);
    }
    
    private int dfs(TreeNode root)
    {
        if(root==null)
            return 0;
        return root.val += dfs(root.left) + dfs(root.right);
    }
    
    private void traverse(TreeNode root)
    {
        if(root==null)
            return;
        max = Math.max(root.val*(total-root.val),max);
        traverse(root.left);
        traverse(root.right);
    }
}