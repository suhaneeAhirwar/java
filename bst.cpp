#include<iostream>
#include<queue>
using namespace std;

class Node{
    public:
    int data;
    Node* left;
    Node* right;

    Node(int d) {
        this->data = d;
        this->left = NULL;
        this->right = NULL;
    }
};

void traversal(Node* root) {
    if (root == NULL) {
        return;
    }
    
    queue<Node*> q;
    q.push(root);
    q.push(NULL);  // To mark the end of the current level
    
    while (!q.empty()) {
        Node* temp = q.front();
        q.pop();

        if (temp == NULL) {
            cout << endl;
            if (!q.empty()) {
                q.push(NULL);  // Mark the next level end
            }
        } else {
            cout << temp->data << " ";
            
            if (temp->left) {
                q.push(temp->left);
            }

            if (temp->right) {
                q.push(temp->right);
            }
        }
    }
}

Node* insert(Node* root, int d) {
    if (root == NULL) {
        root = new Node(d);
        return root;
    }

    if (d > root->data) {
        root->right = insert(root->right, d);
    } else {
        root->left = insert(root->left, d);
    }

    return root;
}
Node *min(Node*root){
    Node*temp=root;
    while (temp->left!=NULL)
    {
        temp=temp->left;
    }
    return temp;
    
}
Node*max(Node*root){
    Node*temp=root;
    while (temp->right!=NULL)
    {
        temp=temp->right;
    }
    return temp;
    
}


void takeInput(Node* &root) {
    int data;
    cin >> data;
    
    while (data != -1) {  // -1 is the sentinel value to stop input
        root = insert(root, data);
        cin >> data;
    }
}

int main() {
    Node* root = NULL;
    cout << "Enter data to create BST (end input with -1):" << endl;
    takeInput(root);

    cout << "Printing the BST level-wise:" << endl;
    traversal(root);
    cout<<"printing the  min value"<<min(root)-> data<<endl;
    cout<<"printing the max value"<<    max(root)->data<<endl;
    return 0;
}
