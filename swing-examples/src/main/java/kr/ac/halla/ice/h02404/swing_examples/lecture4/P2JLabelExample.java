package kr.ac.halla.ice.h02404.swing_examples.lecture4;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class P2JLabelExample extends JFrame {

	public P2JLabelExample() {
		setTitle("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());

		// JLabel prints out String or Image
		contentPane.add(new JLabel("Hello Java Swing World"));

		setSize(300, 150);
		setVisible(true);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		P2JLabelExample frame = new P2JLabelExample();
	}
}
