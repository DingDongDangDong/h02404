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
public class P5JCheckBoxExampleWithCustomItemListener extends JFrame {

	private JTextField text = null;

	public P5JCheckBoxExampleWithCustomItemListener() {
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

		apple.addItemListener(new CustomItemListener(text));
		banana.addItemListener(new CustomItemListener(text));

		setSize(300, 150);
		setVisible(true);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		P5JCheckBoxExampleWithCustomItemListener frame = new P5JCheckBoxExampleWithCustomItemListener();
	}
}

class CustomItemListener implements ItemListener {

	JTextField text = null;

	public CustomItemListener(JTextField text) {
		this.text = text;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.DESELECTED) {
			text.setText("");
		} else {
			String selectedItem = ((JCheckBox) e.getItem()).getText();
			text.setText(selectedItem);
		}
	}
}
