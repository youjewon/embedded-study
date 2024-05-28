/*
프로토타입 패턴
기존 객체를 복제하여 새 객체를 만드는 디자인패턴
객체의 생성비용이 높거나 복잡한 초기 설정을 거쳐야 하는 영우 융용한 패턴
객체를 복제하여 성능을 향상시키고 다양한 초기 상태를 가진 객체를 쉽게 생성할 수있다.

장점: 복잡한 초기설정을 반복하지 않고 객체를 쉽게 복제함,
 새로 생성하는것보다 적은 비용이 들게 함
 다양한 초기 상태를 가진 객체를 쉽게 만들수 있음
*/

#include<iostream>
#include<string>
using namespace std;

// Prototype 인터페이스
// clone 메서드를 선언하여 객체를 복제하는 기능을 정의 print로 출력함
class Document {
public:
    virtual Document* clone() const = 0;
    virtual void print() const = 0;
    virtual ~Document() {}
};

// ConcretePrototype 클래스
// 인터페이스의 구현 객체를 복제하여 새로운 객체로 반환
class Resume : public Document {
private :
    string name;
    string education;
    string experience;

public:
    Resume(const string& name, const string& education, const string& experience)
    : name(name), education(education), experience(experience) {}
    
    Document* clone() const override {
        return new Resume(*this);
    }

    void print() const override {
        cout << "Name : " << name << ", Education : " << education << ", Exprience : " << experience << endl;
    }
};

class Report : public Document {
private:
    string title;
    string content;

public:
    Report(const string& title, const string& content) : title(title), content(content) {}

    Document* clone() const override{
        return new Report(*this);
    }
    
    void print() const override {
        cout << "Report : " << title << ", Content" << content << endl;
    }
};

// 클라이언트 코드
// 원본문서를 생성하고 clone 메서드로 원본을 복제하여 객체를 생성하고 문서출력후 메모리해제
int main()
{
    Resume originalResume("John Doe", "BS in Computer Science", "5 years in software development");
    Report originalReport("Annual Report", "This is the annual report content.");

    cout << "Original Documents: " << endl;
    originalResume.print();
    originalReport.print();
    cout<< "---------------------" << endl;

    Document* cloneResume = originalResume.clone();
    Document* cloneReport = originalReport.clone();

    cout << "cloned Document" << endl;
    cloneResume->print();
    cloneReport->print();
}