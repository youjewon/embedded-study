int size = 50;

int rx1 = 0;
int ry1 = 0;
int rx2 = 350;
int ry2 = 0;

void setup()
{
  size(400,400);
}

void draw()
{
  fill(#FFC800);
  background(255);
  rect(rx1,ry1,size,size);
  rect(rx2,ry2,size,size);
  rx1++;
  ry1++;
  
  rx2--;
  ry2++;
}
