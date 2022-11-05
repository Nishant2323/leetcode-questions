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
class Pair{
    TreeNode node;
    int num;
    Pair(TreeNode node , int num){
        this.node=node;
        this.num=num;
    }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int ans=0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            int size = q.size();
            int min = q.peek().num;
            int first=0;
            int last =0;
            for(int i=0;i<size;i++){
                int curr_in = q.peek().num-min;
                TreeNode node = q.peek().node;
                q.remove();
                if(i==0)first=curr_in;
                if(i==size-1)last=curr_in;
                if(node.left!=null)q.add(new Pair(node.left,curr_in*2+1));
                if(node.right!=null)q.add(new Pair(node.right,curr_in*2+2));
            }
            ans = Math.max(ans,last-first+1);
        }
        return ans;
    }
}