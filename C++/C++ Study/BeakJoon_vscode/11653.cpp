/*
백준 11653번 소인수분해

정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.

풀이

for문을 돌며 n % i로 나누어 지면 출력

*/

#include<iostream>
using namespace std;

int main()
{
    int n;

    cin >> n;
    if(n == 1) return 0;

    for(int i = 2;i <= n;i++)
    {
        while(n%i == 0)
        {
            cout << i << endl;
            n /= i;
        }
    }
}
