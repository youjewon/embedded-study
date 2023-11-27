#include <SoftwareSerial.h>

SoftwareSerial lora(2, 3);

const int motorA = 4;
const int motorB = 7;
const int motorC = 8;
const int motorD = 11;

const int motorAPWM = 5;
const int motorBPWM = 6;
const int motorCPWM = 9;
const int motorDPWM = 10;

int speed[5] = { 0, 100, 150, 200, 255 };
int speed_index = 4;

char prevData = '\0';

void StopAllMotors();
void HandFoward();
void HandBack();
void FootFoward();
void FootBack();
void LeftPool();
void LeftPush();
void RightPool();
void RightPush();
void AllClose();

void setup() {
  Serial.begin(9600);
  lora.begin(9600);

  pinMode(motorA, OUTPUT);
  pinMode(motorB, OUTPUT);
  pinMode(motorC, OUTPUT);
  pinMode(motorD, OUTPUT);

  pinMode(motorAPWM, OUTPUT);
  pinMode(motorBPWM, OUTPUT);
  pinMode(motorCPWM, OUTPUT);
  pinMode(motorDPWM, OUTPUT);

  // 초기에 모든 모터 정지
  StopAllMotors();
}

void loop() {
  if (lora.available()) {
    char data = lora.read();  // 데이터 수신
    //Serial.println("Received: " + data);      // 수신한 데이터를 시리얼 모니터에 출력
    switch (data) {
      case 'f':
        HandFoward();
        break;
      case 'F':
        FootFoward();
        break;
      case 'b':
        HandBack();
        break;
      case 'B':
        FootBack();
        break;
      case 'l':
        LeftPush();
        break;
      case 'L':
        LeftPool();
        break;
      case 'r':
        RightPush();
        break;
      case 'R':
        RightPool();
        break;
      case 's':
        StopAllMotors();
        break;
      case 'j':
        if (speed_index > 0) {
          speed_index--;
        }

        break;
      case 'J':
        if (speed_index < 4) {
          speed_index++;
        }
        break;
      case 'k':

        break;
      case 'm':
        AllClose();
        break;
      case 'o':
        break;
      case 'n':
        break;
    }
    if (data != '\0') {
      prevData = data;
      Serial.print(prevData);
    }
    delay(100);
  }
}

void StopAllMotors() {
  analogWrite(motorAPWM, 0);
  analogWrite(motorBPWM, 0);
  analogWrite(motorCPWM, 0);
  analogWrite(motorDPWM, 0);
}

void HandFoward() {
  digitalWrite(motorA, HIGH);
  digitalWrite(motorB, HIGH);
  digitalWrite(motorC, HIGH);
  digitalWrite(motorD, LOW);
  analogWrite(motorAPWM, speed[speed_index]);
  analogWrite(motorCPWM, speed[0]);
  analogWrite(motorBPWM, speed[0]);
  analogWrite(motorDPWM, speed[speed_index]);
}
void HandBack() {
  digitalWrite(motorA, LOW);
  digitalWrite(motorB, HIGH);
  digitalWrite(motorC, HIGH);
  digitalWrite(motorD, HIGH);
  analogWrite(motorAPWM, speed[speed_index]);
  analogWrite(motorCPWM, speed[0]);
  analogWrite(motorBPWM, speed[0]);
  analogWrite(motorDPWM, speed[speed_index]);
}
void LeftPool() {
  digitalWrite(motorA, HIGH);
  digitalWrite(motorB, HIGH);
  digitalWrite(motorC, HIGH);
  digitalWrite(motorD, HIGH);
  analogWrite(motorAPWM, speed[speed_index]);
  analogWrite(motorCPWM, speed[0]);
  analogWrite(motorBPWM, speed[0]);
  analogWrite(motorDPWM, speed[0]);
}
void LeftPush() {
  digitalWrite(motorA, LOW);
  digitalWrite(motorB, HIGH);
  digitalWrite(motorC, HIGH);
  digitalWrite(motorD, HIGH);
  analogWrite(motorAPWM, speed[speed_index]);
  analogWrite(motorCPWM, speed[0]);
  analogWrite(motorBPWM, speed[0]);
  analogWrite(motorDPWM, speed[0]);
}
void RightPool() {
  digitalWrite(motorA, HIGH);
  digitalWrite(motorB, HIGH);
  digitalWrite(motorC, HIGH);
  digitalWrite(motorD, LOW);
  analogWrite(motorAPWM, speed[0]);
  analogWrite(motorCPWM, speed[0]);
  analogWrite(motorBPWM, speed[0]);
  analogWrite(motorDPWM, speed[speed_index]);
}
void RightPush() {
  digitalWrite(motorA, HIGH);
  digitalWrite(motorB, HIGH);
  digitalWrite(motorC, HIGH);
  digitalWrite(motorD, HIGH);
  analogWrite(motorAPWM, speed[0]);
  analogWrite(motorCPWM, speed[0]);
  analogWrite(motorBPWM, speed[0]);
  analogWrite(motorDPWM, speed[speed_index]);
}
void FootFoward() {
  digitalWrite(motorA, HIGH);
  digitalWrite(motorB, HIGH);
  digitalWrite(motorC, LOW);
  digitalWrite(motorD, HIGH);
  analogWrite(motorAPWM, speed[0]);
  analogWrite(motorCPWM, speed[speed_index]);
  analogWrite(motorBPWM, speed[speed_index]);
  analogWrite(motorDPWM, speed[0]);
}
void FootBack() {
  digitalWrite(motorA, HIGH);
  digitalWrite(motorB, LOW);
  digitalWrite(motorC, HIGH);
  digitalWrite(motorD, HIGH);
  analogWrite(motorAPWM, speed[0]);
  analogWrite(motorCPWM, speed[speed_index]);
  analogWrite(motorBPWM, speed[speed_index]);
  analogWrite(motorDPWM, speed[0]);
}
void AllClose() {
  digitalWrite(motorA, HIGH);
  digitalWrite(motorB, HIGH);
  digitalWrite(motorC, HIGH);
  digitalWrite(motorD, HIGH);
  analogWrite(motorAPWM, speed[speed_index]);
  analogWrite(motorCPWM, speed[speed_index]);
  analogWrite(motorBPWM, speed[speed_index]);
  analogWrite(motorDPWM, speed[speed_index]);
}
