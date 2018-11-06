package kr.ac.halla.ice.h02404.swing_examples.lecture4;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class P8TextFieldExample extends JFrame {

	// Textbook example
	public P8TextFieldExample() {
		setTitle("텍스트필드 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("이름 "));
		c.add(new JTextField(20));
		c.add(new JLabel("학과 "));
		c.add(new JTextField("정보통신소프트웨어학과 ", 20));
		c.add(new JLabel("주소 "));
		c.add(new JTextField("원주시 ...", 20));

		// Practice setEditable(false)
		
		
		setSize(270,150);
		setVisible(true);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		P8TextFieldExample frame = new P8TextFieldExample();
	}
}
