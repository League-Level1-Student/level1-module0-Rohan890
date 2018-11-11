import ddf.minim.*;  
Minim minim;
AudioSample sound;
int x;
int y;
int sx = 5;
int sy = 5;
void setup() {
  size(800, 800);
  background(0, 0, 0);
minim = new Minim (this);
sound = minim.loadSample("beat.wav", 128);
}
void draw() {
  background(0, 0, 0);
  fill(255, 255, 255);
  stroke(255, 255, 255);
  ellipse(x, y, 30, 30);
  x = x+sx;
  y = y+sy;
  if (x>width||x<0){
    sx = sx*-1;
  }
  if(y>height||y<0){
     sy = sy*-1; 
  }
  
}