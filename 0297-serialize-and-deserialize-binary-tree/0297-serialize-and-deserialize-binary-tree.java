 /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)return "";
        StringBuilder sb= new StringBuilder();
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode node = q.remove();
            if(node==null){
                sb.append("n ");
                continue;
            }
            sb.append(node.val+" ");
            q.add(node.left);
            q.add(node.right);
            
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data=="")return null;
        String[] sb = data.split(" ");
        Queue<TreeNode> q= new LinkedList<>();
        TreeNode root= new TreeNode(Integer.parseInt(sb[0]));
        q.add(root);
        for(int i=1; i<sb.length;i++){
            TreeNode parent = q.remove();
            if(!sb[i].equals("n")){
                TreeNode left= new TreeNode(Integer.parseInt(sb[i]));
                parent.left=left;
                q.add(left);
            }
            if(!sb[++i].equals("n")){
                TreeNode right= new TreeNode(Integer.parseInt(sb[i]));
                parent.right=right;
                q.add(right);
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));