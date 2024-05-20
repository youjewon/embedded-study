#include<iostream>
using namespace std;

// 클래스 기본 구조는
class ClassName{
public:
    // 맴버변수
    int memberVariable;
    // 맴버함수
    void memberFunction()
    {

    }
};

// ex 자동차 함수 생성
class Car
{
public:
    string brand;
    string model;
    int year;

    void displayInfo()
    {
        cout << "Brand :" << brand << ",Model :" << model << ", Year :" << year << endl;
    }
};

int main()
{
    Car car1;
    car1.brand = "Toyota";
    car1.model = "Corolla";
    car1.year = 2020;

    car1.displayInfo();

    return 0;
}