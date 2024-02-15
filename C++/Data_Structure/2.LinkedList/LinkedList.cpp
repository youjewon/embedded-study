// 자료구조 선형구조 Linked List 코드 구현

//구현 방법  1. 포인터를 이요한 방법
// 원소값을 저장하는 공간과 다음 원소를 가리키는 위치 정보를 저장하는 공간을 같이 구현하는 방법이다.


#include<iostream>
#include"LinkedList.h"
using namespace std;

int main()
{
    LinkedList n;
    n.display(n.getHead());
    n.addNode(1);
    n.addNode(2);
    n.addNode(3);

    n.display(n.getHead());
}