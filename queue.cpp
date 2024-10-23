#include<iostream>
#include<stack>
#include<queue>
using namespace std;
 queue <int> rev(queue<int >q){
    stack<int> s;
    while(!q.empty()) {
        int element =element;
        q.pop();
        s.push(element);

    }
    while (!s.empty())
    {
        /* code */
        int element =s.top();
        s.pop();
        q.push(element);
    }
    return q;
    
 }
 int main(){
       queue<int> q;
    q.push(1);
    q.push(2);
    q.push(3);
    q.push(4);
    q.push(5);

    q = rev(q);

    while (!q.empty()) {
        cout << q.front() << " ";
        q.pop();
    }

    return 0;
}

