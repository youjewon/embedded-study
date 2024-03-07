#include<iostream>
using namespace std;

int min(int x, int y)
{
    if(x < y)
        return x;
    return y;
}
int max(int x,int y)
{
    if(x > y)
        return x;
    return y;
}
// max(), min 함수를 메크로 형태로도 만들수 있음
#define max(x,y) ((x)>(y) ? (x):(y))
#define min(x,y) ((x)<(y) ? (x):(y))

// 배열의 최대값을 구하는 함수
int max_arr(int arr[], int arr_len)
{
    int maxa, i;

    maxa = arr[0];
    for(i = 1; i < arr_len; i++)
        if(arr[i] > maxa)
            maxa = arr[i];

    return maxa;
}

int max_arr2(int arr[],int arr_len)
{
    if(arr_len == 1)
        return arr[0];
    else
        return max(arr[arr_len - 1], max_arr2(arr,arr_len-1));
}


