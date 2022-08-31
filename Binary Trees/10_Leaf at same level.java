// make one global veriable leafLevel = -1 , traverse a tree if u get leaf fist time then leafLevel = level else check leavLeavel and curr level is same or not

class Solution {
    int leafNodeLevel = -1;

    boolean isleafAtSameLevel(Node node, int level) {
        if (node == null)
            return true;
        if (node.left == null && node.right == null) {
            if (leafNodeLevel == -1)
                leafNodeLevel = level - 1;
            else if (leafNodeLevel != level - 1)
                return false;
            return true;
        }

        return isleafAtSameLevel(node.left, level + 1) && isleafAtSameLevel(node.right, level + 1);

    }

    boolean check(Node root) {
        if (root == null)
            return true;
        return isleafAtSameLevel(root, 0);
    }
}