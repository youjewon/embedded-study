#define button 4
#define R 9
#define G 10
#define B 11

int value = 0;

void setup() {
  // put your setup code here, to run once:
  pinMode(button,INPUT);
  Serial.begin(9600);
}

void loop() {
  // put your main code here, to run repeatedly:
  value = digitalRead(button);
  Serial.print("button : ");
  Serial.println(value);
  if(value == 1)
  {
    digitalWrite(R,HIGH);
  }
  else
  {
    digitalWrite(R,LOW);
  }
}
