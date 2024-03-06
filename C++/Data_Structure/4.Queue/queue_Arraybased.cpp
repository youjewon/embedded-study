/*
큐는 선입선출 형태의 자료구조이다.

큐에서 자료의 삽입은 큐의 back에서만 허용되며 삭제는 큐의 front 에서만 허용된다.

enqueue : 큐의 맨 뒤에 삽입
dequeue : 큐의 맨 앞에 삭제

대표적인 예시로
IO Buffers
Job scheduling.
In shared resource management
*/
#include <iostream>

using namespace std;

// queue 배열 생성 , n : capacity, front : 앞, rear: 뒤 를 표시하는 변수
int queue[100], n = 100, front = -1, rear = -1;

// 삽입 함수 enqueue
void Insert() {
   int val;
   // 조건 queue가 가득 차있다면
   if (rear == n-1) cout<<"Queue Overflow" << endl;
   else 
   {
      // 조건 가득차있지 않을때 처음 입력시 front를 초기화 이후 값을 삽입
      if (front == -1) front = 0;
      cout << "Insert the element in queue : ";
      cin >> val;
      rear++;
      queue[rear] = val;
   }
}
// 삭제 함수 dequeue
void Delete() {
   // 조건 값이 없을때
   if (front == -1 || front > rear) {
      cout<<"Queue Underflow " << endl;
      return ;
   }
   // 조건 queue에 값이 있고 
   else 
   {
      cout << "Element deleted from queue is : " << queue[front] <<endl;
      front++;
   }
}
// 출력 함수
void Display() {
	if (front == -1) cout<<"Queue is empty" << endl;
	else {
		cout<<"Queue elements are : ";
		for (int i = front; i <= rear; i++) cout<<queue[i] << " ";
		cout<<endl;
	}
}
int main() {
   int ch;
   cout<<"1) Insert element to queue"<<endl;
   cout<<"2) Delete element from queue"<<endl;
   cout<<"3) Display all the elements of queue"<<endl;
   cout<<"4) Exit"<<endl;
   do {
      cout<<"Enter your choice : "<<endl;
      cin>>ch;
      switch (ch) {
         case 1: Insert();
         	break;
         case 2: Delete();
         	break;
         case 3: Display();
         	break;
         case 4: cout<<"Exit"<<endl;
         	break;
         default: cout<<"Invalid choice"<<endl;
      }
   } while(ch!=4);
   return 0;
}