/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    int lengthCycle(ListNode *head) {
        ListNode *fast=head;
        ListNode *slow=head;
        int length=0;
        while(fast!=NULL && fast->next!=NULL){
            fast=fast->next->next;
                slow=slow->next;
            if(fast==slow){
                ListNode *temp=slow;
                do{
                    temp=temp->next;
                    length++;
                }while(temp!=slow);
                    
                return length;
            }
        }
        return 0;
    }
    
    
    
    public:
    ListNode *detectCycle(ListNode *head){
        ListNode *fast=head;
        ListNode *slow=head;
        int length=0;
       while(fast!=NULL && fast->next!=NULL){
            fast=fast->next->next;
            slow=slow->next;
            if(fast==slow){
                length=lengthCycle(slow);
                break;
            }
        }
        
        ListNode *s=head;
        ListNode *f=head;
        
        if(length==0){
            return NULL;
        }
        
        while(length>0){
            s=s->next;
            length--;
        }
     
        while(f!=s){
            f=f->next;
            s=s->next;
        }
    return s;
    }            
    
};