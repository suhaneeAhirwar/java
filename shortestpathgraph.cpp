#include<iostream>
#include<queue>
#include<unordered_map>
#include<list>
#include<vector>
#include<algorithm>  //for  reverse function
using namespace std;
vector<int>shotestPath (vector<pair<int,int  >>edges,int n,int s,int t){
    //create adjacency list 
    unordered_map<int,list<int >> adj;
    for(int i=0;i<edges.size();i++){
        int u=edges[i].first;
        int v=edges[i].second;
        adj[u].push_back(v);
        adj[v].push_back(u);
    }
    //do bfs;
    unordered_map<int,bool>visited;
    unordered_map<int ,int >parent ;
    queue<int>q;
    q.push(s);
    parent[s]=-1;
    visited[s]=true;
    while (!q.empty())
    {
        /* code */
       int front=q.front();
       q.pop() ;
       for(auto i:adj[front]){
        if(!visited[i]){
            visited[i]=true;
            parent[i]=true;
            q.push(i);
        }
       }

    }
    
    
    //parent shorted path;
    vector<int>ans;
    int currentnode=t;
    ans.push_back(t);
    while (currentnode!=s)
    {
        /* code */
        currentnode=parent[currentnode];
        ans.push_back(currentnode);
    }

       reverse(ans.begin(),ans.end());
       return ans;
    
}
int main(){
    vector<pair<int,int >>edges={{1, 2}, {2, 3}, {3, 4}, {1, 4}, {4, 5}};

    int n;
    cout<<"enter the number of node";
    cin>>n;
    int s;
    cout<<"enter the source ";
    cin>>s;
    int t;
    cout<<"enter the decsination";
    cin>>t;
     vector<int> result = shotestPath(edges, n, s, t);
     cout<<s<<"  "<<t<<endl;
     for(int node:result){
        cout<<node<<endl;


     }
     cout<<endl;



}
