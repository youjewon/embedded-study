#include <Arduino.h>
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

int speed[5] = { 50, 100, 150, 200, 255 };
int speed_index = 4;

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
      case 'n':
        if (speed_index > 0) {
          speed_index--;
          speed[speed_index];
        }

        break;
      case 'o':
        if (speed_index < 4) {
          speed_index++;
          speed[speed_index];
        }
        break;
      case 'k':
        
        break;
      case 'm':
        AllClose();
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
  analogWrite(motorAPWM, speed[speed_index]);
  analogWrite(motorDPWM, speed[speed_index]);
  digitalWrite(motorA, HIGH);
  digitalWrite(motorD, HIGH);
}
void HandBack() {
  analogWrite(motorAPWM, speed[speed_index]);
  analogWrite(motorDPWM, speed[speed_index]);
  digitalWrite(motorA, LOW);
  digitalWrite(motorD, LOW);
}
void LeftPool() {
  analogWrite(motorAPWM, speed[speed_index]);
  digitalWrite(motorA, HIGH);
}
void LeftPush() {
  analogWrite(motorAPWM, speed[speed_index]);
  digitalWrite(motorA, LOW);
}
void RighttPool() {
  analogWrite(motorDPWM, speed[speed_index]);
  digitalWrite(motorD, HIGH);
}
void RightPush() {
  analogWrite(motorDPWM, speed[speed_index]);
  digitalWrite(motorD, LOW);
}
void FootFoward() {
  analogWrite(motorBPWM, speed[speed_index]);
  analogWrite(motorVPWM, speed[speed_index]);
  digitalWrite(motorB, HIGH);
  digitalWrite(motorC, HIGH);
}
void FootBack() {
  analogWrite(motorBPWM, speed[speed_index]);
  analogWrite(motorVPWM, speed[speed_index]);
  digitalWrite(motorB, LOW);
  digitalWrite(motorC, LOW);
}
void AllClose() {
  analogWrite(motorAPWM, 255);
  analogWrite(motorBPWM, 255);
  analogWrite(motorCPWM, 255);
  analogWrite(motorDPWM, 255);
  digitalWrite(motorA, HIGHT);
  digitalWrite(motorB, HIGHT);
  digitalWrite(motorC, HIGHT);
  digitalWrite(motorD, HIGHT);
}
