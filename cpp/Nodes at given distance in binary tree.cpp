class Solution{
public:
    void dfs(Node* root, unordered_map<Node*, Node*>& parent){
        if(root == NULL) return;
        if(root->left){
            parent[root->left] = root;
            dfs(root->left, parent);
        }
        if(root->right){
            parent[root->right] = root;
            dfs(root->right, parent);
        }
    }
    
    void findNode(Node* root, Node* &targetNode, int t){
        if(root == NULL) return;
        if(root->data == t){
            targetNode = root;
            return;
        }
        if(root->left) findNode(root->left, targetNode, t);
        if(root->right) findNode(root->right, targetNode, t);
    }
    
    vector<int> KDistanceNodes(Node* root, int target, int k){
        Node* targetNode;
        findNode(root, targetNode, target);
        
        queue<Node*> q;
        q.push(targetNode);
        
        unordered_map<Node*, Node*> parent;
        parent[root] = NULL;
        dfs(root, parent);
        
        unordered_map<Node*, bool> vis;
        vis[targetNode] = true;
        
        int level = 0;
        while(!q.empty()){
            if(level == k) break;
            level += 1;
            
            int size = q.size();
            
            for(int i=1; i<=size; i++){
                Node* node = q.front();
                q.pop();
                
                if(node->left && !vis[node->left]){
                    q.push(node->left);
                    vis[node->left] = 1;
                }
                
                if(node->right && !vis[node->right]){
                    q.push(node->right);
                    vis[node->right] = 1;
                }
                
                if(parent[node] && !vis[parent[node]]){
                    q.push(parent[node]);
                    vis[parent[node]] = 1;
                }
            }
        }
        
        vector<int> res;
        while(!q.empty()){
            res.push_back(q.front()->data);
            q.pop();
        }
        sort(res.begin(), res.end());
        
        return res;
    }
};