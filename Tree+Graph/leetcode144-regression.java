class Solution {
    private List<Integer> answer = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        // Visit the root first, then the left subtree, then the right subtree.
        answer.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return answer;
    }
}