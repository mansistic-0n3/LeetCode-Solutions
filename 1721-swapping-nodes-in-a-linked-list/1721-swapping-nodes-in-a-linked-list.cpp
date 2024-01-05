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
    ListNode* swapNodes(ListNode* head, int k) {
        ListNode* start= new ListNode();
        start->next=head;
        ListNode* fast=start;
        ListNode* slow=start;
        ListNode* store=start;
        ListNode* temp=start;
        
        for(int i =0; i<k; i++){
            store=store->next;
            fast=fast->next;
        }
        
        while(fast->next != NULL){
            fast=fast->next;
            slow=slow->next;
        }
        
        temp->val=slow->next->val;
        slow->next->val=store->val;
        store->val=temp->val;
        
            
        return head;
    }
};