/*
���� 2444�� ���� ����� 7


���� ��� 1 
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
    
Ǯ�� 
ù° �ٺ��� 2��N-1��° �ٱ��� ���ʴ�� ���� ����Ѵ�.

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