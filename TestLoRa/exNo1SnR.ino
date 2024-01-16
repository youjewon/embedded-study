#include <Arduino.h>
#include <SoftwareSerial.h>

SoftwareSerial lora(2,3);

void setup() {
  // PC와 아두이노 통신
  Serial.begin(9600);
  lora.begin(9600);
}

void loop() {
  lora.println("sendData");
  delay(2000);
}



/////////////////////////////////////////


#include <Arduino.h>
#include <SoftwareSerial.h>

SoftwareSerial lora(2,3);

void setup() {
  // PC와 아두이노 통신
  Serial.begin(9600);
  lora.begin(9600);
}

void loop() {
    if(lora.available())
    {
        String data = lora.readStringUntil('\n');       // print로 수신시 '\r'
        Serial.println(data);
    }

}

/////////////////////////////////////////
