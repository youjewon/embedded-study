// 이항계수 경우의수 구하는 프로그램
// 기본적인 재귀함수사용으로 연산회수가 매우 많고 중복값에 대한 연산도 모두 진행하기 때문에 결과값 도출에 오래결린다.
// 중복값을 체크해주는 memo를 만들어 사용하면 연산속도를 줄일수 있다.

#include<iostream>
using namespace std;

#define MAXN 200

long long fibo(int n)
{
    if(n == 1 || n == 2)
        return 1;
    else
        return fibo(n-1) + fibo(n-2);
}

long long fibo2(int n)
{
    static long long memo[MAXN];

    if(memo[n] > 0)
        return memo[n];
    if(n == 1 || n == 2)
        return memo[n] = 1;
    else
        return memo[n] = fibo2(n-1) + fibo2(n-2);
}

long long fibo3(int n)
{
    long long i, f_i,f_i_1,t;

    if(n == 1 || n == 2)
        return 1;
    f_i_1 = 1;
    f_i = 1;
    for(i = 3; i <= n;i++)
    {
        t = f_i;
        f_i = f_i_1 + f_i;
        f_i_1 = t;
    }
    return f_i;
}