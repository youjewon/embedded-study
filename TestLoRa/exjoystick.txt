#include <Arduino.h>
#include <SoftwareSerial.h>

SoftwareSerial lora(2, 3);

const int joyXPin = A1; // X 좌표 핀
const int joyYPin = A0; // Y 좌표 핀
const int joyKPin = 8;  // S-K 핀

const int buttonPin1 = 4; // 버튼 1 핀
const int buttonPin2 = 5; // 버튼 2 핀
const int buttonPin3 = 6; // 버튼 3 핀
const int buttonPin4 = 7; // 버튼 4 핀

void setup()
{
  // put your setup code here, to run once:
  Serial.begin(9600); // PC와의 시리얼 통신
  lora.begin(9600);   // LoRa 모듈과의 시리얼 통신

  pinMode(joyKPin,INPUT_PULLUP);
  pinMode(buttonPin1, INPUT_PULLUP);
  pinMode(buttonPin2, INPUT_PULLUP);
  pinMode(buttonPin3, INPUT_PULLUP);
  pinMode(buttonPin4, INPUT_PULLUP);
}

void loop()
{
  int xValue = analogRead(joyXPin);
  int yValue = analogRead(joyYPin);

  float mappedX = map(xValue, 0, 1023, 0, 100);
  float mappedY = map(yValue, 0, 1023, 0, 100);

  // 버튼 상태 읽기 (HIGH는 버튼이 눌리지 않은 상태)
  bool button1 = digitalRead(buttonPin1) == HIGH;
  bool button2 = digitalRead(buttonPin2) == HIGH;
  bool button3 = digitalRead(buttonPin3) == HIGH;
  bool button4 = digitalRead(buttonPin4) == HIGH;
  bool joyK = digitalRead(joyKPin) == HIGH;
  // 값이 변화했을 때만 출력

  Serial.print("X: ");
  Serial.print(mappedX);
  Serial.print("\tY: ");
  Serial.print(mappedY);
  Serial.print("\tButton1: ");
  Serial.print(button1);
  Serial.print("\tButton2: ");
  Serial.print(button2);
  Serial.print("\tButton3: ");
  Serial.print(button3);
  Serial.print("\tButton4: ");
  Serial.println(button4);
  Serial.print("\tJoy-K: ");
  Serial.println(joyK);

  if(button1 == 0)
  {
    lora.println("1");
    delay(100);
  }
  else if(button2 == 0)
  {
    lora.println("2");
    delay(100);
  }
  else if(button3 == 0)
  {
    lora.println("3");
    delay(100);
  }
  else if(button4 == 0)
  {
    lora.println("4");
    delay(100);
  }
  else if(joyK == 0)
  {
    lora.println("5");
    delay(100);
  }
    delay(100);
}
