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

void StopAllMotors();

void setup()
{
  Serial.begin(9600);
  lora.begin(9600);

  pinMode(motorA, OUTPUT);
  pinMode(motorB, OUTPUT);
  pinMode(motorC, OUTPUT);
  pinMode(motorD, OUTPUT);

  // 초기에 모든 모터 정지
  StopAllMotors();
}

void Motor1()
{
  digitalWrite(motorA, HIGH);
  analogWrite(motorAPWM, 100);
}

void Motor2()
{
  digitalWrite(motorB, HIGH);
  analogWrite(motorBPWM, 100);
}

void Motor3()
{
  digitalWrite(motorC, HIGH);
  analogWrite(motorCPWM, 100);
}

void Motor4()
{
  digitalWrite(motorD, HIGH);
  analogWrite(motorDPWM, 100);
}

void StopAllMotors()
{
  digitalWrite(motorA, LOW);
  digitalWrite(motorB, LOW);
  digitalWrite(motorC, LOW);
  digitalWrite(motorD, LOW);

  analogWrite(motorAPWM, 0);
  analogWrite(motorBPWM, 0);
  analogWrite(motorCPWM, 0);
  analogWrite(motorDPWM, 0);
}

void loop()
{
  if (lora.available())
  {
    String data = lora.readStringUntil('\n');
    int intData = data.toInt();
    Serial.println(data);
    if (intData == 1)
    {
      StopAllMotors(); // 모든 모터 정지
      Motor1(); // 모터 1 작동
    }
    else if (intData == 2)
    {
      StopAllMotors();
      Motor2();
    }
    else if (intData == 3)
    {
      StopAllMotors();
      Motor3();
    }
    else if (intData == 4)
    {
      StopAllMotors();
      Motor4();
    }
    else
    {
      StopAllMotors(); // 알 수 없는 데이터가 오면 모든 모터 정지
    }
  }
}
