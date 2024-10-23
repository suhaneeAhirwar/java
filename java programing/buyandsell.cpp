#include<iostream>
#include<vector>
using namespace std;
int slove(int index ,int  buy,vector<int>&prices){
    if(index==prices.size()){
        return 0;

    }
    int  profit=0;
    if(buy){
    int buykaro= -prices[index]+slove(index+1,0,prices);
    int skipkar=0+ slove(index+1,1,prices);
    profit=max(buykaro,skipkar);
    }
    else{
        int sellkaro=prices[index]+slove(index+1,1,prices);
        int skipkaro =0+slove(index+1,0,prices);
        profit=max(sellkaro,skipkaro);
    }
    return profit;
    

}
int slove(int index ,int  buy,vector<int>&prices,vector<vector<int>>&dp){
    if(index==prices.size()){
        return 0;

    }
    if(dp[index][buy]!=-1){
        return dp[index][buy];
    }

    int  profit=0;
    if(buy){
    int buykaro= -prices[index]+slove(index+1,0,prices,dp);
    int skipkar=0+ slove(index+1,1,prices,dp);
    profit=max(buykaro,skipkar);
    }
    else{
        int sellkaro=prices[index]+slove(index+1,1,prices);
        int skipkaro =0+slove(index+1,0,prices);
        profit=max(sellkaro,skipkaro);
    }
    return dp[index][buy]=profit;
    

}
int  main(){
    vector<int >prices={7,1,5,3,6,4};
    int n=prices.size();
    vector<vector<int>>dp(n,vector<int>(2,-1));
    cout<<slove(0,1,prices,dp);

}