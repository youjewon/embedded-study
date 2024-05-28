/*
상태패턴
객체가 상태에 따라서 행동을 달리하는 디자인패턴

문 상태 제어 예제
*/

#include<iostream>
#include<memory>
using namespace std;

// State 인터페이스
class DoorState {
public:
    virtual void open() = 0;
    virtual void close() = 0;
    virtual ~DoorState() {}
};

// concreteState 클래스
// 인터페이스를 구현하여 문이 열려있거나 닫혀있을때 행동을 정의합니다.
class OpenState : public DoorState {
public:
    void open() override {
        cout << "The door is already open" << endl;
    }

    void close() override {
        cout << "Closing the door" << endl;
    }
};

class ClosedState : public DoorState {
public :
    void open() override {
        cout << "Opening the door" << endl;
    }
    void close() override {
        cout << "The door is already closed" << endl;
    }
};

// context 클래스
class Door {
private:
    unique_ptr<DoorState> state;
public:
    Door() : state(make_unique<ClosedState>()) {}

    void setState(DoorState* newState)
    {
        state.reset(newState);
    }
    void open() {
        state->open();
        setState(new OpenState());
    }

    void close() {
        state->close();
        setState(new ClosedState());
    }
};

int main()
{
    Door door;

    door.open();
    door.open();
    door.close();
    door.close();

    return 0;
}