#include<iostream>
using namespace std;

void right_rotate(int arr[], int s, int t)
{
    int i, last;

    last = arr[t];
    for(i = t; i > s;i--)
        arr[i] = arr[i-1];
    arr[s] = last;
    
}

void left_rotate(int arr[], int s, int t)
{
    int i, first;

    first = arr[s];
    for(i = s;i < t;i++)
        arr[i] = arr[i+1];
    arr[t] = first;
}

void display(int arr[])
{
    for(int i = 0;i<8;i++)
        cout << arr[i] << " ";
    cout << endl;
}

int main()
{
    int arr[8] = {1,2,3,4,5,6,7,8};

    right_rotate(arr,3,6);
    display(arr);
    left_rotate(arr,3,6);
    display(arr);
}