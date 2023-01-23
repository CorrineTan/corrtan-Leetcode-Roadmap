// Use a hashmap to put value, index of the inroder list. Use it to see if root and its 
// parent node's position relationship and decide where to put the node

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 1; i < preorder.length; i++) {
            TreeNode node = new TreeNode(preorder[i]);
            insertNodes(root, node, map);
        }
        return root;
    }
    public void insertNodes(TreeNode root, TreeNode node, HashMap<Integer, Integer> map){
        while(node != root) {
            if(map.get(node.val) < map.get(root.val)) {
                if(root.left == null) {
                    root.left = node;
                }
                root = root.left;
            } else {
                if(root.right == null) {
                    root.right = node;
                }
                root = root.right;
            }
        }
    }    
}