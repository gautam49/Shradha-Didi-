// level order concept, -> last node at each level 
class Solution {
    // Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node root) 
    {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while (q.size() > 0) {
            int size = q.size();
            while (size > 0) {
                size--;
                Node top = q.remove();
                if (size == 0) {
                    result.add(top.data);
                }
                if (top.left != null)
                    q.add(top.left);
                if (top.right != null)
                    q.add(top.right);
            }
        }
        return result;
    }
}
