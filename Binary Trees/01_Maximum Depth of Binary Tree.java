// Faith , Expectation techniques on left subtree and right subtree,  at your level ans = max(leftOFhight,rightOFheight) + 1;   

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        //get left subtree height , right subtree height
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        int ans = (left > right)? left : right;
        
        return ans+1;
    }
}