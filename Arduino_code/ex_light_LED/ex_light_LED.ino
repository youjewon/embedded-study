#define light A0
#define R 9
#define G 10
#define B 11
int value = 0;

void setup() {
  pinMode(light,INPUT);
  pinMode(R,OUTPUT);
  pinMode(G,OUTPUT);
  pinMode(B,OUTPUT);
  Serial.begin(9600);
}

void loop() {
  value = analogRead(light);
  if(value < 500){
    digitalWrite(R,255);
    delay(100);
  }
  else {
    digitalWrite(R,0);
    delay(100);
  }

}
