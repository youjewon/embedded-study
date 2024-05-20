#include<iostream>
using namespace std;

// 다양한 타입에 대해 일반화할 수 있다.
template <typename T>
class Box {
private:
    T content;
public:
    void setContent(T c)
    {
        content = c;
    }
    T getContent()
    {
        return content;
    }
};

int main()
{
    Box<int> intBox;
    intBox.setContent(123);
    cout << "Int Box : " << intBox.getContent() << endl;

    Box<string> strBox;
    strBox.setContent("Hello World!");
    cout << "String Box : " << strBox.getContent() << endl;

}