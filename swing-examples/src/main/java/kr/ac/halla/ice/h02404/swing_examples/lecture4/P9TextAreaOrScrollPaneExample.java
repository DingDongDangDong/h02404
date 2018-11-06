package kr.ac.halla.ice.h02404.swing_examples.lecture4;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class P9TextAreaOrScrollPaneExample extends JFrame {

	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(7, 20);

	// Textbook example
	public P9TextAreaOrScrollPaneExample() {
		setTitle("텍스트영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(new JLabel("입력 후 <Enter> 키를 입력하세요"));
		c.add(tf);
		c.add(ta);
		// c.add(new JScrollPane(ta));

		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField) e.getSource();
				ta.append(t.getText() + "\n");
				t.setText("");
			}
		});
		setSize(300, 300);
		setVisible(true);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		P9TextAreaOrScrollPaneExample frame = new P9TextAreaOrScrollPaneExample();
	}
}
