#include<iostream>
#include<vector>
#include<climits> // For INT_MAX
using namespace std;

int bellmanFord(int n, int m, int src, int dest, vector<vector<int>>& edges) {
    vector<int> dist(n + 1, INT_MAX); // Initialize distances to infinity
    dist[src] = 0; // Distance to source is 0
    
    // Relaxation process
    for(int i = 1; i < n; i++) {
        for(int j = 0; j < m; j++) {
            int u = edges[j][0];
            int v = edges[j][1];
            int wt = edges[j][2];
            
            // Relax the edge if possible
            if(dist[u] != INT_MAX && dist[u] + wt < dist[v]) {
                dist[v] = dist[u] + wt;
            }
        }
    }

    // Check for negative weight cycle
    bool flag = false;
    for(int j = 0; j < m; j++) {
        int u = edges[j][0];
        int v = edges[j][1];
        int wt = edges[j][2];
        if(dist[u] != INT_MAX && dist[u] + wt < dist[v]) {
            flag = true; // Negative weight cycle detected
            break;
        }
    }

    if(flag) {
        return -1; // Negative weight cycle exists
    } else {
        return dist[dest] == INT_MAX ? -1 : dist[dest]; // Return the distance to the destination
    }
}

int main() {
    vector<vector<int>> edges;
    int n, m;
    
    cout << "Enter number of nodes: ";
    cin >> n;
    
    cout << "Enter number of edges: ";
    cin >> m;
    
    edges.resize(m);
    
    cout << "Enter the edges in the format (u v wt):" << endl;
    for(int i = 0; i < m; i++) {
        int u, v, wt;
        cin >> u >> v >> wt;
        edges[i] = {u, v, wt};
    }
    
    int src, dest;
    cout << "Enter the source node: ";
    cin >> src;
    
    cout << "Enter the destination node: ";
    cin >> dest;
    
    int result = bellmanFord(n, m, src, dest, edges);
    
    if(result == -1) {
        cout << "Negative weight cycle detected or no path to destination." << endl;
    } else {
        cout << "Shortest distance from " << src << " to " << dest << " is: " << result << endl;
    }

    return 0;
}
