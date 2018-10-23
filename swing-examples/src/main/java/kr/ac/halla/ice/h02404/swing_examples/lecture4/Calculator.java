package kr.ac.halla.ice.h02404.swing_examples.lecture4;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculator extends JFrame {

	// TODO: Feel GridLayout with Calculator example

	public Calculator() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.BLACK);
		
		GridLayout gridLayout = new GridLayout();
		gridLayout.setColumns(3);
			contentPane.setLayout(gridLayout);
		
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
		
		
		setSize(500, 500);
		setVisible(true);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Calculator frame = new Calculator();
	}
}
