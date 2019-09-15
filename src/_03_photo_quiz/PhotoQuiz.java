package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)

		// 2. create a variable of type "" that will hold your image
Component image; 
		// 3. use the "createImage()" method below to initialize your Component
image = createImage("https://previews.123rf.com/images/sudowoodo/sudowoodo1605/sudowoodo160500058/57605688-mexican-food-with-cute-smiling-faces-taco-burrito-and-nachos-with-salsa-in-flat-cartoon-geometric-st.jpg");
		// 4. add the image to the quiz window
quizWindow.add(image);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String blob = JOptionPane.showInputDialog("How many foods are displayed in the image?");
		// 7. print "CORRECT" if the user gave the right answer
int glob = Integer.parseInt(blob);
if(glob==3) {
System.out.println("CORRECT");
}else {
	System.out.println("INCORRECT");
	}

	
		// 8. print "INCORRECT" if the answer is wrong
quizWindow.remove(image);
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12
		// 10. find another image and create it (might take more than one line
		// of code)
Component image2; 
// 3. use the "createImage()" method below to initialize your Component
image2 = createImage("https://vignette.wikia.nocookie.net/minecraft/images/4/48/150px-Creeper.png/revision/latest?cb=20140101094930");
// 4. add the image to the quiz window
quizWindow.add(image2);
quizWindow.pack();
		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question
String creepa = JOptionPane.showInputDialog("WHAT IS THIS????");
		// 14+ check answer, say if correct or incorrect, etc.
if(creepa.equalsIgnoreCase("creeper")||creepa.equalsIgnoreCase("creepa")) {
System.out.println("CORRECT");
}else {
	System.out.println("INCORRECT");
	}	
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
