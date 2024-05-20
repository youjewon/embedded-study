/*
제목 : 메모리 게임 만들기
설명 : 나의 기억력을 테스트해보자! 오렌지보드 나노를 활용해 메모리 게임 만들기
원작자 : Jeremy Wilson
수정 : Klant {;]
*/

// 하드웨어 연결 정보
const int button1 = 2;          // D2번에 연결된 버튼은 D7번에 연결된 LED를 제어합니다.
const int button2 = 3;          // D3번에 연결된 버튼은 D8번에 연결된 LED를 제어합니다.
const int button3 = 4;          // D4번에 연결된 버튼은 D9번에 연결된 LED를 제어합니다.
const int button4 = 5;          // D5번에 연결된 버튼은 D10번에 연결된 LED를 제어합니다.
const int led1 = 7;             // 첫 번째 LED를 D7번에 연결합니다.
const int led2 = 8;             // 두 번째 LED를 D8번에 연결합니다.
const int led3 = 9;             // 세 번째 LED를 D9번에 연결합니다.
const int led4 = 10;            // 네 번째 LED를 D10번에 연결합니다.
const int buzzer = 12;          // 피에조 부저를 D12번에 연결합니다.
const int tones[] = {1915, 1700, 1519, 1432, 2700}; // 각 버튼을 눌렀을 때 재생할 tone 배열 - 마지막 tone은 틀렸을 시 재생되는 음입니다.


int buttonState[] = {0, 0, 0, 0};      // 버튼의 현재 상태 값을 담기 위한 배열
int lastButtonState[] = {0, 0, 0, 0};  // 버튼의 이전 상태 값을 담기 위한 배열
int buttonPushCounter[] = {0, 0, 0, 0};

// tone 재생을 위한 함수
void playTone(int tone, int duration) {
  for (long i = 0; i < duration * 1000L; i += tone * 2) {
    digitalWrite(buzzer, HIGH);
    delayMicroseconds(tone);
    digitalWrite(buzzer, LOW);
    delayMicroseconds(tone);
  }
}

void setup() {
  // 난수 생성합니다.
  // randomSeed 함수 알아보기 : https://www.arduino.cc/en/Reference/RandomSeed
  randomSeed(analogRead(0));

  // 버튼이 연결된 핀들의 pin mode를 INPUT으로 설정해줍니다.(하드웨어 풀 다운)
  pinMode(button1, 3);
  pinMode(button2, 3);
  pinMode(button3, 3);
  pinMode(button4, 3);

  // LED와 피에조 부저가 연결된 핀들의 pin mode를 OUTPUT으로 설정해줍니다.
  pinMode(led1, OUTPUT);
  pinMode(led2, OUTPUT);
  pinMode(led3, OUTPUT);
  pinMode(led4, OUTPUT);
  pinMode(buzzer, OUTPUT);
}

int game_on = 0;
int wait = 0;
int currentlevel = 1; // 현재 진행 단계의 level
long rand_num = 0; // random 함수로부터 생성된 난수를 담기 위한 long 형태의 변수
int rando = 0; //rand_num의 값에 따라 넣어줄 int 형태의 변수(생성된 난수를 바탕으로 킬 LED를 정해줄 때 사용)
int butwait = 500; // 다음 버튼이 눌러지기까지 대기하는 시간
int ledtime = 500; // 버튼이 눌러졌을 때 LED가 점등해 있는 시간
int n_levels = 30; // 게임의 maximum 단계
int pinandtone = 0; // 생성된 난수에 따라 킬 배열 순서를 담는 변수(n_array의 값)
int right = 0; //다음 레벨로 넘어가는 과정에서 버튼을 제대로 눌렀는지 안눌렀는지를 판단하기위해 사용할 변수. 1일 경우만 다음 레벨 진행
int speedfactor = 5; //This is the final speed of the lights and sounds for the last level. This increases as more games are won
int leddelay = 200; //Initializing time for LED. This will decrease as the level increases

void loop() {

  int n_array[n_levels];
  int u_array[n_levels];

  int i;

  // n_array와 u_array가 일치한다면 새 게임을 시작합니다
  // 난수 생성
  if (game_on == 0) { // 만약 game on 상태가 0이라면
    for (i = 0; i < n_levels; i = i + 1) { // n_levels 만큼 반복합니다
      n_array[i] = 0;
      u_array[i] = 0;
      rand_num = random(1, 200); //1부터 200까지의 난수를 생성하여 rand_num 변수에 담습니다
      if (rand_num <= 50) //rand_num이 50보다 작거나 같다면
        rando = 0; //rando는 0
      else if (rand_num > 50 && rand_num <= 100) //rand_num이 50보다 크고 100보다 작거나 같다면
        rando = 1; //rando는 1
      else if (rand_num > 100 && rand_num <= 150) //rand_num이 100보다 크고 150보다 작거나 같다면
        rando = 2; //rando는 2
      else if (rand_num <= 200) //rand_num이 200보다 작거나 같다면
        rando = 3; //rando는 3

      //랜덤으로 정해진 차례(rando)를 n_array 배열에 넣어줍니다.
      //즉 켜질 LED의 차례가 순차적으로 배열에 담기게 됩니다.
      n_array[i] = rando;
    }
    //game_on의 상태를 1로 정해줍니다. 버튼 입력이 있을 때까지 대기
    game_on = 1;

  }

  // 게임 진행
  if (wait == 0) { //wait 값이 0이라면
    delay (200);
    i = 0;
    for (i = 0; i < currentlevel; i = i + 1) { // currnetlevel 만큼 반복합니다.
      // 피에조 부저의 재생 시간을 설정해줍니다.
      leddelay = ledtime / (1 + (speedfactor / n_levels) * (currentlevel - 1));
      pinandtone = n_array[i]; //난수 생성을 통해 담겨는 rando값이 저장되어 있는 변수의 i번째를 값을 pinandtone 담습니다
      digitalWrite(pinandtone + 7, HIGH); //LED는 D7부터 D10까지이기 때문에 7을 더해줍니다. 즉 rando에 따라 LED가 점등됩니다
      playTone(tones[pinandtone], leddelay); //피에조 부저로 pinand 차례의 배열 값에 맞는 tone을 재생해줍니다
      digitalWrite(pinandtone + 7, LOW); //LED를 소등합니다
      delay(100 / speedfactor);
    }
    wait = 1; //wait 값을 1로 정해줍니다
  }
  i = 0;
  int buttonchange = 0;
  int j = 0; //현재 시퀀스에 대한 위치를 담기 위한 변수
  while (j < currentlevel) { //j가 current level보다 작을 때까지 반복
    while (buttonchange == 0) { //button
      for (i = 0; i < 4; i = i + 1) { //4번 반복합니다
        //현재 버튼의 상태를 buttonState의 상태에 저장합니다
        buttonState[i] = digitalRead(i + 2); //버튼은 D2부터 D5까지이기 때문에 2를 더해줍니다
        buttonchange = buttonchange + buttonState[i]; //buttonchange의 현재 버튼 상태를 더해줍니다
      }
    }
    for (i = 0; i < 4; i = i + 1) { //4번 반복합니다
      if (buttonState[i] == HIGH) { //i번째의 버튼이 눌렸다면
        digitalWrite(i + 7, HIGH); //버튼의 순서에 맞는 LED 점등
        playTone(tones[i], ledtime); //버튼의 순서에 맞는 tone 재생(200ms)
        digitalWrite(i + 7, LOW); //LED 소등
        wait = 0; //wait를 0으로 정해줍니다
        u_array[j] = i; //i값을 u_array의 j번째에 담습니다.
        buttonState[i] = LOW; // buttonState의 i번째를 0으로 정합니다
        buttonchange = 0; //buttonchange를 0으로 정합니다
      }
    }

    if (u_array[j] == n_array[j]) { //만약 j번째의 u_array과 n_array 값이 일치한다면(LED의 순서에 맞게 버튼을 눌렀다면)
      j++; //j에 1을 더해줍니다
      right = 1; //right를 1로 정해줍니다
    }

    else { //만약 j번째의 u_array과 n_array 값이 일치하지 않는다면(LED의 순서에 맞게 버튼을 누르지 못했다면)
      right = 0; //right를 0으로 정해줍니다
      i = 4; //i를 4로 정해줍니다(더이상 반복 진행 X)
      j = currentlevel; // j를 currnetlevel로 정해줍니다(while문 조건 성립 X)
      wait = 0; // wait를 0으로 정해줍니다. 다시 처음 단계로 전환
    }
  }


  //만약 right가 0이라면(만약 j번째의 u_array과 n_array 값이 일치하지 않는다면(LED의 순서에 맞게 버튼을 누르지 못했다면))
  if (right == 0) {
    delay(300);
    i = 0;
    game_on = 0; //game on을 0으로 정해줍니다(game on이 0일때 난수 생성 단계로 게임 초기화)
    currentlevel = 1; // current level을 1로 정해줍니다


    //4개의 LED를 2번 깜빡입니다
    for (i = 0; i < 4; i = i + 1) {
      digitalWrite(i + 7, HIGH);
    }
    playTone(tones[4], ledtime);
    for (i = 0; i < 4; i = i + 1) {
      digitalWrite(i + 7, LOW);
    }
    delay (200);
    for (i = 0; i < 4; i = i + 1) {
      digitalWrite(i + 7, HIGH);
    }
    playTone(tones[4], ledtime);
    for (i = 0; i < 4; i = i + 1) {
      digitalWrite(i + 7, LOW);
    }

    delay(500);
    game_on = 0;
  }


  //만약 right가 1이라면(만약 j번째의 u_array과 n_array 값이 일치한다면(LED의 순서에 맞게 버튼을 눌렀다면))
  if (right == 1) {
    currentlevel++; //currnetlevel에 1을 더해줍니다(다음 단계로)
    wait = 0; //wait를 0으로 정해줍니다(게임 진행)
  }

  //만약 n_level까지 마쳤다면
  if (currentlevel == n_levels) {
    delay(500);
    // 성공 시 재생되는 음계
    int notes[] = {2, 2, 2, 2, 0, 1, 2, 1, 2};
    int note = 0;
    int tempo[] = {200, 200, 200, 400, 400, 400, 200, 200, 600};
    int breaks[] = {100, 100, 100, 200, 200, 200, 300, 100, 200};

    // 성공 효과음을 재생합니다
    for (i = 0; i < 9; i = i + 1) {
      note = notes[i];
      digitalWrite(note + 7, HIGH);
      playTone(tones[note], tempo[i]);
      digitalWrite(note + 7, LOW);
      delay(breaks[i]);
    }

    //게임 재시작을 위해 변수를 설정해줍니다
    game_on = 0;
    currentlevel = 1;
    n_levels = n_levels + 2;
    speedfactor = speedfactor + 1;
  }

}