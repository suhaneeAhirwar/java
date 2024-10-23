#include <iostream>
#include <vector>
using namespace std;

struct node {
    int data;
    node* next;
};

bool checkPalindrome(vector<int>& arr) {
    int s = 0;
    int e = arr.size() - 1;

    while (s < e) {
        if (arr[s] != arr[e]) {
            return false;
        }
        s++;
        e--;
    }

    return true;
}

bool isPalindrome(node* head) {
    vector<int> arr;
    node* temp = head;

    while (temp != nullptr) {
        arr.push_back(temp->data);
        temp = temp->next;
    }

    return checkPalindrome(arr);
}

int main() {
    node* head = new node{1, nullptr};
    head->next = new node{3, nullptr};
    head->next->next = new node{3, nullptr};

    if (isPalindrome(head)) {
        cout << "The linked list is a palindrome." << endl;
    } else {
        cout << "The linked list is not a palindrome." << endl;
    }

    return 0;
}
