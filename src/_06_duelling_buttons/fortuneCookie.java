package _06_duelling_buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortuneCookie implements ActionListener {
    public void showButton() {
       JFrame frame = new JFrame();
       frame.setVisible(true);
    	System.out.println("Button clicked");
    	 JButton button = new JButton();
    	    frame.add(button);
    	    frame.pack();
    	    button.addActionListener(this);
    	    button.setText("GET A FORTUNE!!!");
    	    frame.setSize(150,150);
    	    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    	    
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		   Random rand = new Random();
		
			int randoom = rand.nextInt(5);
			if(randoom==0) {
			JOptionPane.showMessageDialog(null, "TODAY YOU WILL ALMOST DIE");	
			}
			if(randoom==1) {
				JOptionPane.showMessageDialog(null, "TODAY YOU WILL WIN SOMETHING");	
				}
			if(randoom==2) {
				JOptionPane.showMessageDialog(null, "TODAY YOU WILL SAVE A LIFE");	
				}
			if(randoom==3) {
				JOptionPane.showMessageDialog(null, "TODAY YOU WILL GET A USELESS FORTUNE");	
				}
			if(randoom==4) {
				JOptionPane.showMessageDialog(null, "TODAY YOU WILL EAT MORE CHIKIN");	
				}
	}
}
