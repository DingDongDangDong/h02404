package kr.ac.halla.ice.h02404.swing_examples.lecture1;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// 1. Create Class extends JFrame
@SuppressWarnings("serial")
public class FrameWithThreeButtonWithCorrectExit extends JFrame{

	// 2. Describe how it looks like in its constructor
	public FrameWithThreeButtonWithCorrectExit() {
		setTitle("300 x 150 Frame with three buttons");
		// 7. make it exit correctly
		// EXIT IF CLOSE BUTTON is clicked
		// Run and check debug
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// 4. Get content pane and set its background and layout
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		
		// 5. Create three buttons
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300, 150);
		setVisible(true);
	}
	
	// 3. Create the frame in the main method
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		FrameWithThreeButtonWithCorrectExit frame = new FrameWithThreeButtonWithCorrectExit();
	}

	// 6. see debug and see all the programs are alive
}
