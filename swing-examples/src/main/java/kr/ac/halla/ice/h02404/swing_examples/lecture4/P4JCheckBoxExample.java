package kr.ac.halla.ice.h02404.swing_examples.lecture4;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class P4JCheckBoxExample extends JFrame {

	private JTextField text = null;

	public P4JCheckBoxExample() {
		setTitle("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());

		// JCheckBox allows to select boxes
		JCheckBox apple = new JCheckBox("APPLE");
		JCheckBox banana = new JCheckBox("BANANA");

		text = new JTextField("", 30);
		contentPane.add(text);
		contentPane.add(apple);
		contentPane.add(banana);

		apple.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					text.setText("");
				} else {
					String selectedItem = ((JCheckBox) e.getItem()).getText();
					text.setText(selectedItem);
				}

			}
		});

		banana.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.DESELECTED) {
					text.setText("");
				} else {
					String selectedItem = ((JCheckBox) e.getItem()).getText();
					text.setText(selectedItem);
				}
			}
		});

		setSize(300, 150);
		setVisible(true);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		P4JCheckBoxExample frame = new P4JCheckBoxExample();
	}
}
