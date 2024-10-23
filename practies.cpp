#include<iostream>
using namespace std;
class node{
    public:
    int data;
    node*next;
    
    void sorted(node* head,int d){
    node*temp=new node[d];
    temp=head;
    node*curr=head->next;
    if(head > curr){
        head->next=head;
        head=head->next;
    }
    }
    void  Print(node*&head){
        node*temp=head;
        while(temp!=NULL){
            cout<<temp->data;
            temp=temp->next;
        }
    }
};
int  main(){
     node*node1=new node();
     node*head=node1;
     cout<<endl;
    
}