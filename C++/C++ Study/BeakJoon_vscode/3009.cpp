/*
백준 3009번 네 번째 점

세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.


*/

#include<iostream>
using namespace std;

int main()
{
    int x1,x2,x3,y1,y2,y3;
    int findX,findY;

    cin >> x1 >> y1;
    cin >> x2 >> y2;
    cin >> x3 >> y3;
    
    // 다른 두 좌표의 x값이 같은경우 찾아야할 x는 탐색한 x
    // 다른 두 좌표의 값이 다른경우 찾아야할 y는 탐색한 수와 같지 않은 수
    if(x1 == x2)
    {
        findX = x3;
    }
    else if(x1 != x2)
    {
        if(x2 == x3)
        {
            findX = x1;
        }
        else
        {
            findX = x2;
        }
    }
    if(y1 == y2)
    {
        findY = y3;
    }
    else if(y1 != y2)
    {
        if(y2 == y3)
        {
            findY = y1;
        }
        else
        {
            findY = y2;
        }
    }

    cout << findX << " " << findY << endl;

    return 0;
}