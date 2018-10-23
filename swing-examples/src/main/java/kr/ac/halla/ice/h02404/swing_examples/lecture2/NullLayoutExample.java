package kr.ac.halla.ice.h02404.swing_examples.lecture2;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class NullLayoutExample extends JFrame {

	// TODO: Feel Null Layout

	public NullLayoutExample() {
		setTitle("300 x 200 Frame without Layout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.WHITE);
		contentPane.setLayout(null);

		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50);
		la.setSize(200, 20);
		// Add it to content pane
		contentPane.add(la);

		for (int i = 1; i <= 9; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i * 15, i * 15);
			b.setSize(50, 20);
			contentPane.add(b); // Add it to content pane
		}
		
		setSize(300, 200);
		setVisible(true);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		NullLayoutExample frame = new NullLayoutExample();
	}
}
