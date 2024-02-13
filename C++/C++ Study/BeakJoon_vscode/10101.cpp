/*
백준 10101번 삼각형 외우기

삼각형의 세 각을 입력받은 다음, 

세 각의 크기가 모두 60이면, Equilateral
세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
세 각의 합이 180이 아닌 경우에는 Error
를 출력하는 프로그램을 작성하시오.


*/

#include<iostream>
using namespace std;

int main()
{
    int n,m,k;

    cin >> n >> m >> k;

    if(n == 60 && m == 60 && k == 60)
        cout << "Equilateral" << endl;
    else if(n + m + k == 180)
    {
        if(n == m || m == k || n == k)
            cout << "Isosceles" << endl;
        else
            cout << "Scalene" << endl;
    }
    else
        cout<< "Error" << endl;

    return 0;
}