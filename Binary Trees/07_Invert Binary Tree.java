// Faith , Expectation techniques  on left and right -> just swap left and right of a node , how to do that -> at your level just chage node.left = invert(node.right) and  node.right = invert(node.left)  and return node;

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;

        TreeNode left = invertTree(root.left);

        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}