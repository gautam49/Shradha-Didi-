// isomorphic trees ->  swapping left and right children of several nodes.

//Approach-> 1) Data of n1 and n2 is same. 
    // 2a) Left child of n1 is isomorphic to left child of n2 and right child of n1 is isomorphic to right child of n2. 
    // OR  
    // 2b) Left child of n1 is isomorphic to right child of n2 and right child of n1 is isomorphic to left child of n2. 
    // then trees are isomorphic

class Solution {
    // Return True if the given trees are isomotphic. Else return False.
    boolean isIsomorphic(Node root1, Node root2) {
        // code here.
        if (root1 == null && root2 == null)
            return true;
        else if (root1 == null || root2 == null || root1.data != root2.data)
            return false;
        boolean a = isIsomorphic(root1.left, root2.left) && isIsomorphic(root1.right, root2.right);
        boolean b = isIsomorphic(root1.left, root2.right) && isIsomorphic(root1.right, root2.left);
        return a || b;
    }

}