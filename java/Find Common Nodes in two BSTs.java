
// solution 1 T:O(N2+N1) and S:O(N1+N2)

class Solution
{
    //Function to find the nodes that are common in both BST.
	public static ArrayList<Integer> findCommon(Node root1,Node root2)
    {
        //code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        inorder(root1,hm);
        res(root2,hm,list);
        return list;
    }
    static void inorder(Node node,HashMap<Integer,Integer> hm){
        if(node==null) return;
        inorder(node.left,hm);
        hm.put(node.data,1);
        inorder(node.right,hm);
    }
    
    static void res(Node node, HashMap<Integer,Integer> hm, ArrayList<Integer> list){
        if(node==null) return;
        res(node.left,hm,list);
        if(hm.containsKey(node.data)) list.add(node.data);
        res(node.right,hm,list);
    }
}




// solution 2 T:O(n1+n2) and S:O(n1+n2) with one inorder fun

class Solution
{
	public static ArrayList<Integer> findCommon(Node root1,Node root2)
    {
        //code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        inorder(root1,hm,list,false);
        inorder(root2,hm,list,true);
        return list;
    }
    static void inorder(Node root, HashMap<Integer,Integer> hm, ArrayList<Integer> list,boolean flag){
        if(root==null) return;
        inorder(root.left,hm,list,flag);
        if(!flag) hm.put(root.data,1);
        if(flag && hm.containsKey(root.data)) list.add(root.data);
        inorder(root.right,hm,list,flag);
    }
}


// solution 3 TC = O(n1+n2) and SC = O(h1+n2)  


class Solution
{
    //Function to find the nodes that are common in both BST.
	public static ArrayList<Integer> findCommon(Node root1,Node root2)
    {
        //code here
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        
        while(true){
            if(root1!=null){
                s1.push(root1);
                root1 = root1.left;
            }
            else if(root2!=null){
                s2.push(root2);
                root2 = root2.left;
            }
            else if(s1.size()>0 && s2.size()>0){
                root1 = s1.peek();
                root2 = s2.peek();
                
                if(root1.data==root2.data){
                    list.add(root1.data);
                    s1.pop();
                    s2.pop();
                    root1 = root1.right;
                    root2 = root2.right;
                }
                else if(root1.data<root2.data){
                    s1.pop();
                    root1 = root1.right;
                    root2 = null;
                }
                else{
                    s2.pop();
                    root2 = root2.right;
                    root1 = null;
                }
            }
            else break;
        }
        return list;
    }
}
