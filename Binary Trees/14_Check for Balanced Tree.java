// write a heigth function such that if(left.height ==-1|| right.height == -1) means not a balaced tree return -1 , else return the height of the tree.  Do that for all nodes of the tree ;

class Tree {
    int height(Node root) {
        if (root == null)
            return 0;
        int left = height(root.left);
        int right = height(root.right);

        if (left < 0 || right < 0 || Math.abs(left - right) > 1)
            return -1;

        int myHeight = Math.max(left, right) + 1;
        return myHeight;
    }

    // Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root) {
        // Your code here
        int ans = height(root);
        if (ans == -1)
            return false;
        return true;

    }
}