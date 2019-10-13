package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTv implements ActionListener {
	JFrame frame = new JFrame();
	JButton sound1 = new JButton();
	JButton sound2 = new JButton();
	JButton sound3 = new JButton();
	JPanel panel = new JPanel();
	public void videos() {
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	panel.add(sound1);
	panel.add(sound2);
	panel.add(sound3);
	frame.add(panel);
	sound1.addActionListener(this);
	sound2.addActionListener(this);
	sound3.addActionListener(this);
	sound1.setText("Duck");
	sound2.setText("Frog");
	sound3.setText("Unicorn");
	frame.setTitle("CutenessTv");
	frame.pack();
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton check = (JButton) e.getSource();
		if(check==sound1) {
		showDucks();	
		}
		if(check==sound2) {
			showFrog();	
		}
		if(check==sound3) {
			showFluffyUnicorns();	
		}
		
	}
void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
    try {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
}
}
