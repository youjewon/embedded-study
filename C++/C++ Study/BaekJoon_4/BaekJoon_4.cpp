#include<iostream>
#include<string>
using namespace std;

int main()
{
	string str;
	int i;

	cin >> str;
	cin >> i;

	cout << str[i-1] << endl;
	cout << str.length() << endl;
}