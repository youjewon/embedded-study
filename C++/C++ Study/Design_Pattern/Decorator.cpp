/*
데코레이터 패턴
객체에 추가적인 기능을 동적으로 첨가하는 패턴
서브클래스를 만들지 않고도 객체에 기능을 확장할 수 있따.
주로 기본 클래스와 이를 감싸는 데코레이터 클래스를 사영하여 기능을 추가합니다.

*/

#include<iostream>
#include<string>
using namespace std;

// component 인터페이스
class DataSource {
public:
    virtual void writeData(const string& data) = 0;
    virtual string readData() = 0;
    virtual ~DataSource() {}
};

// ConcreteComponent 클래스
#include<fstream>

class FileDataSource : public DataSource {
private:
    string filename;
public:
    FileDataSource(const string& filename) : filename(filename) {}

    void writeData(const string& data) override {
        ofstream file(filename);
        if(file.is_open()){
            file << data;
            file.close();
        }
    }
    string readData() override {
        ifstream file(filename);
        string data;
        if(file.is_open())
        {
            data.assign((istreambuf_iterator<char>(file)),istreambuf_iterator<char>());
            file.close();
        }
        return data;
    }
};

// Decorator 클래스
class DataSourceDecorator : public DataSource{
protected:
    DataSource *wrappee;

public:
    DataSourceDecorator(DataSource *source) : wrappee(source) {}

    void writeData(const string &data) override{
        wrappee->writeData(data);
    }
    string readData() override {
        return wrappee->readData();
    }
};

// ConcreteDecorator 클래스
#include<sstream>
#include<algorithm>
#include<iterator>
// 1. CompressionDecorator
class CompressionDecorator : public DataSourceDecorator {
public:
    CompressionDecorator(DataSource* source) : DataSourceDecorator(source) {}

    void writeData(const string& data) override {
        string compressedData = compress(data);
        DataSourceDecorator::writeData(compressedData);
    }
    string readData() override {
        string data = DataSourceDecorator::readData();
        return decompress(data);
    }

private:
    string compress(const string& data) {
        ostringstream compressed;
        for (char c : data) {
            compressed << c << '\0'; // Simple example compression
        }
        return compressed.str();
    }
    string decompress(const string& data) {
        ostringstream decompressed;
        for(size_t i = 0; i < data.size();i+=2) {
            decompressed << data[i];
        }
        return decompressed.str();
    }
};
// 2.EncryptionDecorator
class EncryptionDecorator : public DataSourceDecorator {
public:
    EncryptionDecorator(DataSource* source) : DataSourceDecorator(source) {}

    void writeData(const string& data) override {
        string encryptedData = encrypt(data);
        DataSourceDecorator::writeData(encryptedData);
    }

    string readData() override {
        string data = DataSourceDecorator::readData();
        return decrypt(data);
    }

private:
    string encrypt(const string& data) {
        string encrypted = data;
        for (char& c : encrypted) {
            c += 1; // Simple encryption by shifting characters
        }
        return encrypted;
    }

    string decrypt(const string& data) {
        string decrypted = data;
        for (char& c : decrypted) {
            c -= 1; // Simple decryption by shifting characters back
        }
        return decrypted;
    }
};

// 3.BuffreingDecorator
class BufferingDecorator : public DataSourceDecorator {
private:
    string buffer;
    size_t bufferSize;

public:
    BufferingDecorator(DataSource* source, size_t size) : DataSourceDecorator(source), bufferSize(size) {}

    void writeData(const string& data) override {
        buffer += data;
        if (buffer.size() >= bufferSize) {
            DataSourceDecorator::writeData(buffer);
            buffer.clear();
        }
    }

    string readData() override {
        if (!buffer.empty()) {
            return buffer;
        }
        return DataSourceDecorator::readData();
    }

    ~BufferingDecorator() {
        if (!buffer.empty()) {
            DataSourceDecorator::writeData(buffer);
        }
    }
};

// Client 코드
int main() {
    FileDataSource FileDataSource("example.txt");

    EncryptionDecorator encryptionSource(&FileDataSource);
    CompressionDecorator compressedSource(&encryptionSource);
    BufferingDecorator bufferedSource(&compressedSource, 10);

    bufferedSource.writeData("Hello, world!");

    string data = bufferedSource.readData();
    cout << "ReadData : " << data << endl;

    return 0;

}