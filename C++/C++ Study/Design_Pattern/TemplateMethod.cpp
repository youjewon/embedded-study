/*
템플릿 메서드패턴:
알고리즘 골격을 정의하고 알고리즘의 여러단계중 일부를 
하위 클래스에서 구현하도록하는 디자인패턴

*/ 
#include<iostream>
using namespace std;

class DataProcessor{
public:
    void process() {
        loadData();
        processData();
        saveData();
    }

    virtual ~DataProcessor() {}
protected:
    virtual void loadData() {
        cout << "Loading data (default implementation)" << endl;
    }
    virtual void processData() = 0;

    virtual void saveData() {
        cout << "Saving data (default implementation()" << endl;
    }
};

// concrete class 1
class CSVDataProcessor : public DataProcessor{
protected:
    void loadData() override {
        cout << "Loading CSV data" << endl;
    }
    void processData() override {
        cout << "Processing CSV data" << endl;
    }
    void saveData() override {
        cout << "Saving CSV data" << endl;
    }
};

//concrete class 2
class JSONDataProcessor : public DataProcessor{
protected:
    void loadData() override {
        cout << "Loading JSON data" << endl;
    }
    void processData() override {
        cout << "Processing JSON data" << endl;
    }
    void saveData() override {
        cout << "Saving JSON data" << endl;
    }
};

// ex concrete class 3
class HttpDataProcessor : public DataProcessor {
protected: 
    void processData() override {
        cout << "Processing Http data" << endl;
    }
};

int main()
{
    DataProcessor* processor;
    //processor->process();

    // CSV를 사용할때
    processor = new CSVDataProcessor();
    processor->process();
    delete processor;

    cout << "-------------------------------------" << endl;

    processor = new JSONDataProcessor();
    processor->process();
    delete processor;

    cout << "-------------------------------------" << endl;

    processor = new HttpDataProcessor();
    processor->process();
    delete processor;
}