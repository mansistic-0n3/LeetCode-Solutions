/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* deleteDuplicates(struct ListNode* head){
    struct ListNode *slow =head;
    struct ListNode *fast;
    if(!head) return NULL;
    fast=head->next;
    while(fast!=NULL){
        if(fast->val != head->val){
        head=fast;
        fast=fast->next;
        }else{
        head->next=fast->next;
        fast=fast->next;
        }
    }
     return slow;
}
