#include<iostream>
using namespace std;

struct Node{
    int data;
    Node* link;
};
class SinglyLinkedList{

private:
    Node* head;
    Node* tail;
public:
    SinglyLinkedList(){
        head = NULL;
        tail = NULL;
    }
    void addNode(int n);
    void addFrontNode(int n);
    void insertNode(Node* prevNode,int n);
    void deleteNode(Node* prevNode);
    Node* getHead(){
        return head;
    }
    void display(Node* head);
};
void SinglyLinkedList::addNode(int n){
    Node* temp = new Node;
    temp->data = n;
    temp->link = NULL;
    if(head == NULL){
        head = temp;
        tail = temp;
    }
    else{
        tail -> link = temp;
        tail = temp;
    }
}
void SinglyLinkedList::addFrontNode(int n){
    Node* temp = new Node;
    temp -> data = n;
    if(head == NULL){
        head = temp;
        tail = temp;
    }
    else{
        tail ->link = head;
        head = temp;
    }
}
void SinglyLinkedList::insertNode(Node* prevNode,int n){
    Node* temp = new Node;
    temp -> data = n;
    temp -> link = prevNode -> link;
    prevNode ->link = temp;
}
void SinglyLinkedList::deleteNode(Node* prevNode){
    Node*  temp = prevNode->link;
    prevNode -> link = temp -> link;
    delete temp;
}

void SinglyLinkedList::display(Node* head)
{
    if(head == NULL)
        cout << "비었습니다.\n";
    else{
        cout << head->data << endl;
        display(head->link);
    }
    cout << endl;
}

int main(){
    SinglyLinkedList n;

    n.addNode(1);
    n.addNode(2);
    n.addNode(3);
    n.display(n.getHead());
    n.insertNode(n.getHead()->link->link,4);
    n.display(n.getHead());
    n.deleteNode(n.getHead()->link);
    n.display(n.getHead());


    return 0;
}