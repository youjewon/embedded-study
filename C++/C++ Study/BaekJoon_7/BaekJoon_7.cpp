#include<iostream>
using namespace std;

int* CheckPieces(int*, int, int, int, int, int, int);

int main()
{
	int pieces[6] = {1,1,2,2,2,8};
	int King, Queen, Rooks, Bishops, Knights, Pawns;

	cin >> King >> Queen >> Rooks >> Bishops >> Knights >> Pawns;
	int* result = CheckPieces(pieces, King, Queen, Rooks, Bishops, Knights, Pawns);
	cout << result << endl;

}

int* CheckPieces(int* piece, int k, int q, int r, int b, int n, int p)
{
	
	int have[6] = { k,q,r,b,n,p };
	int result[6];

	for (int i = 0; i < 6; i++)
	{
		result[i] = piece[i] - have[i];
	}


	return result;
}