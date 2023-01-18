class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        int depth = 0;
        while(!nodeQueue.isEmpty()) {
            int size = nodeQueue.size();
            depth++;
            for(int i = 0; i < size; i++) {
                TreeNode curNode = nodeQueue.poll();
                if(curNode.left == null && curNode.right == null) return depth;
                if(curNode.left != null) {
                    nodeQueue.add(curNode.left);
                }
                if(curNode.right != null) {
                    nodeQueue.add(curNode.right);
                }
            }
        }
        return depth;
    }
}