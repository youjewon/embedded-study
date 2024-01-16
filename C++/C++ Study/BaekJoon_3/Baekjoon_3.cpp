#include<iostream>
using namespace std;

int SameDice(int, int, int);
int BigNum(int, int, int);

int main()
{
	int dice_1, dice_2, dice_3, reward;
	cin >> dice_1 >> dice_2 >> dice_3;

	if ((dice_1 == dice_2) && (dice_1 == dice_3))
	{
		reward = 10000 + (dice_1 * 1000);
	}
	else if((dice_1 == dice_2) || (dice_2 == dice_3) || (dice_1 == dice_3))
	{
		reward = 1000 + (SameDice(dice_1,dice_2,dice_3) * 100);
	}
	else
	{
		reward = BigNum(dice_1,dice_2,dice_3) * 100;
	}

	cout << "상금은 : " << reward << "원 입니다." << endl;

}

int SameDice(int a, int b, int c)
{
	if (a == b)
	{
		return a;
	}
	else if (b == c)
	{
		return b;
	}
	else
	{
		return c;
	}
}

int BigNum(int a, int b, int c)
{
	if (a > b)
	{
		if (a >= c)
		{
			return a;
		}
		else
		{
			return c;
		}
	}
	else if(a < b)
	{
		if (b > c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
	
}