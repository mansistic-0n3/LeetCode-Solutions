/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
//     ListNode* swapPairs(ListNode* head) {
//         if(head == NULL || head -> next == NULL) 
//         {
//             return head;
//         }
            
//         ListNode* temp; // temporary pointer to store head -> next
//         temp = head->next; // give temp what he want
        
//         head->next = swapPairs(head->next->next); // changing links
//         temp->next = head; // put temp -> next to head
        
//         return temp; // now after changing links, temp act as our head
    
//     }
// };
    
    ListNode* swapPairs(ListNode* head) {
        if(head == NULL || head->next == NULL) return head;
        ListNode* slow = head, *fast = head->next, *prev = NULL;
        head = fast;
        
        while(slow != NULL && fast != NULL){
            slow->next = fast->next;
            fast->next = slow;
            if(prev != NULL) prev->next = fast;
            prev = slow;
            slow = slow->next; 
            if(slow != NULL ) fast = slow->next;            
        }
        return head;
    }
};