#include <iostream>
#include <stack>
#include <cctype>  // for isdigit function

using namespace std;

// Function to evaluate a postfix expression
int evaluatePostfix(string exp) {
    stack<int> stack;

    // Traverse the expression
    for (int i = 0; i < exp.length(); i++) {
        char c = exp[i];

        // If the character is a digit, push it to the stack
        if (isdigit(c)) {
            stack.push(c - '0');  // Convert char to int
        } else {
            // Otherwise, pop two elements from the stack and apply the operator
            int val2 = stack.top(); stack.pop();
            int val1 = stack.top(); stack.pop();

            switch (c) {
                case '+':
                    stack.push(val1 + val2);
                    break;
                case '-':
                    stack.push(val1 - val2);
                    break;
                case '*':
                    stack.push(val1 * val2);
                    break;
                case '/':
                    stack.push(val1 / val2);
                    break;
            }
        }
    }

    // The final result will be at the top of the stack
    return stack.top();
}

int main() {
    string exp = "231*+9-";  // Example postfix expression
    cout << "Postfix Evaluation: " << evaluatePostfix(exp) << endl;
    return 0;
}
