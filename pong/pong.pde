int x = 0 ;
float speed = 10;
float speedY = 10;
int y = 0;
boolean run = true;
float time = 0.00;
    PImage backgroundImage;
    PImage die;
    boolean gore = false;
    int check = 40;
      AudioPlayer song;      //as a member variable

      import ddf.minim.*;
  Minim minim;
  AudioSample sound;
      AudioPlayer song2;      //as a member variable
AudioSample sound2;
void setup(){
size(960,540);  
  minim = new Minim (this);
  sound2 = minim.loadSample("pew.wav", 128);
  minim = new Minim (this);
  sound = minim.loadSample("boing.wav", 128);
  
  minim = new Minim(this);    //in the setup method
  song = minim.loadFile("pianoo.mp3", 512); 
  minim = new Minim(this);    //in the setup method
  song2 = minim.loadFile("monster.mp3", 512); 
  
      backgroundImage = loadImage("doge.jpg");
      die = loadImage("po.jpeg");
      die.resize(width,height);
}
void draw(){
   if(y>=height-check){
     checkBounce();
   }
 
   if(gore){
image(die,0,0);
run=false;
text("You survived "+time +" seconds",width-225,15);
text("You lose",width/2,height/2);
}

else{
  song.play();
 if(mousePressed){
  song2.play();
 }

 
  image(backgroundImage, 0, 0);
    image(backgroundImage, 0, 0, width, height);  fill(255, 0, 0);

  noStroke();
  fill(0);
  ellipse(x, y, 25, 25); 
    fill(255);
      rect(mouseX,height-20, 150, 20);
  x+=speed;
   y+=speedY;
   check();
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
  if(run){
  time+=0.05;
  }
  fill(0);
  text("Youve survived "+time+" seconds",width-225,15);
println(x);

}

void checkBounce(){
  if(x-mouseX>0&&x-mouseX<150){
sound.trigger();
speedY=-speedY; 
}else{
gore=true;
}
}
