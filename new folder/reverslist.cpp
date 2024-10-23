#include<iostream>
using namespace std;
     void* revlist(node* Head){
        //base case
        if(head==NULL){
            return head;

        }
        if(head->next==Null){
            return head;
        }
        node*resthead=revlist(head->head);
        node*resttail=haed->next;
        resttail->next=NULL;
        head->next=NULL;
        return resttail;



     }
