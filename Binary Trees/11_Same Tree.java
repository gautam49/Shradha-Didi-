// traverse to each node of the both trees simulteniusly and check wherther they are sam or not.

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        else if (p == null || q == null || p.val != q.val)
            return false;

        if (isSameTree(p.left, q.left) && isSameTree(p.right, q.right))
            return true;
        else
            return false;
    }
}