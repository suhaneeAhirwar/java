#include<iostream>
#include<queue>
using namespace std;
class node{
    public:
    int data;
    node* left;
    node* right;
    node(int d){
        this->data=d;
        this->left=NULL;
        this->right=NULL;
    }
};
node* buildTree(node* root){
    cout<<"enter the data:";
    int data;
    cin>>data;
    root=new node(data);
    if(data==-1){
        return NULL;
    }
    cout<<"enter data for iserting at left:";
    root->left = buildTree(root->left);
    cout<<"enter data for iserting at right:";
    root->right= buildTree(root->right);
    return root;
}
void levelOrderTraversal(node* root) {
    if (!root) return;
    queue<node*> q;
    q.push(root);
    q.push(NULL);
    while (!q.empty()) {
        node* curr = q.front();
        q.pop();
        if(curr==NULL){
            cout<<endl;
            if(!q.empty()){
                q.push(NULL);
            }
        }
        else{
            cout << curr->data << " ";
            if (curr->left) q.push(curr->left);
            if (curr->right) q.push(curr->right);
        }
    }
}
void inOrderTraversal(node* root){
    if(root==nullptr){
        return;
    }
    cout<<root->data<<" ";
    inOrderTraversal(root->left);
    inOrderTraversal(root->right);
}
void preOrderTraversal(node* root){
    if(root==nullptr){
        return;
    }
    
    preOrderTraversal(root->left);
    cout<<root->data<<" ";
    preOrderTraversal(root->right);
}
int main(){
    node*root=NULL;
    root=buildTree(root);
    levelOrderTraversal(root);
    cout<<endl;
    inOrderTraversal(root);
    cout<<endl;
    preOrderTraversal(root);
    return 0;
}
//2 3 5 -1 -1 6 -1 -1  4 -1 -1 -1