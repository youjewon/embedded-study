/*
백준 1085번 직사각형에서 탈출

한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다. 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.

풀이 

algorithm 라이브러리의 min 함수로 쉽게 풀수 있지만,

임의의 최소값을 설정후  비교하여 최소값을 다시 구하는 방식으로 풀수 있다.

1. x
2. w - x
3. y
4. h - y 

순으로 최소값을 도출함


*/

#include<iostream>
using namespace std;

int main()
{
    int x,y,w,h;
    int min;

    cin >> x >> y >> w >> h;
    
    min = x;

    if(w - x < min)
        min = w - x;
    if(y < min)
        min = y;
    if(h - y < min)
        min = h - y;
    
    cout << min << endl;
    return 0;
}