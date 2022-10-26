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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
       List<Integer> f=new ArrayList<>();
       List<Integer> s=new ArrayList<>();
        if(root1==null&&root2==null)return true;
         help(root1,f);
          help(root2,s);
        return f.equals(s);
    }
    public void help(TreeNode root, List<Integer> f){
        if(root.left==null&&root.right==null)f.add(root.val);
        if(root.left!=null)help(root.left,f);
        if(root.right!=null)help(root.right,f);
    }
}