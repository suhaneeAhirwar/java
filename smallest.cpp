#include<iostream>
 using  namespace std;
 int smallest (int a[10],int start){
    //base case;
    if(start==9){
        return  a[start];
    }
    int  x=a[start];
    int y= smallest(a,start+1); 
    if(x<y)
    return x;
    else 
    return y;
 }
 int main(){
    int a[10]={ 4,5,6,0,4,3,9,7,4,8};
    int n=smallest(a,0);
    cout<<" the smallest elements"<< n;
    }
 
