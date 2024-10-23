#include<iostream>
#include<vector>
using namespace std;
int solve(int n,vector<int >& cost){
    if(n==0){
        return cost[n];

    }
    if(n==1){
        return cost[n];
    }
    int ans=cost[n]+min(solve(n-1,cost ),solve(n-2,cost));
    return ans ;

}
int solve2(int n,vector<int>&dp,vector<int>&cost){
     if(n==0){
        return cost[n];

    }
    if(n==1){
        return cost[n];
    }
    //step3
    if(dp[n]!=-1){
        return dp[n];

    }
    //step2
     dp[n]=cost[n]+min(solve2(n-1,dp,cost ),solve2(n-2,dp,cost));
    return dp[n];

}
int minCostClimbingstairs(vector<int >&cost){
     int n=cost.size();
    //step1
    vector<int >dp(n+1,-1);
    int ans=min(solve2(n-1,dp,cost ),solve2(n-2,dp,cost));
    return ans;
}
int main(){
    int n;
    cout<<"enter the number of steps";
    cin>>n;
    vector<int>cost(n+1);
    cout<<"enter the cost for each step";
    for(int i=0;i<n;i++){
        cin>>cost[i];
    }
    cout<<"enter cost to climb the stairs"<<minCostClimbingstairs(cost);
    return 0;
}
