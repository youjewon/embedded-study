/*
백준 9506번 약수들의 합

어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면, 그 수를 완전수라고 한다.

예를 들어 6은 6 = 1 + 2 + 3 으로 완전수이다.

n이 완전수인지 아닌지 판단해주는 프로그램을 작성하라.
*/

#include<iostream>
using namespace std;

int main()
{
    int n,tmp;

    while(true){
        cin >> n;
        tmp = 0;
        if(n == -1)
            break;
        for(int i = 1;i < n;i++)
        {
            if(n%i == 0)
            {
                tmp += i;
            }
        }
        if(n == tmp)
        {
            cout << n << " = ";
            for(int i = 1;i < n;i++)
            {
                if(n%i == 0)
                {
                    cout << i ;
                    if(i < n/2)
                        cout << " + ";
                    else
                        cout << endl;
                }
            }
        }
        else
            cout << n << " is NOT perfect." << endl;
    }
    return 0;
}