package kr.ac.halla.ice.h02404.swing_examples.lecture3;

import java.awt.Color;
import java.awt.Container;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MouseEventExample extends JFrame {

	public MouseEventExample() {
		setTitle("300 x 150 Frame with three buttons");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(null);

		JButton ok = new JButton("OK");
		ok.setLocation(250, 250);
		ok.setSize(200, 20);
		
		contentPane.add(ok);
		
		contentPane.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y= e.getY();
				ok.setLocation(new Point(x, y));
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

		setSize(500, 500);
		setVisible(true);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MouseEventExample frame = new MouseEventExample();
	}
}
