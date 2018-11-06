package kr.ac.halla.ice.h02404.swing_examples.lecture4;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class P10List extends JFrame {

	private JTextField tf = new JTextField(20);
	private Vector<String> v = new Vector<String>();
	private JList<String> tl = new JList<String>();

	// Textbook example
	public P10List() {
		setTitle("텍스트영역 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(new JLabel("입력 후 <Enter> 키를 입력하세요"));
		c.add(tf);
		c.add(tl);
		// c.add(new JScrollPane(tl));

		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField) e.getSource();
				v.add(t.getText());
				tl.setListData(v);
				t.setText("");
			}
		});
		setSize(270, 300);
		setVisible(true);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		P10List frame = new P10List();
	}
}
