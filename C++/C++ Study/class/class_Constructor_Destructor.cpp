#include<iostream>
using namespace std;

class Car
{
public:
    string brand;
    string model;
    int year;
    // 기본 생성자
    Car()
    {
        brand = "Unknown";
        model = "Unknown";
        year = 0;
    }
    // 매개변수가 있는 생성자
    Car(string b,string m,int y)
    {
        brand = b;
        model = m;
        year = y;
    }
    // 소멸자
    ~Car()
    {
        cout << "Destructor called for" << brand << " " << model << endl;
    }

    void displayInfo()
    {
        cout << "Brand :" << brand << ",Model :" << model << ", Year :" << year << endl;
    }
};

int main()
{
    Car car1;
    car1.displayInfo();

    Car car2("Ford", "Mustang", 2021);
    car2.displayInfo();

    return 0;
}