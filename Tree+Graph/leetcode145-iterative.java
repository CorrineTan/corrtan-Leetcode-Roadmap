class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        int leftState = 1000;
        int rightState = 2000;
        int upState = 3000;
        int nodeState = leftState;

        while(node != null) {
            if(nodeState == leftState) {
                if(node.left != null) {
                    stack.push(node);
                    node = node.left;
                } else {
                    nodeState = rightState;
                }
            } else if (nodeState == rightState) {
                if(node.right != null) {
                    stack.push(node);
                    node = node.right;
                    nodeState = leftState;
                } else {
                    nodeState = upState;
                }
            } else if (nodeState == upState) {
                answer.add(node.val);
                TreeNode parent = null;
                if (!stack.isEmpty()) {
                    parent = stack.pop();
                    if (node == parent.left) {
                        nodeState = rightState;
                    }
                }
                node = parent;
            }
        }
        return answer;
    }
} 