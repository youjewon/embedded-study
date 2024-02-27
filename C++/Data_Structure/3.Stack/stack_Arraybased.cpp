/*
스택은 후입선출 방식의 자료구조이다.
스택에서 삽입 삭제는 맨위에서 단두개 push pop 만 허용된다.

push : 스택 탑에 삽입
pop : 스택 탑에 삭제

대표적인 사용 예시
문자열 역순 구하기
 주어진 문자열의 캐릭터를 하나씩 순서대로 push후 pop

text editor에서 undo 기능
 모든 변화를 스택에 push해서 추적


특징 
스택의 사이즈는 1보다 크거나 같다.
top 스택의 맨위 요소를 가르킨다.
capacity 스택의 사이즈를 가르킨다.
top은 -1부터 capacity -1 까지의 값을 취할 수 있다.
 if top == -1 : 비어있음
 top == capacity -1 : 가득참
*/

#include<iostream>
using namespace std;

int stack[100], n = 100,top = -1;

// 삽입 함수
void push(int val)
{      
    // 조건 n : capacity로 스택이 가득 차있다면을 의미함
    if(top >= n-1) cout << "Stack Overflow" << endl;
    else
    {
        top++;
        stack[top] = val;
    }
    // 그렇지 않으면 top을 증가시키고 그 자리에 입력받은 값을 삽입함
}
// 삭제 함수
void pop()
{
    // 조건 스택이 비어있다는 의미
    if(top <= -1) cout << "Stack Underflow" << endl;
    else
    {
        cout << "The popped element is " << stack[top] << endl;
        top--;
    }
    // 스택에 값이 있다면 가장위의 값 top을 출력하고 스택의 top을 1개 감소시킴
}
// 출력 함수
void display()
{
    // 조건 스택에 값이 있을때 스택의 위에서부터 처음 값까지 출력
    if(top >= 0) 
    {
        cout << "Stack elements are :";
        for(int i = top; i>=0;i--) cout << stack[i] << " ";
        cout << endl;
    }
    else cout << "Stack is empty" << endl;
}
int main()
{
    int ch, val;
    cout << "1) Push in stack" << endl;
    cout << "2) Pop from stack" << endl;
    cout << "3) Display stack" << endl;
    cout << "4) Exit" << endl;

    do 
    {
        cout << "Enter choice : ";
        cin >> ch;
        switch(ch)
        {
            case 1: 
            {
                cout << "Enter value to be pushed : ";
                cin >> val;
                push(val);
                break;
            }
            case 2:
            {
                pop();
                break;
            }
            case 3:
            {
                display();
                break;
            }
            case 4:
            {
                cout << "Exit" << endl;
                break;
            }
            default :
            {
                cout << "Invalid Choice" << endl;
            }
        }
    }while(ch != 4);
    return 0;
}