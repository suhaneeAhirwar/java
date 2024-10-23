#include<iostream>
#include<string>
using namespace std;
class stack{
    public:
    int *arr;
    int size;
    int  top;
    //properties
    stack(int size){
    this -> size=size;
    arr=new  int [size];
     top=-1;
    }
    //behaviour
    void push(int element ){
        if(size-top>=1){
            top++;
            arr [top]=element;
        }
        else{
            cout<<"stack is overflow";
        }
    }
    void pop( ){
        if(size-top>=1){
            top--;

        }
        else{
            cout<<"stack underflow"<<endl;
        }
    }
    int  peek(){
        if(top>=0){
            return  arr[top];
        }
        else{
            cout<<"stack is empty ";
            return -1;
        }
    }
    bool isEmpty(){
        if(top==-1){
            cout<<" stack is empty "<<endl;
        }
        else {
            return false;
        }
        
    }


};
int main(){
    stack st(4);
    st.push(4);
    st.push(8);
    st.push(5);


    cout<< st.peek()<<endl;
st.pop();



}