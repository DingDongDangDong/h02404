package kr.ac.halla.ice.h02404.swing_examples.lecture4;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class P12ComboBoxExample extends JFrame {

	private JTextField tf = new JTextField(20);
	// private Vector<String> v = new Vector<String>();
	// Change JList to JComboBox
	private JComboBox<String> tl = new JComboBox<String>();
	private JLabel tlabel = new JLabel();

	// Textbook example
	public P12ComboBoxExample() {
		setTitle("Combo Box Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(new JLabel("입력 후 <Enter> 키를 입력하세요"));
		c.add(tf);
		c.add(tl);
		c.add(tlabel);
		// c.add(new JScrollPane(tl));

		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField) e.getSource();
				// v.add(t.getText());
				// tl.setListData(v);
				tl.addItem(t.getText());
				t.setText("");
			}
		});

		tl.addActionListener(new ActionListener() {

			@SuppressWarnings("unchecked")
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> comboBox = (JComboBox<String>) e.getSource();
				String selctedItem = comboBox.getSelectedItem().toString();
				tlabel.setText(selctedItem);
			}
		});

		setSize(270, 300);
		setVisible(true);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		P12ComboBoxExample frame = new P12ComboBoxExample();
	}
}
