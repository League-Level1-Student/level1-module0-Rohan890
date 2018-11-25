import ddf.minim.*;  
Minim minim;
AudioSample sound;
int x;
int y;
int sx = 5;
int sy = 5;
int ry = 400;
int r2y = 400;
int score = 0;
int score2 = 0;
boolean moveDown = false;
boolean moveUp = false;
boolean moveDown2 = false;
boolean moveUp2 = false;
void setup() {
  size(800, 800);
  background(0, 0, 0);
  minim = new Minim (this);
  sound = minim.loadSample("beat.wav", 128);
}
void draw() {
  background(0, 0, 0);
  fill(255, 255, 255);
  ellipse(x, y, 30, 30);
  fill(255, 255, 255);
  rect(780, ry, 25, 100);
  fill(255, 255, 255);
  rect(0, r2y, 25, 100);
  x = x+sx;
  y = y+sy;
  text("score = "+score, 10,10);
  text("score = "+score2, 730,10);
 if(x > 800){
 x = 400;
 y = 400;
 score = score+1;
 }
  if(x < 0){
 x = 400;
 y = 400;
 score2 = score2+1;
 }
  if(moveDown == true&&ry<700){
  ry = ry+5;
}  
if(moveUp == true&&ry>0){
  ry = ry-5;
}
if(moveDown2 == true&&r2y<700){
  r2y = r2y+5;
}  
if(moveUp2 == true&&r2y>0){
  r2y = r2y-5;
}
  if (x>width||x<0) {
    sx = sx*-1;
    sound.trigger();
  }
  if (y>height||y<0) {
    sy = sy*-1; 
    sound.trigger();
  }
if(intersects(x,y,780,ry,25,100)==true){
sx = sx*-1;
}
if(intersects(x,y,0,r2y,25, 100)==true){
sx = sx*-1;
}
}

void keyPressed() {
  if (keyCode == 76) {
    moveDown = true;
  }  
  if (keyCode == 80) {
    moveUp = true;
 }
  if (keyCode == 65) {
    moveDown2 = true;
  }  
  if (keyCode == 81) {
    moveUp2 = true;
  }
}

void keyReleased() {
  if (keyCode == 76) {
    moveDown = false;
  }  
  if (keyCode == 80) {
    moveUp = false;
  }
  if (keyCode == 65) {
    moveDown2 = false;
  }  
  if (keyCode == 81) {
    moveUp2 = false;
  }
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength, int paddleHeight) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength && ballY< paddleY + paddleHeight)
          return true;
     else 
          return false;
}