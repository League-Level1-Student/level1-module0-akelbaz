package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class soundEffects implements ActionListener {
	JFrame frame = new JFrame();
	JButton sound1 = new JButton();
	JButton sound2 = new JButton();
	JButton sound3 = new JButton();
	JPanel panel = new JPanel();
	public void soundEffect() {
frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
frame.setVisible(true);
panel.add(sound1);
panel.add(sound2);
panel.add(sound3);
frame.add(panel);
sound1.addActionListener(this);
sound2.addActionListener(this);
sound3.addActionListener(this);
sound1.setText("Water");
sound2.setText("Rock");
sound3.setText("Fire");
frame.setTitle("ASMR");
frame.pack();

}
private void playSound(String fileName) {

    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 

    sound.play();

}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
JButton check = (JButton) e.getSource();
if(check==sound1) {
playSound("water.wav");	
}
if(check==sound2) {
playSound("rock.wav");	
}
if(check==sound3) {
playSound("fire.wav");	
}
}
}
