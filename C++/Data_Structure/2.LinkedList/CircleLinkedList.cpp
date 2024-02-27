// 원형 연결 리스트

#include<iostream>
using namespace std;

struct Node{
    int data;
    struct Node* link;
};
struct HeadNode{
    Node* head;
};

class CircleLinkedList{
    public:
        // 리스트 생성, 헤드노드
        HeadNode* createList(){
            HeadNode* H;
            H = new HeadNode;
            H->head = NULL;
            return H;
        }

        void addFirstNode(HeadNode* H,int n);
        void addMiddleNode(HeadNode* H,int afterthisdata, int data);
        void deleteNode(HeadNode* H,int deldata);
        void printList(HeadNode* L);
};
// 원형 리스트의 처음(앞에) 노드 삽입 함수
void CircleLinkedList::addFirstNode(HeadNode* H,int n){
    Node* prevNode;
    Node* newNode = new Node;
    newNode->data = n;
    newNode->link = NULL;
    // 리스트가 비었을경우
    if(H->head = NULL)
    {
        H->head = newNode;
        newNode->link = newNode;    // 원형 리스트의 특징: 노드가 하나면 다음 노드를 자기자신을 가르킨다.

        return;
    }
    prevNode = H->head;
    // 다시 헤드를 향하는 마지막 노드 전까지 반복
    while(prevNode->link != H->head) prevNode = prevNode->link;
    // 맨 마지막노드가 가르키는 노드를 새 노드를 가르키게함 (맨앞 노드 자리 뻇기)
    newNode->link = prevNode->link;
    // 맨마지막 노드가 새 노드를 가르키게(원형)
    prevNode->link = newNode;
    // 헤드도 첫 노드로 새노드를 가르키게 함
    H->head = newNode;
}
// 노드 중간에 삽입 함수 afterthisdata : 삽일할 데이터 위치 , n : 입력할 데이터
void CircleLinkedList::addMiddleNode(HeadNode* H,int afterthisdata,int n){
    Node* prevNode;
    prevNode = H->head;
    Node* newNode = new Node;

    while(prevNode->data != afterthisdata)
    {
        prevNode = prevNode->link;
    }
    // 새 노드에 데이터 입력
    newNode->data = n;
    // 삽입 위치 앞 노드가 가르키는 노드를 새 노드가 가르키게함
    newNode->link = prevNode->link;
    // 삽입 위치 앞 노드가 새 노드를 가르키게함
    prevNode->link = newNode;
    return;
}
// 노드 삭제
void CircleLinkedList::deleteNode(HeadNode* H,int deldata)
{
    Node* prevNode;
    Node* delNode;

    prevNode = H->head;
    while(prevNode->link->data != deldata)
    {
        prevNode = prevNode->link;
    }
    if(H->head == NULL) return; // 삭제할 노드가 없을경우
    else
    {   
        delNode = prevNode->link; 
        if(delNode == prevNode) H->head = NULL; // 존재하는 노드가 1개일때
        else
        {
            prevNode->link = delNode->link; // 삭제할 노드가 가르키는 노드를 앞노드가 가르키게 함
            if(delNode == H->head) H->head = delNode->link; // 헤드노드가 삭제될경우 헤드노드를 삭제노드가 가르키는 노드로함
        }
        delete delNode;
    }
    cout << deldata << "의 데이터값을 가지는 노드를 삭제함 " << endl;
    return;
}
// 노드 출력함수
void CircleLinkedList::printList(HeadNode* L)
{
    Node* p;
    Node* temp;

    p = L->head;
    if(p == NULL)
    {
        cout << "연결 리스트가 비었습니다." << endl;
        return;
    }
    else
    {
        temp = L->head;
        cout << p->data;
        p = p-> link;

        while(p != temp)
        {
            cout << " --> ";
            cout << p->data;
            p = p->link;
        }
    }
    cout << endl;
}

int main(){
    CircleLinkedList list;

    HeadNode* L;
    L = list.createList();

    list.addFirstNode(L,10);
    list.printList(L);
}