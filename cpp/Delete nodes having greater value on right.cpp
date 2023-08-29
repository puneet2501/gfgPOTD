struct Node
{
    int data;
    Node* next;
    
    Node(int x){
        data = x;
        next = NULL;
    }
};
*/
class Solution{
    public:
        Node* compute(Node* head) {
            head = rev(head);
            Node* node = head;
            
            while (node != nullptr && node->next != nullptr) {
                if (node->data > node->next->data) {
                    node->next = node->next->next;
                } else {
                    node = node->next;
                }
            }
            
            return rev(head);
        }
        
    Node* rev(Node* head) {
        Node* prev = nullptr;
        Node* next = nullptr;
        
        while (head != nullptr) {
            next = head->next;
            head->next = prev;
            prev = head;
            head = next;
        }
        
        return prev;
    }
};