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
    public int deepestLeavesSum(TreeNode root) {
        TreeMap<Integer,List<Integer>> c= new TreeMap<>();
        int count=1;
        if(root==null) return 0;
        help(root,c,count);
        System.out.println(c);
        int d =c.lastKey();
        List<Integer> ans= c.get(d);
        int sum=0;
        for(int v:ans){
            sum=sum+v;
        }
        return sum;
        
    }
    public void help(TreeNode root,Map<Integer,List<Integer>> c,int c1){
        if(root.left==null&&root.right==null) {
            if(!c.containsKey(c1)){
               List<Integer> a= new ArrayList<>();
                a.add(root.val);
                c.put(c1,a);
            }
           else c.get(c1).add(root.val);
        }
        if(root.left!=null)help(root.left,c,c1+1);
        if(root.right!=null)help(root.right,c,c1+1);
    }
}