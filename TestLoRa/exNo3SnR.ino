#include <Arduino.h>
#include <SoftwareSerial.h>

SoftwareSerial lora(2,3);


byte myheader[] = (0x00,0x01,0x47); // ADDH,ADDL,CH

void setup() {
  // PC와 아두이노 통신
  Serial.begin(9600);
  lora.begin(9600);
}

void loop() {
    lora.write(myheader,3);

  lora.println("data");
  delay(2000);
}



////////////////////////////////////

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
        String data = lora.readStringUntil('\n');
        Serial.println(data);
    }

}
