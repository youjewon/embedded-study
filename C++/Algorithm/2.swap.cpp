#include<iostream>
using namespace std;

void wrong_swap(int a, int b)
{
    int temp;
    
    temp = a;
    a = b;
    b = temp;
}
// 위 함수는 인자로 변수의 값을 전달받아서 자신의 ab 변수에 저장한다. 이값은 내부 함수의 값이기때문에 xy는 바뀌지 않는다.

void swap(int *a,int *b)
{
    int temp;

    temp = *a;
    *a = *b;
    *b = temp;
}

// 배열의 두 원소 바꾸기

void swap_arr(int arr[],int i , int j)
{
    int temp;

    temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
