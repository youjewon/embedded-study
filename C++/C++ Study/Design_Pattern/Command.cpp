/*
커맨드 패턴 
업데이트에 새로운 명령이나 서비스요구 항목이 자꾸 추가되어도 걱정 x

소프트웨어 개발 초기에는 이벤트 명령 메뉴등의 연결기능이 별로 없지만 시간이 지나면 
쉽게 추가되어 명령추가에 대한 일반화가 필요함
*/

// 가전 리모콘 예제

#include<iostream>
using namespace std;

// Command 인터페이스
// 명령을 실행하는 excute 메서드를 선언
class Command {
public:
    virtual void excute() = 0;
    virtual ~Command() {};
};

// Receiver 클래스
// Light와 AirConditioner클래스의 실제 작업을 실행하는 메서드제공(on, off)
class Light {
public :
    void on() {
        cout << "Light is on" << endl;
    }
    void off() {
        cout << "Light is off" << endl;
    }
};

class AirConditioner {
public :
    void on() {
        cout << "AirConditioner is on" << endl;
    }
    void off() {
        cout << "AirConditioner is off" << endl;
    }
};

// ConcreteCommand 클래스
// Command인터페이스를 구현하고 각 객체의 메서드를 호출함
class LightOnCommand : public Command {
private:
    Light* light;
public:
    LightOnCommand(Light* light) : light(light) {}
    void excute() override {
        light->on();
    }
};

class LightOffCommand : public Command {
private :
    Light* light;
public : 
    LightOffCommand(Light* light) : light(light) {}
    void excute() override {
        light->off();
    }
};

class AirConditionerOnCommand : public Command {
private:
    AirConditioner* airconditioner;
public:
    AirConditionerOnCommand(AirConditioner* airconditioner) : airconditioner(airconditioner) {}
    void excute() {
        airconditioner->on();
    }
};

class AirConditionerOffCommand : public Command {
private:
    AirConditioner* airconditioner;
public:
    AirConditionerOffCommand(AirConditioner* airconditioner) : airconditioner(airconditioner) {}
    void excute() {
        airconditioner->off();
    }
};

// Invoker 클래스
// Command 객체를 보우하고, 버튼을 눌러서 명령을 실행함
class RemoteControl {
private :
    Command* onCommand;
    Command* offCommand;
public:
    void setOnCommand(Command* onCommand) {
        this->onCommand = onCommand;
    }

    void setOffCommand(Command* offCommand) {
        this->offCommand = offCommand;
    }

    void pressOnButton() {
        onCommand->excute();
    }
    void pressOffButtion() {
        offCommand->excute();
    }
};

// 클라이언트 코드
int main()
{
    Light livingRoomLight;
    AirConditioner livingRoomAC;

    LightOnCommand lightOn(&livingRoomLight);
    LightOffCommand lightOff(&livingRoomLight);
    AirConditionerOnCommand acOn(&livingRoomAC);
    AirConditionerOffCommand acOff(&livingRoomAC);

    RemoteControl remote;

    remote.setOnCommand(&lightOn);
    remote.setOffCommand(&lightOff);
    remote.pressOnButton();
    remote.pressOffButtion();

    cout << "=========================================" << endl;

    remote.setOnCommand(&acOn);
    remote.setOffCommand(&acOff);
    remote.pressOnButton();
    remote.pressOffButtion();
}