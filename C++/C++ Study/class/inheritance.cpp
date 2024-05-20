#include<iostream>
using namespace std;

class Vehicle
{
public:
    string brand;
    void honk()
    {
        cout << "Beep beep!" << endl;
    }
};

class Car: public Vehicle
{
public:
    string model;
    int year;

    void displayInfo()
    {
        cout << "Brand: " << brand << ", Model: " << model << ", Year" << year << endl;
    }
};

int main()
{
    Car car;
    car.brand = "toyota";
    car.model = "Camry";
    car.year = 2020;
    car.honk();
    car.displayInfo();

    return 0;
}