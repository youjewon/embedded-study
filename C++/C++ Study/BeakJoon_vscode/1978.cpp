/*
백준 1978번 소수 찾기

주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

*/

#include<iostream>
using namespace std;

int main()
{
    int n,cnt = 0;
    int m = 0;
    cin >> n;

    for(int i = 0;i < n; i++)
    {
        int k;
        cin >> k;

        for(int div = 1;div <= k;div++)
        {
            if(k%div == 0)
                cnt++;
        }
        if(cnt == 2)
            m++;
        cnt = 0;
    }
    cout << m << endl;
    
    return 0;
}