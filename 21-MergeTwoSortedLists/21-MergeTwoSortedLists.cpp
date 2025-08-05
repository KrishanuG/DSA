// Last updated: 8/5/2025, 12:36:47 PM
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
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        
 ListNode* ln=new ListNode(0); 
        ListNode* temp=ln;                   
        while(l1!=NULL && l2!=NULL){
            if(l1->val <= l2->val){
                temp->next=l1;
                l1=l1->next;
                temp=temp->next;
            }
            else{
                temp->next=l2;
                l2=l2->next;
                temp=temp->next;
            }
        }
        if(l1!=NULL){
            temp->next=l1;
        }
        if(l2!=NULL){
            temp->next=l2;   
        }
        return (ln->next);
    }
};