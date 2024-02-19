#include<iostream>
using namespace std;

// Node생성 node는 데이터와 다음 주소의 값을 가짐
struct Node{
    int data;
    Node* link;
};

// 단순연결 리스트 클래스 생성
class SinglyLinkedList{
// head 와 tail을 Node 포인터로 선언
private:
    Node* head;
    Node* tail;

// 리스트 생성자는 head와 tail을 가짐
public:
    SinglyLinkedList(){
        head = NULL;
        tail = NULL;
    }
    // 각 함수는 추가, 맨앞 추가, 삽입, 삭제, 출력 기능
    void addNode(int n);
    void addFrontNode(int n);
    void insertNode(Node* prevNode,int n);
    void deleteNode(Node* prevNode);
    Node* getHead(){
        return head;
    }
    void display(Node* head);
};

// Node 추가 함수 
void SinglyLinkedList::addNode(int n){
    // Node 포인터 형태의 temp에 임시 Node생성
    Node* temp = new Node;
    // temp Node에 data 부분에 입력값 n을 저장
    temp->data = n;
    // temp Node에 link 부분에 NULL 값 저장(리스트의 맨뒤로 추가 되기때문에 link값은 NULL)
    temp->link = NULL;
    // 조건 (리스트가 비어있을때) 최초의 값으로 설정
    if(head == NULL){
        head = temp;
        tail = temp;
    }
    // 조건 (리스트의 값이 있을때) 현재 Node의 tail의 link를 새로들어온 temp를 가르킴 & temp를 tail로 지정
    else{
        tail -> link = temp;
        tail = temp;
    }
}

// head Node 추가 함수
void SinglyLinkedList::addFrontNode(int n){
    // Node 생성
    Node* temp = new Node;
    // temp Node에 data 부분에 입력값 n을 저장 
    temp -> data = n;
    // 조건 (리스트가 비어있을때) 최초의 값으로 설정
    if(head == NULL){
        head = temp;
        tail = temp;
    }
    // 조건 (리스트의 값이 있을때) 
    else{
        temp ->link = head;
        head = temp;
    }
}
// Node 삽입 함수
void SinglyLinkedList::insertNode(Node* prevNode,int n){
    // Node 생성
    // (c형태) Node * new_node = (Node*)malloc(sizeof(Node));
    Node* temp = new Node;
    // temp Node에 data 부분에 입력값 n을 저장 
    temp -> data = n;
    // temp Node에 link를 
    temp -> link = prevNode -> link;
    prevNode ->link = temp;
}
// Node 삭제 함수
void SinglyLinkedList::deleteNode(Node* prevNode){
    // 조건 (리스트가 비어있을때) 문구 출력
    if(head == NULL)
    {
        cout << "비어있습니다.";
    }
    // temp Node에 PrevNode의 link를 저장
    Node*  temp = prevNode->link;

    prevNode -> link = temp -> link;
    delete temp;
}
// Node 출력 함수
void SinglyLinkedList::display(Node* head)
{
    // 조건 (리스트가 비어있을때) 문구 출력
    if(head == NULL)
        cout << "비었습니다.\n";
    // 조건 (리스트에 값이 있으면) head부터 데이터 출력
    else{
        cout << head->data << endl;
        display(head->link);
    }
    cout << endl;
}

int main(){
    // Node 생성자
    SinglyLinkedList n;

    n.addNode(1);
    n.addNode(2);
    n.addFrontNode(3);
    n.display(n.getHead());
    n.insertNode(n.getHead()->link->link,4);
    n.display(n.getHead());
    n.deleteNode(n.getHead()->link);
    n.display(n.getHead());


    return 0;
}