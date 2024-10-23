#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

int solve(string& a ,string& b, int i,int j){
    if(i==a.length()){
        return 0;

    }
    if(j==b.length()){
        return 0;

    }
    int ans=0;
    if(a[i]==b[j]){
        ans=1+solve(a,b,i+i,j+1);
    }
    else{
        ans=max(solve(a,b,i+1,j),solve(a,b,i,j+1));
    }
    return ans;

}
/*int solve(string& a ,string& b, int i,int j,vector<vector<int>>&dp){
    if(i==a.length()){
        return 0;

    }
    if(j==b.length()){
        return 0;

    }
    if(dp[i][j]!=-1){
        return dp[i][j];
    }
    int ans=0;
    if(a[i]==b[j]){
        ans=1+solve(a,b,i+i,j+1,dp);
    }
    else{
        ans=max(solve(a,b,i+1,j,dp),solve(a,b,i,j+1,dp));
    }
    return  dp[i][j]=ans;

}*/
int solvetab(string& a ,string& b){
    vector<int>curr(a.length()+1,0);
    vector<int>next(b.length()+1,0);
    for(int i=a.length()-1;i>=0;i--){
        for(int j=b.length()-1;j>=0;j--){
             int ans=0;
    if(a[i]==b[j]){
        ans=1+next[j+1];
    }
    else{
        ans=max(next[j],curr[j+1]);
    }
      curr[j]=ans;
        }
        next=curr;
    }
    return next[0];

}

int main(){
    string a="abcde";
//reverse(a.begin(),a.end());
    string b="abd";
    //vector<vector<int>>dp(a.length(),vector<int>(b.length(),-1));
   cout<< solvetab(a,b);
}