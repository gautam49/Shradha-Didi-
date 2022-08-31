// level order concept, -> first node at each level 
class Tree 
{
    // Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root) 
    {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while (q.size() > 0) {
            int size = q.size();
            int flag = 0;
            while (size > 0) {
                Node top = q.remove();
                if (flag == 0) {
                    result.add(top.data);
                    flag = 1;
                }
                if (top.left != null)
                    q.add(top.left);
                if (top.right != null)
                    q.add(top.right);
                size--;
            }
        }
        return result;
    }
}