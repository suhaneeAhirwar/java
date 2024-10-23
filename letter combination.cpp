#include<iostream>
#include<vector>
using namespace std;

void letterCombination(string digits, string output, int index, vector<string>& ans, string mapping[]) {
    // Base case
    if(index >= digits.length()) {
        ans.push_back(output);
        return;
    }
    
    int number = digits[index] - '0';  // Convert char to int
    string value = mapping[number];
    
    for(int i = 0; i < value.length(); i++) {
        output.push_back(value[i]);
        letterCombination(digits, output, index + 1, ans, mapping);
        output.pop_back(); // Backtrack
    }
}

vector<string> letterCombinations(string digits) {
    vector<string> ans;
    if(digits.empty()) return ans;
    
    string output = "";
    int index = 0;
    
    string mapping[10] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
     letterCombination(digits, output, index, ans, mapping);
    return ans;
}

int main() {
    int n;
    cin >> n;
    vector<string> digits(n);
    
    for(int i = 0; i < n; i++) {
        cin >> digits[i];
    }
    
    for (string digit : digits) {
        vector<string> combinations = letterCombinations(digit);
        
        for(string combination : combinations) {
            cout << combination << " ";
        }
        cout << endl;
    }
    
    return 0;
}
