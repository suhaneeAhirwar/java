#include<iostream>
using namespace std;
int solve(int index,int diff,int arr[]){
    if(index<0)
    return 0;
    int ans=0;
    for(int j=index-1;j>=0;j--){
        if(arr[index] - arr[j]==diff){
            ans=max(ans,1+solve(j,diff,arr));

        }
    }
    return ans;

    }
    int lengthOflongestap(int arr[],int n){
        if(n<=2)
        return n;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                ans=max(ans,2+solve(i,arr[j]-arr[i],arr));
            }
        }
        return ans;
    }
    int main(){
        int arr[7]={3,5,7,8,3,7,2 };
        int n=7;
        cout<<lengthOflongestap(arr,n);

    }
