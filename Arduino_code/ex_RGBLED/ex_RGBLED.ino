#define R 9
#define G 10
#define B 11

void setup() {
  pinMode(R,OUTPUT);
  pinMode(G,OUTPUT);
  pinMode(B,OUTPUT);
}

void loop() {
  digitalWrite(R,HIGH);
  delay(1000);
  digitalWrite(R,LOW);
  delay(1000);

  digitalWrite(G,HIGH);
  delay(1000);
  digitalWrite(G,LOW);
  delay(1000);
  
  digitalWrite(B,HIGH);
  delay(1000);
  digitalWrite(B,LOW);
  delay(1000);

}
