#define light A0
int value = 0;

void setup() {
  pinMode(light,INPUT);
  Serial.begin(9600);
}

void loop() {
  value = analogRead(light);
  Serial.print("light");
  Serial.println(value);
}
