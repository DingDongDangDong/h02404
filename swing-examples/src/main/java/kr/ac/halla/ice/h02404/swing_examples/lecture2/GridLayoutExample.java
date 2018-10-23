package kr.ac.halla.ice.h02404.swing_examples.lecture2;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GridLayoutExample extends JFrame {

	// TODO: Feel GridLayout with Calculator example

	public GridLayoutExample() {
		setTitle("300 x 200 Grid Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.BLACK);
		contentPane.setLayout(new GridLayout(4,3));

		contentPane.add(new JButton("1"));
		contentPane.add(new JButton("2"));
		contentPane.add(new JButton("3"));
		contentPane.add(new JButton("4"));
		contentPane.add(new JButton("5"));
		contentPane.add(new JButton("6"));
		contentPane.add(new JButton("7"));
		contentPane.add(new JButton("8"));
		contentPane.add(new JButton("9"));
		contentPane.add(new JButton("+"));
		contentPane.add(new JButton("0"));
		contentPane.add(new JButton("-"));

		setSize(300, 200);
		setVisible(true);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		GridLayoutExample frame = new GridLayoutExample();
	}
}
