// 배열의 끝번호까지 저장하고나서 다시 배열의 앞쪽부터 번호를 저장하면 된다

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
    tail = (tail + 1) % QUEUE_CAPACITY;
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
    head = (head + 1) % QUEUE_CAPACITY;
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