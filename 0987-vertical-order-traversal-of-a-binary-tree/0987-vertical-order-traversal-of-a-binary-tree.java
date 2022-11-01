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
    int x;
    int y;
    Pair(TreeNode node,int x, int y){
        this.node = node;
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer, PriorityQueue<Integer>>> map =new TreeMap<>();
        Queue<Pair> temp= new  LinkedList<>();
        temp.add(new Pair(root,0,0));
        while(!temp.isEmpty()){
            Pair p= temp.remove();
            TreeNode node1= p.node;
            int x1=p.x;
            int y1 =p.y;
            if(!map.containsKey(x1)){
                map.put(x1,new TreeMap<>());
            }
            if(!map.get(x1).containsKey(y1)){
                map.get(x1).put(y1,new  PriorityQueue<Integer>());
            }
            map.get(x1).get(y1).add(node1.val);
            if(node1.left!=null)temp.add(new Pair(node1.left,x1-1,y1+1));
            if(node1.right!=null)temp.add(new Pair(node1.right,x1+1,y1+1));
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(TreeMap<Integer, PriorityQueue<Integer>> t:map.values()){
            List<Integer> res= new ArrayList<>();
            for(PriorityQueue<Integer> q:t.values()){
                while(!q.isEmpty()){
                    res.add(q.remove());
                }
            }
         ans.add(res);
        }
        return ans;
    }
}