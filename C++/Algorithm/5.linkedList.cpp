#include<iostream>
using namespace std;

struct Node{
    int data;
    struct Node *link;
}Node;

typedef struct Node node_t;

node_t *head = NULL, *tail = NULL;

void insert_node(int n)
{
    node_t *newNode = new node_t;
    newNode->data = n;
    newNode->link = NULL;
    if(head == NULL)
    {
        head = newNode;
        tail = newNode;
    }
    else
    {
        tail->link = newNode;
        tail = newNode;
    }
}

int delete_node()
{
    node_t *node;
    int r;

    if(head == NULL)
    {
        cout << "is empty" << endl;
        return -1;
    }
    node = head;
    head = head->link;
    if(head == NULL)
        tail = NULL;
    r = node->data;
    delete node;
    return r;
} 

// 이 프로그램은 몇개까지 대기번호를 받을수 있을까? 메모리 크기만큼??

// 연결리스트를 이용하여 k번째에 삽입 삭제 가능한 dequeue만들어보기