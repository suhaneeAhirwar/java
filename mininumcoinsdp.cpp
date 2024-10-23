#include <iostream>
#include <vector>
#include <algorithm>
#include <climits>
using namespace std;

int minCoins(vector<int>& coins, int V) {
    // dp array to store the minimum coins required for each amount
    vector<int> dp(V + 1, INT_MAX);

    // Base case: 0 coins are needed to make amount 0
    dp[0] = 0;

    // Compute the minimum coins for every amount from 1 to V
    for (int i = 1; i <= V; ++i) {
        for (int coin : coins) {
            if (i >= coin && dp[i - coin] != INT_MAX) {
                dp[i] = min(dp[i], dp[i - coin] + 1);
            }
        }
    }

    // If dp[V] is still INT_MAX, return -1 to indicate it's impossible
    return dp[V] == INT_MAX ? -1 : dp[V];
}

int main() {
    int V;
    cout << "Enter the total amount: ";
    cin >> V;

    int n;
    cout << "Enter the number of coin denominations: ";
    cin >> n;

    vector<int> coins(n);
    cout << "Enter the coin denominations: ";
    for (int i = 0; i < n; ++i) {
        cin >> coins[i];
    }

    int result = minCoins(coins, V);
    if (result != -1) {
        cout << "Minimum number of coins required: " << result << endl;
    } else {
        cout << "It is impossible to make the amount with the given coins." << endl;
    }

    return 0;
}
