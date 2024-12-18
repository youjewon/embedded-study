/*
백준 15894번 수학은 체육과목 입니다.

문제

"한 변의 길이가 1인 정사각형을 아래 그림과 같이 겹치지 않게 빈틈없이 계속 붙여 나간다. 가장 아랫부분의 정사각형이 n개가 되었을 때, 실선으로 이루어진 도형의 둘레의 길이를 구하시오."
가장 아랫부분의 정사각형 개수가 주어지면 그에 해당하는 답을 출력하는 프로그램을 만들어 형석이를 도와주자!

풀이 

입력의 제한이 (1 <= n <= 10^9)
이기 때문에 unsigned int 를 사용하야 한다는 문제다.
*/

#include<iostream>
using namespace std;

int main()
{
    unsigned int n;

    cin >> n;

    cout << n*4 << endl;
    return 0;
}

