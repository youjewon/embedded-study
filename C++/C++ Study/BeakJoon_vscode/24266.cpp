/*
백준 24266번 알고리즘 수업 - 알고리즘의 수행 시간 5

입력의 크기 n이 주어지면 MenOfPassion 알고리즘 수행 시간을 예제 출력과 같은 방식으로 출력해보자.

MenOfPassion 알고리즘은 다음과 같다.

MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n
        for j <- 1 to n
            for k <- 1 to n
                sum <- sum + A[i] × A[j] × A[k]; # 코드1
    return sum;
}


첫째 줄에 코드1 의 수행 횟수를 출력한다.

둘째 줄에 코드1의 수행 횟수를 다항식으로 나타내었을 때, 최고차항의 차수를 출력한다. 단, 다항식으로 나타낼 수 없거나 최고차항의 차수가 3보다 크면 4를 출력한다.


3중 for문 형태
어떤 n을 넣더라도 코드1은 n^3회 수행 수행시간은 n^3 비례함을 알 수 있다.
시간 복잡도는 O(n^3)이고, 항상 n^3과 3을 개행하여 출력한다.


*int 범위 : -2,147,483,648 ~ 2,147,483,647

*long long 범위 : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
*/

#include<iostream>
using namespace std;

int main()
{
    long long n;
    cin >> n;

    cout << n*n*n << endl <<  "3";

    return 0;
}