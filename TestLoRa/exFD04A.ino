// FD04A 드라이버 핀 설정
const int motorA = 4; 
const int motorB = 7;
const int motorC = 8;
const int motorD = 11;

const int motorAPWM = 5;
const int motorBPWM = 6;
const int motorCPWM = 9;
const int motorDPWM = 10;

void setup() {
  // 모터 핀을 출력으로 설정
  pinMode(motorA,OUTPUT);
  pinMode(motorB,OUTPUT);
  pinMode(motorC,OUTPUT);
  pinMode(motorD,OUTPUT);

  // 초기 속도 설정 (0~255 범위)
  analogWrite(motorAPWM, 0);
  analogWrite(motorBPWM, 0);
  analogWrite(motorCPWM, 0);
  analogWrite(motorDPWM, 0);
}


void loop()
{
  // 전진
  forward();
  delay(2000);
  
  // 후진
  backward();
  delay(2000);
  
  // 좌회전
  leftTurn();
  delay(2000);
  
  // 우회전
  rightTurn();
  delay(2000);
}
