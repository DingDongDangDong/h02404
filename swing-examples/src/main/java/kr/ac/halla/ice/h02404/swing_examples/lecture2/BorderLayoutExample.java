package kr.ac.halla.ice.h02404.swing_examples.lecture2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class BorderLayoutExample extends JFrame {

	// TODO: Feel BorderLayout by inserting 5 buttons

	public BorderLayoutExample() {
		setTitle("300 x 150 Frame with three buttons");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.BLACK);
		contentPane.setLayout(new BorderLayout());

		contentPane.add(new JButton("West"), BorderLayout.WEST);
		contentPane.add(new JButton("North"), BorderLayout.NORTH);
		contentPane.add(new JButton("East"), BorderLayout.EAST);
		contentPane.add(new JButton("South"), BorderLayout.SOUTH);
		contentPane.add(new JButton("Center"), BorderLayout.CENTER);

		setSize(300, 150);
		setVisible(true);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		BorderLayoutExample frame = new BorderLayoutExample();
	}
}
