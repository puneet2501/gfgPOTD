class Solution {
public:
    Node* sortedInsert(Node* head1, int key) {
        Node* x = new Node(key);
        
        if (head1 == nullptr || head1->data >= key) {
            x->next = head1;
            return x;
        }
        
        Node* node = head1;
        while (node->next != nullptr) {
            if (node->data < key && node->next->data >= key) {
                x->next = node->next;
                node->next = x;
                return head1;
            }
            node = node->next;
        }
        node->next = x;
        
        return head1;
    }
};