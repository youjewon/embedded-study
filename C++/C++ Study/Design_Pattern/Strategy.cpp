/*
전략패턴 :
특성 컨텍스트에서 알고리즘(정책)을 추상화하여 OCP를 따르며 
알고리즘의 선택 적용이 가능하다.

클라이언트는 전략객체 생성후 컨텍스트로 전달
컨텍스트 변경없이 사로운 전략을 추가할 수 있다.
*/

#include<iostream>
#include<vector>

using namespace std;

class Item{
public:
    string name;
    double price;

    Item(string name, double price) : name(name), price(price){}
};

class DiscountStrategy {
public:
    virtual double getDiscountPrice(const Item& item) const = 0;
    virtual ~DiscountStrategy() {}
};

class FirstCustomerDiscount : public DiscountStrategy{
public:
    double getDiscountPrice(const Item& item) const override {
        return item.price * 0.9;
    }
};

class NightDiscount : public DiscountStrategy{
public:
    double getDiscountPrice(const Item& item) const override {
        return item.price * 0.8;
    }
};

class Calculator{
private:
    const DiscountStrategy* discountStrategy;

public:
    Calculator(const DiscountStrategy* discountStrategy): discountStrategy(discountStrategy) {}

    double calculate(const vector<Item>& items)
    {
        double sum = 0.0;
        for(const Item& item : items)
        {
            sum += discountStrategy->getDiscountPrice(item);
        }
        return sum;
    }
};

int main() {
    // 상품 목록 생성
    vector<Item> items = {
        Item("Apple", 100),
        Item("Banana", 150),
        Item("Orange", 200)
    };

    // 첫 손님 할인 전략 적용
    FirstCustomerDiscount firstCustomerDiscount;
    Calculator firstCustomerCalculator(&firstCustomerDiscount);
    cout << "Total price with first customer discount: " << firstCustomerCalculator.calculate(items) << endl;

    // 야간 할인 전략 적용
    NightDiscount nightDiscount;
    Calculator nightCalculator(&nightDiscount);
    cout << "Total price with night discount: " << nightCalculator.calculate(items) << endl;

    return 0;
}