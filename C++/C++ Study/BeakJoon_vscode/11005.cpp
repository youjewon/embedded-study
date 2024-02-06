

/*
백준 11005문제 진법 변환 2

10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.
10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
A: 10, B: 11, …, F: 15, …, Y: 34, Z: 35

풀이


algorithm 라이브러 사용
https://learn.microsoft.com/ko-kr/cpp/standard-library/algorithm?view=msvc-170

*/
#include<iostream>
#include<algorithm>
using namespace std;


int main()
{
    int n,b;
    cin >> n >> b;

    string B;
    while(n != 0)
    {
        int tmp = n % b;
        if(tmp > 9)
        {
            tmp = tmp - 10 + 'A';
            B += tmp;
        }
        else{
            B += ('0' + tmp);
        }
        n /= b;
    }
    reverse(B.begin(),B.end());
    cout << B << endl;

}