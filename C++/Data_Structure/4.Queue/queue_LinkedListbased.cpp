#include<iostream>
using namespace std;

struct Node{
    int data;
    struct Node* link;
};

struct Node* front = NULL;
struct Node* rear = NULL;
struct Node* temp;

// 삽입 함수
void Insert()
{
    int val;
    cout << "Insert the element in queue : ";
    cin >> val;
    // 값이 없을때 
    if(rear == NULL)
    {
        rear = new Node;
        rear->link = NULL;
        rear->data = val;
        front = rear;
    }
    // 값이 추가할때 temp에 값을 넣고 rear의 다음주소를 temp로 만들고 temp를 rear로 설정
    else
    {
        temp = new Node;
        rear->link = temp;
        temp->data = val;
        temp->link = NULL;
        rear = temp;
    }
}
// 삭제 함수
void Delete()
{
    // fron를 임시저장
    temp = front;
    // Queue가 비었을때
    if(front == NULL)
    {
        cout << "Underflow" << endl;
        return;
    }
    // 값이 있을때
    else
    {
        // 값이 1개가 아닐때 값을 출력후 제거
        if(temp->link != NULL)
        {
            temp = temp->link;
            cout << "Element deleted from queue is : " << front->data << endl;
            delete front;
            front = temp;
        }
        // 값이 1개 일때 출력후 제거하고 초기화
        else
        {
            cout << "Element deleted from queue is : " << front->data << endl;
            delete front;
            front = NULL;
            rear = NULL;
        }
    }
}

// 출력 함수
void Display()
{
    temp = front;
    if((front == NULL) && (rear == NULL))
    {
        cout << "Queue is empty" << endl;
        return;
    }
    cout << "Queue element are : ";
    while(temp != NULL)
    {
        cout << temp->data << " ";
        temp = temp->link;
    }
    cout << endl;
}

int main()
{
    int ch;
    cout << "1) Insert element to queue" << endl;
    cout << "2) Delete element from queue" << endl;
    cout << "3) Display all the elements of queue" << endl;
    cout << "4) Exit" << endl;
    do {
        cout<<"Enter your choice : ";
        cin>>ch;
        switch (ch) {
            case 1: Insert();
                break;
            case 2: Delete();
                break;
            case 3: Display();
                break;
            case 4: cout << "Exit" << endl;
                break;
            default: cout << "Invalid choice" << endl;
        }
    } while(ch!=4);
    return 0;
}