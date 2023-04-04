#include<Servo.h>

Servo ms;
int motor = 9;
int pos = 0;

void setup() {
  ms.attach(motor);
}

void loop() {
  for(pos = 0;pos<180;pos+=5)
  {
    ms.write(pos);
    delay(30);
  }
  for(pos = 180;pos>=0;pos-=5)
  {
    ms.write(pos);
    delay(30);
  }
}
