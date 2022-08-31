// Approach:-  Faith and Expectation Method ,  calculating sub tree sum of left and right(PostOrder) ;

class Solution {
    public int subtreeSum(Node root) {
        if (root == null)
            return 0;
        // calculating new data of current data
        int newData = subtreeSum(root.left) + subtreeSum(root.right);

        // calulation subtresum of current node
        int subTreeSum = newData + root.data;

        // updating value of current
        root.data = newData;

        // returning subtree sum
        return subTreeSum;
    }

    public void toSumTree(Node root) {
        // add code here.
        int nothing = subtreeSum(root);
    }
}