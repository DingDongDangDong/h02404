package kr.ac.halla.ice.h02404.swing_examples.lecture2;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class GridLayoutExample2 extends JFrame {

	// TODO: Feel GridLayout with Calculator example

	public GridLayoutExample2() {
		setTitle("300 x 200 Grid Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.CYAN);
		contentPane.setLayout(new GridLayout(4,2));

		contentPane.add(new JLabel("이름"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("학번"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("학과"));
		contentPane.add(new JTextField(""));
		contentPane.add(new JLabel("과목"));
		contentPane.add(new JTextField(""));
		

		setSize(300, 200);
		setVisible(true);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		GridLayoutExample2 frame = new GridLayoutExample2();
	}
}
