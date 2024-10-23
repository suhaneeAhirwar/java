#include <iostream>
#include <stack>
using namespace std;

bool isOpening(char c) {
    return c == '(' || c == '{' || c == '[';
}

bool isMatching(char a, char b) {
    return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');
}

bool isParenthesisMatching(string str) {
    stack<char> s;
    
    for (int i = 0; i < str.length(); i++) {
        char cur = str[i];
        
        if (isOpening(cur)) {
            s.push(cur);
        } else {
            if (s.empty()) {
                return false;
            }
            
            if (!isMatching(s.top(), cur)) {
                return false;
            }
            
            s.pop();
        }
    }
    
    return s.empty(); // If stack is empty, all parentheses are balanced
}

int main() {
    string input;
    cout << "Enter a string with parentheses: ";
    cin >> input;

    if (isParenthesisMatching(input)) {
        cout << "Parentheses are balanced.\n";
    } else {
        cout << "Parentheses are NOT balanced.\n";
    }
    
    return 0;
}
