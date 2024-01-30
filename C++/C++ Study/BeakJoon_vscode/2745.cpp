/*
백준 2745번 문제 진법 변환

B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.

10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.

A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35

풀이 




header cmath
ceil(x) 정수 올림
floor(x) 정수 내림
abs(x) 절대값
min(x,y) x,y중 최소값 
max(x,y) x,y중 최대값

pow(a,b) a의 b제곱
sqrt(x) x의 제곱근(루트value)
log(x) x의 자연로그 값 반환
log10(x) x의 사용로드 값 반환

sin(radians) 라디안 값의 사인값 반환
cos(radians) 라디안 값의 코사인값 반환
tan(radians) 라디안 값의 탄젠트값 반환
asin(a) 입력된 사인값의 라디안값 반환
acos(a) 입력된 코사인값의 라디안값 반환
atan(a) 입력된 탄젠트값의 라디안값 반환
*/

#include<iostream>
#include<cmath>
using namespace std;

int main()
{
    string B;
    int n;
    cin >> B >> n;

    int sum(0);
    for(int i = 0; i < B.length();i++)
    {
        int tmp = B[B.length() - (i + 1)];
        if(tmp >= '0' && tmp <= '9')
        {
            tmp = tmp - '0';
        }
        else{
            tmp = tmp + 10 - 'A';
        }
        sum += (tmp * (int)pow(n,i));
    }
    cout << sum << endl;
}


// 방식 2
// int main()
// {
//     string B;
//     int n;
//     cin >> B >> n;

//     int result = 0;

//     for(int i = 0;i < B.length() -1;i++)
//     {
//         char ch = B[B.length() - 1 -i];    // 배열의 각 행의 값을 ch 저장하는 방식

//         if('0' <= ch && ch <= '9')
//         {
//             result += (ch - '0') * pow(n,i);
//         }
//         else
//         {
//             result += (ch - 'A' + 10) * pow(n,i);
//         }
//     }
//     cout << result;
// }