class Solution
{
public:
    int getCount(Node *root, int k)
    {
       
        int res=0;
        int sum=0;
        queue<pair<Node*,int>>q;
        q.push({root,1});
        while(!q.empty())        {
            Node* temp=q.front().first;
            int lvl=q.front().second;
            q.pop();
            
            if(temp->left==NULL && temp->right==NULL)
            {
                res++;
                sum += lvl;
                if(sum==k)return res;
                if(sum>k)return res-1; 
            }
            if(temp->left)q.push({temp->left,lvl+1});
            if(temp->right)q.push({temp->right,lvl+1});
        }

        return res;
    }
};