/*
동일한 함수를 특정 조건에 만족할때까지 계속 호출하는 것
재귀를 그만둘 탈출조건이 필요
탈출조건이 없으면 계속 수행하므로 스택오버플로우 발생

사용예시
팩토리얼값 구하기, 피보나치 수열, 유클리드 호제법... 등이있음
*/


#include <iostream>
using namespace std;

// ex) 30! 3*2*1 

int Factorial(int n)
{
	if (n <= 1) // 탈출 조건.
		return 1;

	return n * Factorial(n - 1); // 재귀 수행.
}

int main()
{
	cout << Factorial(3) << endl; // 3 팩토리얼(3!) 값 출력.
    cout << Factorial(3) << endl; // 5 팩토리얼(5!) 값 출력.

	return 0;
}