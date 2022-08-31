// hints use queue , size of queue -> helps to maintain level

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<List<Integer>>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(q.size()>0)
        {
            int size = q.size();
            List<Integer>level = new ArrayList<>();
            while(size > 0)
            {
                TreeNode top = q.remove();
                level.add(top.val);
                
                if(top.left!=null) q.add(top.left);
                if(top.right!=null) q.add(top.right);
                size--;
            }
            result.add(level);
        }
        return result;
    }
}