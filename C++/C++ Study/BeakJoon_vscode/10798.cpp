/*



*/

#include<iostream>
using namespace std;

char arr[5][15];

int main()
{
    for(int i = 0;i < 5;i++)
        cin >> arr[i];

    for(int i = 0;i < 15;i++){
        for(int j = 0; j < 5;j++)
        {
            if(arr[j][i] != NULL)
                cout << arr[j][i]; 
        }
    }
    return 0;
}