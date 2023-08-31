int height(Node *root){
    if(!root)
        return 0;
    int leftHeight = height(root->left);
    int rightHeight = height(root->right);
    return (leftHeight>rightHeight?leftHeight:rightHeight)+1;
}
int getBalance(Node *root){
    if(!root)
        return 0;
    int leftHeight = height(root->left);
    int rightHeight = height(root->right);
    return rightHeight-leftHeight;
}

Node *leftRotation(Node *x){
    Node *y = x->right;
    Node *T = y->left;
    x->right = T;
    y->left = x;
    return y;
}

Node *rightRotation(Node *x){
    Node *y = x->left;
    Node *T = y->right;
    x->left = T;
    y->right = x;
    return y;
}

int findMax(Node *head){
    if(!head)
        return -1;
    while(head->left){
        head = head->left;
    }
    return head->data;
}
Node* deleteNode(Node* root, int data)
{
    //add code here,
    if(!root)
        return root;
    if(root->data<data)
        root->right = deleteNode(root->right,data);
    else if(root->data>data)
        root->left = deleteNode(root->left,data);

    else {
            if (!root->left || !root->right) {
                Node* temp = NULL;
                if (root->left == temp) temp = root->right;
                else temp = root->left;
                
                if (temp == NULL) {
                    temp = root;
                    root = NULL;
                } else {
                    root = temp;
                }
            } else {
                int rep = findMax(root->right);
                root->data = rep;
                root->right = deleteNode(root->right, rep);
            }
        }
        if(!root)
            return root;
        int bff = getBalance(root);
          if(bff>1 and getBalance(root->right)>=0)
                return leftRotation(root);
          else if(bff<-1 and getBalance(root->left)<=0)
                return rightRotation(root);
          else if(bff>1 and getBalance(root->right)<0){
                root->right = rightRotation(root->right);
                return leftRotation(root);
          }
          else if(bff<-1 and getBalance(root->left)>0){
                root->left = leftRotation(root->left);
                return rightRotation(root);
          }
    return root;
}