package kr.ac.halla.ice.h02404.swing_examples.lecture4;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Q1 extends JFrame {

	public Q1() {
		setTitle("Example");
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());

		JButton button = new JButton("ADD FRAME");
		contentPane.add(button);
		button.addActionListener(new ActionListener() {

			@SuppressWarnings("unused")
			@Override
			public void actionPerformed(ActionEvent e) {
				Q1 newFrame = new Q1();
			}
		});

		setSize(300, 150);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});

	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Q1 frame = new Q1();
	}
}
