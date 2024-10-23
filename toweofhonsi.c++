#include<iostream>
using namespace std;
 void toweofhonis( int n,string src,string helper,string  dest){
    //base case
    if(n==1){
        cout<<"transfer disk"<<"  "<<n<<"    "<<"from"<<"   "<<src<<"  "<<"to"<<"  " <<dest<<endl;
        return;
    }
    toweofhonis(n-1,src,dest,helper);
    cout<<n<<"  "<<src<<"  "<<dest<<endl;
    toweofhonis(n-1,helper,src,dest);

 }
 int main(){
    int n=3;
    toweofhonis(n,"s","h","d");
 }