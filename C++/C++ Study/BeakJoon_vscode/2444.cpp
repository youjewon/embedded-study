/*
백준 2444번 문제 별찍기 7


예제 출력 1 
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
    
풀이 
첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

*/

#include<iostream>
using namespace std;

int main()
{
    int n;
    cin >> n;

    for(int i = 1; i <= n;i++)
    {
        for(int j = n-i;j > 0;j--)
        {
            cout << " ";
        }
        for(int k = 2*i-1;k > 0;k--)
        {
            cout << "*";
        }
        cout << endl;
    }
    for(int i = 1;i < n;i++)
    {
        for(int j = 0;j < i;j++)
        {
            cout << " ";
        }
        for(int k = 2*(n-i)-1;k > 0;k--)
        {
            cout << "*";
        }
        cout << endl;
    }

    return 0;
}