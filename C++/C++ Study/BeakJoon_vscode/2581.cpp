/*
백준 2581번 소수

자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.

예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.

풀이

최소값을 -1로 초기화 해두면 최초 실행결과가 최소값으로 설정할 수 있다.

*/

#include<iostream>
using namespace std;

int main()
{
    int n,m;
    int sum = 0,cnt = 0;
    int min = -1;
    cin >> m >> n;

    for(int i = m;i <= n;i++)
    {
        for(int j = 1;j <= i;j++)
        {
            if(i%j == 0)
                cnt++;
        }
        if(cnt == 2)
        {   
            if(min == -1)
                min = i;
            sum += i;
        }
        cnt = 0;
    }
    if(min == -1)
    {
        cout << min << endl;
    }
    else
    {
        cout << sum << "\n" << min << endl;
    }
    return 0;
}