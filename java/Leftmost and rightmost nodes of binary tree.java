class Tree
{
    public static void printCorner(Node node)
    {
        // add your code here    
        // code 1
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        
        while(q.size()>0){
            int n = q.size();
            for(int i=0; i<n; i++){
                Node curr = q.remove();
                if(i==0 || i==n-1){
                    System.out.print(curr.data+" ");
                }
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
        
        // code 2
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        q.add(null);
        boolean flag = false;
        
        while(q.size()>0){
            Node curr = q.remove();
            if(curr==null){
                flag = true;
                if(q.size()==0) break;
                else q.add(null);
            }
            else{
                if(q.peek()==null || flag==true){
                    System.out.print(curr.data+" ");
                    flag =false;
                }
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
        }
    }
    
}