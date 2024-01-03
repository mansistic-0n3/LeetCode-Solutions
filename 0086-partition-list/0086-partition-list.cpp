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
    ListNode* partition(ListNode* head, int x) {
        
        ListNode* small = new ListNode();
        ListNode* large = new ListNode();
        ListNode* sh = small;
        ListNode* lh = large;
        
        if(!head) return nullptr;
        
        while(head!=nullptr){
            if(head->val < x){
                sh->next = head;
                sh = sh->next;
            }else{
                lh->next = head;
                lh = lh->next;
            }
            head=head->next;
        }
            lh->next=nullptr;
            sh->next=large->next;
            return small->next; 
    }
};