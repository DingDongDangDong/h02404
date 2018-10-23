package kr.ac.halla.ice.h02404.swing_examples.lecture1;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// 1. Create Class extends JFrame
@SuppressWarnings("serial")
public class FrameWithThreeButton extends JFrame{

	// 2. Describe how it looks like in its constructor
	public FrameWithThreeButton() {
		setTitle("300 x 150 Frame with three buttons");
	
		// 4. Get content pane and set its background and layout
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		
		// 5. Create three buttons
		JButton b1 = new JButton("OK");
		JButton b2 = new JButton("Cancel");
		JButton b3 = new JButton("Ignore");
		contentPane.add(b1);
		contentPane.add(b2);
		contentPane.add(b3);
		
		setSize(300, 150);
		setVisible(true);
	}
	
	// 3. Create the frame in the main method
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		FrameWithThreeButton frame = new FrameWithThreeButton();
	}

	// 6. see debug and see all the programs are alive
}
