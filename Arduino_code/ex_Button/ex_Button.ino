#define button 4
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
}
