#include<iostream>
#include<string>
#include<stack>
using namespace std;
class twostack{
    public:
    int *arr;
    int top1;
    int top2;
    int size;
    //initialize twostack
    twostack(int s){
        this-> size=s;
        top1=-1;
        top2=s;
        arr=new int [s];
    }
     void push1(int num ){
        //arleast a empty space present 
        if(top2-top1>1){
            top1++;
            arr[top1]=num;
        }
        else{
            cout<<"stack is overflow";
        }

     }
     //push  in stack 2
     void  push2(int num){
        if(top2-top1>1){
            top2--;
            arr[top2]=num;
        }
        else{
            cout<<"stack is overflow";
        }
        

     }
     //pop from stack 1 return  popped element
     int pop1(){
        if(top1>0){
            int ans =arr[top1];
            top1--;
            return ans;
            
        }
        else{
            return -1;
        }
     }
      //pop from stack 2 return popped element 
      int pop2(){
        if(top2<size){
            int ans =arr[top2];
            top2++;
            return ans;
            
        }
        else{
            return -1;
        }
     }

};

int main(){
    twostack st(10);  // Create a two-stack object with size 10

    // Test stack 1
    st.push1(4);
    st.push1(8);
    st.push1(5);

    cout << "Popped from Stack 1: " << st.pop1() << endl;  // Should pop 5
    cout << "Popped from Stack 1: " << st.pop1() << endl;  // Should pop 8

    // Test stack 2
    st.push2(14);
    st.push2(18);
    st.push2(15);

    cout << "Popped from Stack 2: " << st.pop2() << endl;  // Should pop 15
    cout << "Popped from Stack 2: " << st.pop2() << endl;  // Should pop 18

    return 0;
}
