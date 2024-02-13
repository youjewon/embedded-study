// 자료구조 선형구조 배열(Array) 코드 구현

#include<iostream>
using namespace std;

int main()
{
    int arr[5]; // 5개의 정수 값을 저장하는 배열 초기화

    for(int i = 0; i < sizeof(arr)/sizeof(int); i++)
    {
        arr[i] = i+1;
    }
    for(int i = 0; i < sizeof(arr)/sizeof(int); i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}