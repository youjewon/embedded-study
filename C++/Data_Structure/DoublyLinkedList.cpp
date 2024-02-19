/*
이중 연결 리스트


*/

#include<iostream>
using namespace std;
// Node생성 node는 데이터와 다음 주소와 이전 주소의 값을 가짐
typedef struct doublyNode{
    int data;
    struct doublyNode* Prev;
    struct doublyNode* Next;
}DNode;
// 이중연결 리스트 클래스 생성
class DoublyLinkedList{
// 리스트 생성자는 head와 tail을 가짐
    private:
        DNode* head;
        DNode* tail;
    public:
        DoublyLinkedList()
        {
            head = NULL;
            tail = NULL;
        }
        // 각 함수는 추가, 맨앞 추가, 삽입, 삭제, 출력 기능
        void insertNodeBack(int n);
        void insertNodeFront(int n);
        void insertNodeMiddle(DNode* H,int n);
        void deleteNode(DNode* H);
        DNode* getHead(){
            return head;
        }
        void display(DNode* head);
};
// 리스트 후방 추가 함수
void DoublyLinkedList::insertNodeBack(int n){
    DNode* temp = new DNode;
    temp -> data = n;
    temp -> Next = NULL;
    if(head == NULL){
        head = temp;
        tail = temp;
    }
    else{
        tail -> Next = temp;
        temp -> Prev = tail;
        tail = temp;
    }
}
// 리스트 전방 추가 함수
void DoublyLinkedList::insertNodeFront(int n) {
    DNode* temp = new DNode;
    temp->data = n;
    if(head == NULL){
        head = temp;
        tail = temp;
    }
    else{
        temp -> Next = head;
        head -> Prev = temp;
        head = temp;
    }
}
// 리스트 중간 삽입 함수
void DoublyLinkedList::insertNodeMiddle(DNode* H,int n){
    DNode* temp = new DNode;
    temp->data = n;
    temp -> Next = H -> Next;
    H -> Next = temp;
    temp -> Next -> Prev = temp;
    temp -> Prev = H;
}
// 리스트 삭제 함수
void DoublyLinkedList::deleteNode(DNode* H){
    H -> Next -> Prev = H -> Prev;
    H -> Prev -> Next = H -> Next;
    delete H;
}
    

// 리스트 내용 출력 함수
void DoublyLinkedList::display(DNode* H)
{
    if(H == NULL){
        cout << "비었습니다." ;
    }
    else{
        cout << H -> data << endl;
        display(H -> Next);
    }
}

int main()
{
    DoublyLinkedList n;
    n.insertNodeBack(1);
    n.insertNodeBack(2);
    n.insertNodeFront(3);
    n.insertNodeMiddle(n.getHead()->Next,4);
    //n.deleteNode(n.getHead()->Next);
    n.insertNodeFront(1);
    n.display(n.getHead());
}