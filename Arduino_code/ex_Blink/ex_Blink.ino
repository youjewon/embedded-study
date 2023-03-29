void setup() {
  pinMode(LED_BUILTIN, OUTPUT);         // LED_BUILTIN는 내장 led로 pinNumber 13으로도 제어 가능
}


void loop() {
  digitalWrite(LED_BUILTIN, HIGH);    // HIGH는 디지털 출력 1에 해당함
  delay(1000);                      
  digitalWrite(LED_BUILTIN, LOW);     // HIGH는 디지털 출력 1에 해당함
  delay(1000);                     
}
