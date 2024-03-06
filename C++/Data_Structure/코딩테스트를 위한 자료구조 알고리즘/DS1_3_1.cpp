#include<iostream>
#include<array>
using namespace std;

void print(array<int, 5> arr4);

int main()
{
    array<int, 10> arr1;
    arr1[0] = 1;
    cout << "첫 번째 요소" << arr1[0] << endl;

    array<int, 4> arr2 = {1,2,3,4};
    cout << "모든 요소";
    for(int i =0; i< arr2.size();i++)
        cout << arr2[i] << " "; 
    cout << endl;

    // at() 함수 인자로 전달된 index값이 유효하지 않으면 예외를 발생함
    // [] 연산자보다는 조금 느리지만 사용하면 예외처리로 사용할수 있다.

    array<int, 4> arr3 = {1,2,3,4,5};
    try
    {
        cout << arr3.at(3) << endl;
        cout << arr3.at(4) << endl;
    }
    catch (const out_of_range& ex)
    {
        cerr << ex.what() << endl;
    }

    array<int, 5> arr4  = {1,2,3,4};
    print(arr4);
}

void print(array<int, 5> arr)
{
    for(auto ele : arr)
        cout << ele << ", ";
}