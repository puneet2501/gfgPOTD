void printCorner(Node *root) {
    
    queue<Node*> q;
    q.push(root);
    
    while (!q.empty()) {
        int n = q.size();
        
        for (int i = 0; i < n; ++i) {
            Node* curr = q.front();
            q.pop();
            if (i == 0 || i == n - 1) std::cout << curr->data << " ";
            if (curr->left != nullptr) q.push(curr->left);
            if (curr->right != nullptr) q.push(curr->right);
        }
    }
}