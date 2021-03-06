package kr.ac.halla.ice.h02404.swing_examples.lecture4;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class P6JRadioBoxWithoutButtonGroupExample extends JFrame {

	public P6JRadioBoxWithoutButtonGroupExample() {
		setTitle("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());

		// JCheckBox allows to select boxes
		JRadioButton apple = new JRadioButton("APPLE");
		JRadioButton banana = new JRadioButton("BANANA");
		
		contentPane.add(apple);
		contentPane.add(banana);

		apple.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// ItemEvent.SELECTED or ItemEvent.DESELECTED
				System.out.println(e.getStateChange());
				System.out.println(((JRadioButton)e.getItem()).getText());
			}
		});
		

		setSize(300, 150);
		setVisible(true);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		P6JRadioBoxWithoutButtonGroupExample frame = new P6JRadioBoxWithoutButtonGroupExample();
	}
}
