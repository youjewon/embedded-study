/*
백준 2738번 문제 행렬덧셈

N*M크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하시오.

풀이
arr1, arr2의 배열을 각각 받아 저장하고, 2중 반복문으로 겹치는 배열의 합을 출력

*/

#include<iostream>
using namespace std;

int arr1[101][101],arr2[101][101];

int main()
{
    int n,m;
    cin >> n >> m;

    for(int i = 0; i < n;i++)
        for(int j = 0;j < m;j++)
            cin >> arr1[i][j];
    for(int i =0;i<n;i++)
        for(int j = 0;j < m;j++)
            cin >> arr2[i][j];
    for(int i =0;i<n;i++){
        for(int j = 0;j < m;j++)
            cout << arr1[i][j] + arr2[i][j] << ' ';
        cout << "\n";
    }
    return 0;
}