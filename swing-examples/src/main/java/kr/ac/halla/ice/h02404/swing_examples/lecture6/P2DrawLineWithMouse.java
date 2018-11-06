package kr.ac.halla.ice.h02404.swing_examples.lecture6;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class P2DrawLineWithMouse extends JFrame {

	public P2DrawLineWithMouse() {
		setTitle("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());

		setContentPane(new MyPanel2());

		setSize(500, 300);
		setVisible(true);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		P2DrawLineWithMouse frame = new P2DrawLineWithMouse();
	}
}

@SuppressWarnings("serial")
class MyPanel2 extends JPanel {

	private ArrayList<Point> startPoints;
	private ArrayList<Point> endPoints;

	public MyPanel2() {
		startPoints = new ArrayList<Point>();
		endPoints = new ArrayList<Point>();

		addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				endPoints.add(new Point(e.getX(), e.getY()));
				// invoke paintComponent;
				repaint();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				startPoints.add(new Point(e.getX(), e.getY()));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < startPoints.size(); i++) {
			g.drawLine(startPoints.get(i).x, startPoints.get(i).y, endPoints.get(i).x, endPoints.get(i).y);
		}
	}
}