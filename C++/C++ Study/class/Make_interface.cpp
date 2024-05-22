#include<iostream>
using namespace std;

// c++인터페이스 구현 예제


// // 기본 카메라만 있는 경우 문제없이 출력함
// class Camera{
// public:
//     void take()
//     {
//         cout << "take picture" << endl;
//     }
// };

// class Person {
// public:
//     void useCamera(Camera* p) { p->take(); }
// };

// int main()
// {
//     Person p;
//     Camera c1;
//     p.useCamera(&c1);
// }


// HD카메라가 추가되었을때 기존에 있던 코드가 수정되었다.
// OCP법칙을 원칙을 지키지 못함
// class Camera{
// public:
//     void take()
//     {
//         cout << "take picture" << endl;
//     }
// };
// class HDCamera{
// public:
//     void take()
//     {
//         cout << "take picture HD" << endl;
//     }
// };

// class Person {
// public:
//     void useCamera(Camera* p) { p->take(); }
//     void useCamera(HDCamera* p) { p->take(); }
// };

// int main()
// {
//     Person p;
//     Camera c1;
//     p.useCamera(&c1);

//     HDCamera c2;
//     p.useCamera(&c2);
// }


// 이를 해결하는 방법
// ICamera 인터페이스를 파생되어 코드를 사용하게끔 만들기
class ICamera{
public:
    virtual void take() = 0;
};

class Person {
public:
    void useCamera(ICamera* p) { p->take(); }
};
class Camera : public ICamera{
public:
    void take()
    {
        cout << "take picture" << endl;
    }
};
class HDCamera : public ICamera{
public:
    void take()
    {
        cout << "take picture HD" << endl;
    }
};
int main()
{
    Person p;
    Camera c1;
    p.useCamera(&c1);

    HDCamera c2;
    p.useCamera(&c2);
}
