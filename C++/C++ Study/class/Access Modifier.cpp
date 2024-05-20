#include<iostream>
using namespace std;

class Person
{
// 선언된 클래스 맴버변수는 외부에 공개되지 않으며 외부에서 직접 접근할 수없다.
// public함수를 통해서만 접근할수 있음
private:
    string name;
// 파생 클래스에 대해서는 public 멤버처럼 취급되며, 외부에서는 private 멤버처럼 취급됩니다.
protected:
    int age;
public:
    void setName(string n)
    {
        name = n;
    }

    string getName()
    {
        return name;
    }

    void setAge(int a)
    {
        age = a;
    }

    int getAge()
    {
        return age;
    }
    
    void printing()
    {
        cout << "name : " << name << ", Age :" << age << endl;
    }
};

int main()
{
    Person p1;

    p1.setName("홍길동");
    p1.setAge(21);
    ///p1.age = 22;

    p1.printing();    
}
