// Use a queue of TreeNode (LinkedList) to be a tool.
// Everytime poll the root (add it first of course) to the queue, investigate the child, and go on

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "[]";
        Queue<TreeNode> queue = new LinkedList<>();
        StringBuilder res = new StringBuilder("[");
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(node != null){
                queue.add(node.left);
                queue.add(node.right);
                res.append(node.val + ",");
            } else{
                res.append("null,");
            }
        }
        res.deleteCharAt(res.length() - 1);
        res.append("]");
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("[]")) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        String[] vals = data.substring(1,data.length()-1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        queue.add(root);
        int index = 1;
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(!vals[index].equals("null")){
                node.left = new TreeNode(Integer.parseInt(vals[index]));
                queue.add(node.left);
            }
            index++;
            if(!vals[index].equals("null")) {
                node.right = new TreeNode(Integer.parseInt(vals[index]));
                queue.add(node.right);
            }
            index++;
        }
        return root;
    }
}
