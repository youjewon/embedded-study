/*
학생정보 관리 프로그램

한반의 학생수와 학생 정보는 프로그램 실행시 입력받을 것
학생 데이터를 관리하기위해 배열과 유사한자료구조 사용할것 이 배열은 다양한 크기를  지원해야한다.
또한 여러방을 하나로 합치는 기능도 지원해야함
*/


// 필요한 헤더추가
#include<iostream>
#include<string>
#include<algorithm>

// dynamic_array 라는 클래스 템플릿을 작성하고 주요 맴버 변수를 확인
template <typename T>
class dynamic_array
{
    T* data;
    size_t = n;

// 배열의 크기를 인자로 받는 생성사(constructor)와 복사 생성자를 추가
public:
    dynamic_array(int n)
    {
        this->n = n;
        data = new T[n];
    }

    dynamic_array(const dynamic_array<T>& other)
    {
        n = ohter.n;
        data = new T[n];
        
        for(int i = 0 i < n; i++)
            data[i]  = other[i];        
   }
   // 맴버 데이터에 직접 접근하기 위한 [] 연산자와 at()함수를 작성 []연산자를 제공함으로 array와 비슷한 방식으로 배열 원소에 접근 할 수있다.

   T& operator[](int index)
   {
    return data[index];
   }

   const T& operator[](int inde) const
   {
    return data[index];
   }

   T& at(int index)
   {
    return data[index];
   }

   // 배열의 크기를 반환하는 size() 맴버 함수와 소멸자(destructor)를 구현한다. 소멸자에서는 메로리 릭을 방지하기 위해 할당된 메모리를 해제한다.

   size_t size() const
   {
    return n;
   }
   ~dynamic_array()
   {
    delete[] data; // 메모리 릭 방지
   }
}
