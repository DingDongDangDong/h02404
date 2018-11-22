package kr.ac.halla.ice.h02404.swing_examples.lecture7;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class P1Thread extends JFrame {

	public P1Thread() {
		setTitle("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		JLabel label = new JLabel("Before Start");
		contentPane.add(label);

		Thread t = new Thread(new LabelRunnable(label));
		t.start();

		setSize(400, 400);
		setVisible(true);

	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		P1Thread frame = new P1Thread();
	}
}

class LabelRunnable implements Runnable {

	private JLabel label;
	private int count = 0;

	public LabelRunnable(JLabel label) {
		this.label = label;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(10);
				label.setText(String.valueOf(++count));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}