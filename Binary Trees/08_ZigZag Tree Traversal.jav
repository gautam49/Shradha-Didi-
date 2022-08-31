//hints -> level order trversal , flag for even or odd level , arr for levelOrder , copy arr to result arrylist ,       Approach:-  Do what u do in level order traversal with flag == true , 1) at each level make arr of queue size ;  2)  flag Is help u find the level is even or odd ; 3) according to that calculate the idx and set[idx] = node.data , 4)flip the flag every time ; copy levelOrder arr in result arr , and return result
class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    if(root==null) return result;
	    //Add your code here.
	    Queue<Node> q = new ArrayDeque<>();
	    q.add(root);
	    boolean flag = true;
	    while(q.size()>0)
	    {
	        int size = q.size();
	        int []levelOrder = new int[size];
	        for(int i = 0 ; i < size;i++)
	        {
	            Node top = q.remove();
	            int idx = flag ? i : size-1-i;
	            levelOrder[idx] = top.data;
	            
	            if(top.left!=null) q.add(top.left);
	            if(top.right!=null) q.add(top.right);
	        }
	        flag = !flag;
	        
	        for(int val : levelOrder)
	        {
	            result.add(val);
	        }
	    }
	    return result;
	}
}