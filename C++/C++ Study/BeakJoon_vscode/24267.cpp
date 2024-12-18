/*
백준 24267번 알고리즘 수업 - 알고리즘의 수행 시간 6

입력의 크기 n이 주어지면 MenOfPassion 알고리즘 수행 시간을 예제 출력과 같은 방식으로 출력해보자.

MenOfPassion 알고리즘은 다음과 같다.

MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n - 2
        for j <- i + 1 to n - 1
            for k <- j + 1 to n
                sum <- sum + A[i] × A[j] × A[k]; # 코드1
    return sum;
}

첫째 줄에 코드1 의 수행 횟수를 출력한다.

둘째 줄에 코드1의 수행 횟수를 다항식으로 나타내었을 때, 최고차항의 차수를 출력한다. 단, 다항식으로 나타낼 수 없거나 최고차항의 차수가 3보다 크면 4를 출력한다.

시간복잡도와 시그마 합에 대한 이해가 필요한 문제

(이해못함)

*int 범위 : -2,147,483,648 ~ 2,147,483,647

*long long 범위 : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
*/

#include<iostream>
using namespace std;

int main()
{
    long long n;
    cin >> n;

    cout << (n-2)*(n-1)*n /6 << endl <<  "3";

    return 0;
}