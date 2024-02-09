/*
백준 10951번 A+B

반복문에서의 연산 실행중 탈출 조건 생성하기

3가지 방법으로 탈출하는방법을 공부

1. 조건문
#include<iostream>
using namespace std;

int main()
{
    int n,m;
    while(true)
    {
        cin >> n >> m;
        
        if(n == 0 && m == 0)
            return 0;
        cout << n + m << endl;
        
    }
    
    return 0;
}

2. eof End of File 함수를 사용
#include<iostream>
using namespace std;

int main()
{
    int n,m;
    while(true)
    {
        cin >> n >> m;
        if(cin.eof()) break;
        cout << n + m << endl;
    }
    return 0;
}

3. 반복문에 false 반환

#include<iostream>
using namespace std;

int main()
{
    int n,m;
    while(cin >> n >> m)
    {
        cout << n + m << endl;
    }
    return 0;
}
*/
