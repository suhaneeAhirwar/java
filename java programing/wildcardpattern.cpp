#include<iostream>
using namespace std;
bool solve(string& str,string& pattern ,int i,int j){
    if(i<0 && j<0){
        return true;

    }
    if(i>=0 && j<0){
        return false;

    }
    if(i<0 && j>=0){
        for(int k=0;k<=j;k++){
            if(pattern[k] !='*'){
                return false;
            }
        }
        return true;

    }
    if(str[i]==pattern[j] || pattern[j]=='?')
    return solve(str,pattern ,i=1,j-1);
    else if (pattern[j]=='*')
    return  (solve(str,pattern,i-1,j) || solve(str,pattern,i,j-1));
    else return false;
}
bool solve(string& str,string& pattern ,int i,int j){
    if(i<0 && j<0){
        return true;

    }
    if(i>=0 && j<0){
        return false;

    }
    if(i<0 && j>=0){
        for(int k=0;k<=j;k++){
            if(pattern[k] !='*'){
                return false;
            }
        }
        return true;

    }
    if(str[i]==pattern[j] || pattern[j]=='?')
    return solve(str,pattern ,i=1,j-1);
    else if (pattern[j]=='*')
    return  (solve(str,pattern,i-1,j) || solve(str,pattern,i,j-1));
    else return false;
}
int main(){
    string  str;
    cin>>str;
    string pattern ;
    cin>>pattern;
    cout<<solve (str ,pattern,str.length()-1,pattern.length()-1);
}