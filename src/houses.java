import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class houses {
	
public static void main(String[] args) {
	Robot bob = new Robot();
bob.setX(50);
		bob.setY(550);
		drawFlatHouse(1,"big","orange",bob);
		drawPointyRoof(1,"small","red",bob);
		drawPointyRoof(1,"medium","blue",bob);
		drawPointyRoof(1,"medium","green",bob);
		drawFlatHouse(1,"big","pink",bob);
		drawPointyRoof(1,"medium","blue",bob);
		drawFlatHouse(1,"big","yellow",bob);
		drawPointyRoof(1,"small","orange",bob);
		drawPointyRoof(1,"small","yellow",bob);
		drawPointyRoof(1,"medium","red",bob);
}
static void drawFlatHouse(int times, String height,String color, Robot bob) {
	for (int i = 0; i < times; i++) {
	int heigh=0;
		if(height.equalsIgnoreCase("small")) {
	 heigh = 60;
	}else if(height.equalsIgnoreCase("medium")) {
		 heigh = 120;	
	}else if(height.equalsIgnoreCase("big")) {
		 heigh = 250;	
	}
	if(color.equalsIgnoreCase("red")) {
	bob.setPenColor(Color.RED);	
	}else if(color.equalsIgnoreCase("blue")) {
		bob.setPenColor(Color.BLUE);	
	}else if(color.equalsIgnoreCase("yellow")) {
		bob.setPenColor(Color.YELLOW);	
	}else if(color.equalsIgnoreCase("orange")) {
		bob.setPenColor(Color.ORANGE);	
	}else if(color.equalsIgnoreCase("green")) {
		bob.setPenColor(Color.GREEN);	
	}else if(color.equalsIgnoreCase("pink")) {
		bob.setPenColor(Color.pink);	
	}else {
	bob.setRandomPenColor();
	}
	bob.setSpeed(100);
	bob.penDown();
	bob.hide();
	bob.move(heigh);
	bob.turn(90);
	bob.move(25);
	bob.turn(90);
	bob.move(heigh);
	bob.setPenColor(Color.GREEN);
	bob.turn(270);
	bob.move(25);
	bob.turn(270);
}
}


static void drawPointyRoof(int times, String height,String color, Robot bob) {
	for (int i = 0; i < times; i++) {
	int heigh=0;
		if(height.equalsIgnoreCase("small")) {
	 heigh = 60;
	}else if(height.equalsIgnoreCase("medium")) {
		 heigh = 120;	
	}else if(height.equalsIgnoreCase("big")) {
		 heigh = 250;	
	}
	if(color.equalsIgnoreCase("red")) {
	bob.setPenColor(Color.RED);	
	}else if(color.equalsIgnoreCase("blue")) {
		bob.setPenColor(Color.BLUE);	
	}else if(color.equalsIgnoreCase("yellow")) {
		bob.setPenColor(Color.YELLOW);	
	}else if(color.equalsIgnoreCase("orange")) {
		bob.setPenColor(Color.ORANGE);	
	}else if(color.equalsIgnoreCase("green")) {
		bob.setPenColor(Color.GREEN);	
	}else if(color.equalsIgnoreCase("pink")) {
		bob.setPenColor(Color.pink);	
	}else {
	bob.setRandomPenColor();
	}
	bob.setSpeed(100);
	bob.penDown();
	bob.hide();
	bob.move(heigh);
	bob.turn(45);
	bob.move(25/2);
	bob.turn(90);
	bob.move(25/2);
	bob.turn(45);
	bob.move(heigh);
	bob.setPenColor(Color.GREEN);
	bob.turn(270);
	bob.move(25);
	bob.turn(270);
}
}
}
