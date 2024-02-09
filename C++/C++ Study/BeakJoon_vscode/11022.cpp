#include<iostream>
using namespace std;

int main()
{
    int c,n,m;
    
    cin >> c;
    for(int i = 0;i < c;i++)
    {
        cin >> n >> m;
        cout << "Case #" << i + 1 << ":" << n << '+' << m << '=' << n + m << endl;
    }
}