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
    ListNode* deleteDuplicates(ListNode* head) {
        ListNode* fast;
        ListNode* slow=head;
        if(!head) return nullptr;
        fast=head->next;
        while(fast!=nullptr){
            if(head->val != fast->val){
            head=fast;
            fast=fast->next;
            }else{
                head->next=fast->next;
                fast=fast->next;
            }
        }
        return slow;
    }
};