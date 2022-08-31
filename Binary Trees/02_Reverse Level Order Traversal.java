// same like a leve order traversal but small changes and reversing , rather then calling left and right recursion call we call right and left recirsion call , AND PUSH THE REMOVE VALUE OF QUQUE INTO STACK AND PRINT THE STACK
class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // level order traversal -> reverse 
        ArrayList<Integer> ans = new ArrayList<>();
        
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);
        while(q.size() > 0)
        {
           //remove form the queue 
           Node top = q.remove();
           
           //add to the ans arraylist
           ans.add(top.data);
           
           //pushing thier child
           if(top.right != null) q.add(top.right);
           
           if(top.left != null) q.add(top.left);
        }
        Collections.reverse(ans);
        return ans;
        
    }
    
}