package kr.ac.halla.ice.h02404.swing_examples.lecture3;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FocusEventExample extends JFrame {

	public FocusEventExample() {
		setTitle("300 x 150 Frame with three buttons");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());

		JButton ok = new JButton("OK");
		contentPane.add(ok);
		JButton close = new JButton("CLOSE");
		contentPane.add(close);
		ok.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				System.out.println(e.getID());
			}

			@Override
			public void focusGained(FocusEvent e) {
				System.out.println(e.getID());
			}
		});

		setSize(300, 150);
		setVisible(true);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		FocusEventExample frame = new FocusEventExample();
	}
}
