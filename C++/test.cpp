#include <iostream>
#include <vector>

using namespace std;

class Stack {
private :
    vector<int> num;
    int top = -1;
public :

    void push_stack(int n) {
        num.push_back(n);
        top++;
    }

    int pop_stack() {
        if(top == -1) {
            cout << "Stack is empty" << endl;
            return -1;
        }
        int value = num[top];
        num.pop_back();
        top--;
        return value;
    }

    int check_stack() {
        return num.size();
    }

    int isEmpty() {
        if(top == -1) {
            return 1;
        }
        else {
            return 0;
        }
    }

    void itTop() {
        pop_stack();
    }
};


int main() {
    Stack stack;
    int n;
    cin >> n;

    for(int i = 0; i < n; ++i) {
        int num; 
        cin >> num;
        stack.push_stack(num);
    }

    while (!stack.isEmpty()) {
        cout << stack.pop_stack() << " ";
    }

    return 0;
}