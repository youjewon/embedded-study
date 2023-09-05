#include <Arduino.h>
#include <SoftwareSerial.h>

SoftwareSerial lora(2, 3);

int adc_key_val[5] = {30, 150, 360, 535, 760};
int NUM_KEYS = 5;
int adc_key_in;
int key = -1;
int oldkey = -1;

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);  // PC와의 시리얼 통신
  lora.begin(9600);    // LoRa 모듈과의 시리얼 통신
}

void loop() {
  adc_key_in = analogRead(0);  // 센서에서 값 읽기

  // 버튼 상태 확인
  for (int i = 0; i < NUM_KEYS; i++) {
    if (adc_key_in < adc_key_val[i]) {
      key = i;
      break; // 첫 번째로 발견한 버튼만 처리
    }
  }

  // 버튼이 눌렸을 때만 출력 및 전송
  if (key != oldkey) {
    Serial.println(adc_key_in); // 버튼이 눌린 경우에만 값을 출력
    oldkey = key;
    
    switch (key) {
      case 0:
        lora.println("bt1");
        break;
      case 1:
        lora.println("bt2");
        break;
      case 2:
        lora.println("bt3");
        break;
      case 3:
        lora.println("bt4");
        break;
      case 4:
        lora.println("bt5");
        break;
    }
  }

  delay(100);
}
