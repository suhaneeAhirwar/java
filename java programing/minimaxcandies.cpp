#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
vector<int>candystore(int candies[],int n,int k){
     sort(candies, candies+n);
     int mini=0;
     int buy=0;
     int free=n-1;
     while (buy<=free)
     {
        /* code */
        mini=mini+candies[buy];
        buy++;
        free =free-k;

     }
     int maxi=0;
     buy=n-1;
     free=0;
     while (free<=buy)
     {
        /* code */
        maxi=maxi+candies[buy];
        buy--;
        free=free+k;
     }
     vector<int >ans;
     ans.push_back(mini);
     ans.push_back(maxi);
     return ans;
     
     
}
int main() {
    int candies[] = {1, 3, 2, 4, 5}; // Sample candy prices
    int n = sizeof(candies) / sizeof(candies[0]);
    int k = 2; // You get 2 candies for free when buying one
    
    vector<int> result = candystore(candies, n, k);
    
    cout << "Minimum cost: " << result[0] << endl;
    cout << "Maximum cost: " << result[1] << endl;

    return 0;
}