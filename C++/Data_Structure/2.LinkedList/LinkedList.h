#include<iostream>
using namespace std;

// 연결 리스트 생성 struct 구현
struct Node{    // 구조체 선언과 이름 Node 사용
    int data;
    Node* nextNode;
};

// class 생성
class LinkedList{

private:
    Node* head;
    Node* tail;
public:
    LinkedList()
    {
        head = NULL;    // LinkedList 시작주소
        tail = NULL;    // LinkedList 다음원소의 주소
    }
    // 첫번째 node에 추가
    void addFrontNode(int n);
    // 마지막 node에 추가
    void addNode(int n);
    // node 삽입
    void insertNode(Node* prevNode, int n);
    // node 삭제
    void deleteNode(Node* prevNode);
    // 첫번째 node 가져오기
    Node* getHead(){
        return head;
    }
    // LinkedList 출력
    void display(Node* head);
};

// 구현
void LinkedList::addFrontNode(int n)
{
    // 임시공간에 새 노드 생성
    Node* temp = new Node;
    // temp의 데이터는 n
    temp -> data = n;

    // LinkedList가 비어있다면
    if(head == NULL)
    {
        head = temp;
        tail = temp;
    }
    // LinkedList에 값이 있다면
    else{
        temp -> nextNode = head;
        head = temp;
    }
}

void LinkedList::addNode(int n)
{
    Node* temp = new Node;
    temp -> data = n;
    temp -> nextNode = NULL;

    if(head == NULL)
    {
        head = temp;
        tail = temp;
    }
    else{
        // 현재 마지막 node의 nextnode는 temp
        tail -> nextNode = temp;
        // 마지막 node는 temp
        tail = temp;
    }
}

void LinkedList::insertNode(Node* prevNode,int n)
{
    Node* temp = new Node;
    temp -> data = n;
    // temp의 nextNode에 삽입 할 앞 node의 nextNode를 저장
    temp -> nextNode = prevNode -> nextNode;
    // 삽입 할 앞 node에 temp 저장
    prevNode -> nextNode = temp;
}

void LinkedList::deleteNode(Node* prevNode)
{
    // temp 에 삭제 할 이전 node의 nextNode를 저장
    Node* temp = prevNode -> nextNode;
    // 이전 node의 nextNode를 삭제 할 node의 nextNode로 저장
    prevNode -> nextNode = temp -> nextNode;
    delete temp;
}

void LinkedList::display(Node* head)
{
    if(head == NULL)
        cout << "비었습니다.\n";
    else{
        cout << head->data << endl;
        display(head->nextNode);
    }
    cout << endl;
}