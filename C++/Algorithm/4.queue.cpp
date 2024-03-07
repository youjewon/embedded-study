#include<iostream>
using namespace std;

#define QUEUE_CAPACITY 8

int queue[QUEUE_CAPACITY];
int head = 0;
int tail = -1;
int queue_size = 0;

void enqueue(int n)
{
    if(queue_size == QUEUE_CAPACITY)
    {
        cout << "queue full!" << endl;
        return;
    }
    tail++;
    queue_size++;
    queue[tail] = n;
}

int dequeue()
{
    int r;
    if(queue_size == 0)
    {
        cout << "empty" << endl;
        return 0;
    }
    r = queue[head];
    head++;
    queue_size--;
    return r;
}

int main()
{
    int number, r;

    do{
        cout << "input number : ";
        cin >> number;
        if(number > 0)
        {
            enqueue(number);
        }
        else if(number == 0)
        {
            r = dequeue();
            cout << r << endl;
        }
    } while(number >= 0);
    return 0;
}

/*
자료구조 큐의 형태를 문제없이 실행하지만 dequeue이후 발행하는 메모리 공간문제가 발행한다.
이걸 해결하는 방식이 3.rotate에서 사용한 left_rotate함수로 해결할 순 있지만
매번 dequeue마다 실행하게되면 시간이 오래걸리기 때문에 원형큐로 이를 해결할 수있다.

*/