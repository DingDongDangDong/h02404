package kr.ac.halla.ice.h02404.swing_examples.lecture3;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ActionEventExample extends JFrame {
	
	public ActionEventExample() {
		setTitle("300 x 150 Frame with three buttons");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());

		JButton ok = new JButton("OK");
		contentPane.add(ok);
		// add action listener to the OK button
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Action Command: " + e.getActionCommand());
				System.out.println("ID: " + e.getID());
				System.out.println("When: " + e.getWhen());
			}
		});

		setSize(300, 150);
		setVisible(true);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ActionEventExample frame = new ActionEventExample();
	}
}
