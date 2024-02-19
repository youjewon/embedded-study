// 원형 연결 리스트

#include<iostream>
using namespace std;

struct Node{
    int data;
    Node* link;
};

class CircleLinkedList{
    private:
        Node* head;
    public:
        CircleLinkedList(){
            head = NULL;
        }
        void addFirstNode(Node* H,int n);
        Node* getHead(){
            return head;
        }
        void display(Node* H);
};

void CircleLinkedList::addFirstNode(Node* H,int n){
    Node* temp = new Node;
    temp -> data = n;

    if(H == NULL){
        H = temp;
        temp -> link = H;
    }
    else{
        temp -> link = H -> link;
        H -> link = temp;
    }
}

void CircleLinkedList::display(Node* H)
{
    if(H == NULL){
        cout << "비었습니다." ;
    }
    else{
        cout << H -> data << endl;
        display(H -> link);
    }
}

int main(){

}