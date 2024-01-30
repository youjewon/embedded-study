/*
백준 1152번 문제 단어의 개수

영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 
이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.

풀이 
문자열을 저장후 ' '(공백)을 기준으로 단어의 개수를 카운트 하는 방식

*/

#include<iostream>
#include<string>
using namespace std;

int main()
{
	string str;
	int count = 1;

	getline(cin, str);

	for (int i = 0;i<str.length();i++)
	{
		if (str[i] == ' ')
		{
			count++;
		}
	}
	if(str[0] == ' ') 
		count--;
	if (str[str.length() - 1] == ' ')
		count--;
	cout << count << endl;
	return 0;
}