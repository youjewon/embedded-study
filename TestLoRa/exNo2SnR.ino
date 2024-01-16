#include <Arduino.h>
#include <SoftwareSerial.h>

SoftwareSerial lora(2,3);

union 
{
  int i;
  byte b[2];
}myunion;

void setup() {
  // PC와 아두이노 통신
  Serial.begin(9600);
  lora.begin(9600);
}

void loop() {
  int num = 2048;
  
  // union을 이용한 방법
  myunion.i = num;
  
  lora.write(myunion.b,2);
  delay(2000);
}





/////////////////////////////////////////


#include <Arduino.h>
#include <SoftwareSerial.h>

SoftwareSerial lora(2,3);

union 
{
  int i;
  byte b[2];
}myunion;

void setup() {
  // PC와 아두이노 통신
  Serial.begin(9600);
  lora.begin(9600);
}

void loop() {
    if(lora.available())
    {
      //myunion.b[0] = lora.read();
      //myunion.b[1] = lora.read();
      lora.readBytes(myunion.b,2);

      Serail.println(myunion.1);
    }

}

/////////////////////////////////////////
