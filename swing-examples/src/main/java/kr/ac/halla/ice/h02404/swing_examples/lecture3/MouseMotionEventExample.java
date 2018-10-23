package kr.ac.halla.ice.h02404.swing_examples.lecture3;

import java.awt.Color;
import java.awt.Container;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MouseMotionEventExample extends JFrame {

	public MouseMotionEventExample() {
		setTitle("300 x 150 Frame with three buttons");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(null);

		JButton ok = new JButton("OK");
		ok.setLocation(250, 250);
		ok.setSize(200, 20);
		
		contentPane.add(ok);
		
		contentPane.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				int x = e.getX();
				int y= e.getY();
				ok.setLocation(new Point(x, y));				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

		setSize(500, 500);
		setVisible(true);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MouseMotionEventExample frame = new MouseMotionEventExample();
	}
}
