package kr.ac.halla.ice.h02404.swing_examples.lecture7;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class P2PacMan extends JFrame {

	public P2PacMan() {
		setTitle("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(400, 400);
		setVisible(true);
		
		
		setContentPane(new MyPanel());

	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		P2PacMan frame = new P2PacMan();
	}
}

@SuppressWarnings("serial")
class MyPanel extends JPanel {

	public static int pacManX = 0;
	public static int pacManY = 0;
	public static int orientation = 1; // 1. right, 2. left, 3. south, 4. north
	// 39 37 40 38
	public MyPanel() {
		Thread thread = new Thread(new MyThread(this));
		thread.start();
		
		setFocusable(true);
		
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyCode());
				if( e.getKeyCode() == 39)
					orientation = 1;
				else if( e.getKeyCode() == 37)
					orientation = 2;
				else if( e.getKeyCode() == 40)
					orientation = 3;
				else if( e.getKeyCode() == 38)
					orientation = 4;
			}
		});
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(pacManX, pacManY, 20, 20);
	}
}

class MyThread implements Runnable {

	private Component comp;

	public MyThread(Component comp) {
		this.comp = comp;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(500);
				if (MyPanel.orientation == 1) {
					if (MyPanel.pacManX < 380)
						MyPanel.pacManX = MyPanel.pacManX + 20;
				}
				if (MyPanel.orientation == 2) {
					if (MyPanel.pacManX > 20)
						MyPanel.pacManX = MyPanel.pacManX - 20;
				}
				if (MyPanel.orientation == 3) {
					if (MyPanel.pacManY < 380)
						MyPanel.pacManY = MyPanel.pacManY + 20;
				}
				if (MyPanel.orientation == 4) {
					if (MyPanel.pacManY > 20)
						MyPanel.pacManY = MyPanel.pacManY - 20;
				}
				comp.repaint();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
