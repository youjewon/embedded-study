/*
백준 24263번 알고리즘 수업 - 알고리즘의 수행 시간 2

입력의 크기 n이 주어지면 MenOfPassion 알고리즘 수행 시간을 예제 출력과 같은 방식으로 출력해보자.

MenOfPassion 알고리즘은 다음과 같다.

MenOfPassion(A[], n) {
    sum <- 0;
    for i <- 1 to n
        sum <- sum + A[i]; # 코드1
    return sum;
}

첫째 줄에 코드1 의 수행 횟수를 출력한다.

둘째 줄에 코드1의 수행 횟수를 다항식으로 나타내었을 때, 최고차항의 차수를 출력한다. 단, 다항식으로 나타낼 수 없거나 최고차항의 차수가 3보다 크면 4를 출력한다.


1부터 n까지 반복하므로 n번 수행한다.
따라서 시간복잡도는 O(n)으로 n과 1을 출력한다.

*/

#include<iostream>
using namespace std;


int main()
{
    int n;
    cin >> n;

    cout << n << endl << "1";

    return 0;
}