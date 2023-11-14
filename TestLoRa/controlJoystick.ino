#include <SoftwareSerial.h>

SoftwareSerial lora(2, 3);

const int joyX1Pin = A1; // X 좌표 핀
const int joyY1Pin = A0; // Y 좌표 핀
const int joyX2Pin = A3; // X 좌표 핀
const int joyY2Pin = A2; // Y 좌표 핀
const int buttonPin1 = 4; // 버튼 1 핀
const int buttonPin2 = 5; // 버튼 2 핀
const int buttonPin3 = 6; // 버튼 3 핀
const int buttonPin4 = 7; // 버튼 4 핀
const int buttonPinJ = 8; // 버튼 J 핀
const int buttonPinj = 9; // 버튼 j 핀

int prevJoyX1 = 0;
int prevJoyY1 = 0;

bool prevButton1 = HIGH;
bool prevButton2 = HIGH;
bool prevButton3 = HIGH;
bool prevButton4 = HIGH;
bool prevButtonJ = HIGH;

char prevCommand = '\0';

void setup() {
  Serial.begin(9600); // PC와의 시리얼 통신
  lora.begin(9600);   // LoRa 모듈과의 시리얼 통신
  
  // 버튼 및 조이스틱 핀 설정
  pinMode(joyX1Pin, INPUT);
  pinMode(joyY1Pin, INPUT);
  pinMode(joyX2Pin, INPUT);
  pinMode(joyY2Pin, INPUT);
  pinMode(buttonPin1, INPUT_PULLUP);
  pinMode(buttonPin2, INPUT_PULLUP);
  pinMode(buttonPin3, INPUT_PULLUP);
  pinMode(buttonPin4, INPUT_PULLUP);
  pinMode(buttonPinJ, INPUT_PULLUP);
}

void loop() {
  // 조이스틱 좌표 읽기
  int joyX1 = analogRead(joyX1Pin);
  int joyY1 = analogRead(joyY1Pin);
  int joyX2 = analogRead(joyX2Pin);
  int joyY2 = analogRead(joyY2Pin);

  int mappedX1 = map(joyX1, 0, 1023, 300, 200);
  int mappedY1 = map(joyY1, 0, 1023, 100, 0);
  int mappedX2 = map(joyX2, 0, 1023, 300, 200);
  int mappedY2 = map(joyY2, 0, 1023, 100, 0);

  // 버튼 상태 읽기 (버튼이 눌린 경우, LOW)
  bool button1 = digitalRead(buttonPin1) == LOW;
  bool button2 = digitalRead(buttonPin2) == LOW;
  bool button3 = digitalRead(buttonPin3) == LOW;
  bool button4 = digitalRead(buttonPin4) == LOW;
  bool buttonJ = digitalRead(buttonPinJ) == LOW;
  bool buttonj = digitalRead(buttonPinj) == LOW;

  char command = 's';  // 기본적으로 's'를 보냄

  if(mappedY1 <= 40 && mappedX1 >= 225 && mappedX1 <=275)
  {
    command = 'f';
  }
  else if(mappedY1 >= 60 && mappedX1 >= 225 && mappedX1 <=275)
  {
    command = 'b';
  }
  else if(mappedX1 <=240 && mappedY1 >= 25 && mappedY1 <= 75)
  {
    command = 'L';
  }
  else if(mappedX1 >=260 && mappedY1 >= 25 && mappedY1 <= 75)
  {
    command = 'l';
  }
  else if(mappedY2 <= 40 && mappedX2 >= 225 && mappedX2 <=275)
  {
    command = 'F';
  }
  else if(mappedY2 >= 60 && mappedX2 >= 225 && mappedX2 <=275)
  {
    command = 'B';
  }
  else if(mappedX2 <=240 && mappedY2 >= 25 && mappedY2 <= 75)
  {
    command = 'r';
  }
  else if(mappedX2 >=260 && mappedY2 >= 25 && mappedY2 <= 75)
  {
    command = 'R';
  }
  else if(buttonJ == 1)
  {
    command = 'j';
  }
  else if(button1 == 1)
  {
    command = 'k';
  }
  else if(button2 == 1)
  {
    command = 'n';
  }
  else if(button3 == 1)
  {
    command = 'm';
  }
  else if(button4 == 1)
  {
    command = 'o';
  }

  // 값이 바뀌었을 때만 전송
  if (command != prevCommand) {
    lora.println(command);
    Serial.println(command);
    prevCommand = command;
  }

  // 1초에 한 번 데이터를 보내도록 지연
  delay(500);
}
