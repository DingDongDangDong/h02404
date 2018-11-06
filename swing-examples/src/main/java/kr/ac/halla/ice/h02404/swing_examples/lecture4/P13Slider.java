package kr.ac.halla.ice.h02404.swing_examples.lecture4;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class P13Slider extends JFrame {

	private JTextField tf = new JTextField(20);
	private JSlider tslider = null;

	// Textbook example
	public P13Slider() {
		setTitle("JSlider Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		tslider = new JSlider(JSlider.HORIZONTAL, 0, 200, 175);
		c.add(tslider);
		c.add(tf);

		tslider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				tf.setText(String.valueOf(tslider.getValue()));
			}
		});

		setSize(270, 300);
		setVisible(true);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		P13Slider frame = new P13Slider();
	}
}
