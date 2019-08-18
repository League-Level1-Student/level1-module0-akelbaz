PImage pictureOfRecord;   
int imageRotated=0;
//as member variable
import ddf.minim.*;             //at the very top of your sketch
  Minim minim;        //as a member variable
  AudioPlayer song;      //as a member variable
void setup(){
minim = new Minim(this);    //in the setup method
  song = minim.loadFile("piano.mp3", 512);   //in the setup method
  size(600,600);                                 //in setup method
        pictureOfRecord= loadImage("recorde.png");      //in setup method
pictureOfRecord.resize(height,width); 
}
void draw(){
  if(mousePressed){
    rotateImage(pictureOfRecord,imageRotated);
    imageRotated+=5;
    song.play();
}else{
  song.pause();
}
image(pictureOfRecord, 0, 0);  //in draw method

}
   void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
