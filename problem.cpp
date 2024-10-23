#include <iostream>
using namespace std;

void twosum(int arr[], int target, int n) {
    // Check pairs of numbers
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i] + arr[j] == target) {
                cout << "Pair found at indices: " << i << " and " << j << endl;
                return;
            }
        }
    }
    cout << "No pair found." << endl;
}

int main() {
    int n = 4;  // Size of the array
    int arr[4] = {4, 7, 6, 3};  // Array with fixed size
    int target;

    cout << "Enter the target sum: ";
    cin >> target;  // Input the target value

    twosum(arr, target, n);

    return 0;
}
