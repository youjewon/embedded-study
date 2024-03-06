#include<iostream>
#include<array>
using namespace std;



template <size_t N>
void print(const array<int, N>& arr);

int main()
{
    array<int,5> arr = {1,2,3,4,5};
    for(auto it = arr.begin(); it != arr.end();it++)
    {
        auto element = (*it);
        cout << element << " ";
    }
    cout << endl;
    
    cout << arr.front() << endl;
    cout << arr.back() << endl;
    cout << *(arr.data() + 1) << endl;
}
