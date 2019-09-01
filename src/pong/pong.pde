int x = 0 ;
int speed = 5;
int speedY = 5;
int y = 0;
    PImage backgroundImage;
    PImage die;
      AudioPlayer song;      //as a member variable

      import ddf.minim.*;
  Minim minim;
  AudioSample sound;
      AudioPlayer song2;      //as a member variable

void setup(){
size(960,540);  
  minim = new Minim (this);
  sound = minim.loadSample("pew.wav", 128);
  
  minim = new Minim(this);    //in the setup method
  song = minim.loadFile("pianoo.mp3", 512); 
  minim = new Minim(this);    //in the setup method
  song2 = minim.loadFile("monster.mp3", 512); 
  
      backgroundImage = loadImage("doge.jpg");
      die = loadImage("po.jpeg");
      die.resize(width,height);
}
void draw(){
 
song.play();
 if(mousePressed){
  song2.play();
 }
 
  image(backgroundImage, 0, 0);
    image(backgroundImage, 0, 0, width, height);  fill(255, 0, 0);
       if(keyPressed){
image(die,0,0);
}
  noStroke();
  fill(0);
  ellipse(x, y, 25, 25); 
    fill(255);
      rect(mouseX,height-20, 150, 20);
  x+=speed;
   y+=speedY;
   check();
   if(y>=height-32.5){
     checkBounce();
   }
}
void check(){
  if(x>=width){
  speed=-speed;

  }
  if(x<=0){
    speed=-speed;

  }
    if(y>=height){
  speedY=-speedY;

  }
  if(y<=0){
    speedY=-speedY;

  }  
}
void checkBounce(){
if(x-mouseX<75){
println("left");
if(speed>0){
speed=-speed;
}
speedY=-speedY;
}else{
rect(0,0,width,height);
}  if(x-mouseX>=75&&x-mouseX<=175){
println("right");
if(speed<0){
speed=-speed;
speedY=-speedY;
}
}else{
sound.trigger();
}
}
