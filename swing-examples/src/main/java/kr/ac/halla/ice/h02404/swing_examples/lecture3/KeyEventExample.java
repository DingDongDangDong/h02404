package kr.ac.halla.ice.h02404.swing_examples.lecture3;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class KeyEventExample extends JFrame {
	
	public KeyEventExample() {
		setTitle("300 x 150 Frame with three buttons");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());

		JButton ok = new JButton("OK");
		contentPane.add(ok);
		// add key listener to the OK button
		ok.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("Typed");
				System.out.println("ID: " + e.getID());
				System.out.println("Key Code: " + e.getKeyCode());
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("Released");
				System.out.println("ID: " + e.getID());
				System.out.println("Key Code: " + e.getKeyCode());
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("Pressed");
				System.out.println("ID: " + e.getID());
				System.out.println("Key Code: " + e.getKeyCode());
			}
		});

		setSize(300, 150);
		setVisible(true);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		KeyEventExample frame = new KeyEventExample();
	}
}
