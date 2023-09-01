class Solution{
    public int getCount(Node node, int bud)
    {
        //code here  
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(node,1));
        int count = 0;
        int sum = 0;
        
        while(q.size()>0){
            Node temp = q.peek().a;
            int lvl = q.peek().b;
            q.remove();
            if(temp.left==null && temp.right==null){
                count++;
                sum = sum + lvl;
                if(sum>bud) return count-1;
                if(sum==bud) return count;
            }
            if(temp.left!=null) q.add(new Pair(temp.left,lvl+1));
            if(temp.right!=null) q.add(new Pair(temp.right,lvl+1));
        }
        return count;
        
    }
}

class Pair{
    Node a;
    int b;
    Pair(Node a, int b){
        this.a = a;
        this.b = b;
    }
}