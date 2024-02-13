/*
백준 2501번 약수구하기

어떤 자연수 p와 q가 있을 때, 만일 p를 q로 나누었을 때 나머지가 0이면 q는 p의 약수이다. 

6을 예로 들면

6 ÷ 1 = 6 … 0
6 ÷ 2 = 3 … 0
6 ÷ 3 = 2 … 0
6 ÷ 4 = 1 … 2
6 ÷ 5 = 1 … 1
6 ÷ 6 = 1 … 0
그래서 6의 약수는 1, 2, 3, 6, 총 네 개이다.

두 개의 자연수 N과 K가 주어졌을 때, N의 약수들 중 K번째로 작은 수를 출력하는 프로그램을 작성하시오.
*/

#include<iostream>
using namespace std;

int main()
{
    int n,k,tmp,l = 0;
    cin >> n >> k;

    for(int i = 1;i <= n;i++)
    {
        if(n%i == 0)
        {
            tmp=i;
            l++;
            if(k == l)
                break;
            if(l < k)
                tmp = 0;
        }
    }

    cout << tmp << endl;
    return 0;
}