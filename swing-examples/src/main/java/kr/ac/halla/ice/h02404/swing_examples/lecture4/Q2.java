package kr.ac.halla.ice.h02404.swing_examples.lecture4;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Q2 extends JFrame {

	public Q2() {
		setTitle("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());

		JButton b1 = new JButton("B1");
		JButton b2 = new JButton("B2");
		contentPane.add(b1);
		contentPane.add(b2);
		
		// You can give focus to the component
		contentPane.setFocusable(true);
		contentPane.requestFocus();
		
		setSize(300, 150);
		setVisible(true);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Q2 frame = new Q2();
	}
}
