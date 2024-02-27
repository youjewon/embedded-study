/*
연결리스트 형태의 stack


*/

#include<iostream>
using namespace std;

struct Node{
    int data;
    struct Node* link;
};

struct Node* top = NULL;

void push(int val)
{
    struct Node* newNode = new Node;
    newNode->data = val;
    newNode->link = top;
    top = newNode;
}

void pop()
{
    
    if(top == NULL) cout << "Stack Underflow" << endl;
    else
    {
        struct Node* temp;
        temp = top;
        cout << "The popped element is " << temp->data << endl;
        top = temp->link;
        delete temp;
    }
}
void display()
{
    struct Node* ptr;
    if(top == NULL) cout << "stack is empty";
    else
    {
        ptr = top;
        cout << "Stack element are : ";
        while(ptr != NULL)
        {
            cout << ptr->data << " ";
            ptr = ptr->link;
        }
    }
    cout << endl;
}

int main()
{
    int ch, val;
    cout << "1) Push in stack" << endl;
    cout << "2) Pop from stack" << endl;
    cout << "3) Display stack" << endl;
    cout << "4) Exit" << endl;

    do 
    {
        cout << "Enter choice : ";
        cin >> ch;
        switch(ch)
        {
            case 1: 
            {
                cout << "Enter value to be pushed : ";
                cin >> val;
                push(val);
                break;
            }
            case 2:
            {
                pop();
                break;
            }
            case 3:
            {
                display();
                break;
            }
            case 4:
            {
                cout << "Exit" << endl;
                break;
            }
            default :
            {
                cout << "Invalid Choice" << endl;
            }
        }
    }while(ch != 4);
    return 0;
}