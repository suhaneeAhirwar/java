#include<iostream>
#include<vector>
using namespace std;

void solve (vector<int>& num, vector<int>& output, int index) {
    // Base case
    if (index >= num.size()) {
        // Print the current subset
        for (int i : output) {
            cout << i << " ";
        }
        cout << endl;
        return;
    }

    // Exclude the current element
    subset(num, output, index + 1);

    // Include the current element
    output.push_back(num[index]);
    subset(num, output, index + 1);

    // Backtrack to remove the current element before returning
    output.pop_back();
}

int main() {
    int n;
    cout << "Enter the number of elements in the array: ";
    cin >> n;

    vector<int> num(n);
    cout << "Enter the elements of the array: ";
    for (int i = 0; i < n; i++) {
        cin >> num[i];
    }

    vector<int> output;
    subset(num, output, 0);

    return 0;
}
