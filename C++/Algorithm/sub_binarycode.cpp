#include<iostream>
using namespace std;

int main()
{
    int n,i,m,k= 0,c = 0;
    int arr[111000] = {0};
    
    cin >> n; 
    
    do
    {
        m = n%2;
        if(n%2 == 1)
            k++;
        arr[c++] = m;
        n = n/2;
        

    } while (n != 0);
    
    for(i = c-1; i >= 0; i--)
        cout << arr[i];
        
    cout << endl;
    cout << k << endl;
}