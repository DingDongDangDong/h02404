package kr.ac.halla.ice.h02404.swing_examples.lecture2;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FlowLayoutExampleWithAlignmentAndGap extends JFrame {

	// TODO: Feel FlowLayout after Alignment and Gap
	
	public FlowLayoutExampleWithAlignmentAndGap() {
		setTitle("300 x 150 Frame with three buttons");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));

		setSize(300, 150);
		setVisible(true);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		FlowLayoutExampleWithAlignmentAndGap frame = new FlowLayoutExampleWithAlignmentAndGap();
	}
}
