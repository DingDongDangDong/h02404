package kr.ac.halla.ice.h02404.swing_examples.lecture6;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class P1Base extends JFrame {

	public P1Base() {
		setTitle("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());

		setContentPane(new MyPanel());

		setSize(500, 300);
		setVisible(true);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		P1Base frame = new P1Base();
	}
}

@SuppressWarnings("serial")
class MyPanel extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.BLACK);
		g.drawString("Hello World", 30, 30);
		g.setColor(Color.RED);
		g.drawLine(20, 40, 50, 80);
		g.setColor(Color.BLUE);
		g.drawOval(10, 20, 30, 40);
		g.drawRect(50, 60, 20, 30);
		g.drawRoundRect(60, 70, 20, 30, 3, 5);
		g.fillRect(100, 110, 40, 30);
	}
}