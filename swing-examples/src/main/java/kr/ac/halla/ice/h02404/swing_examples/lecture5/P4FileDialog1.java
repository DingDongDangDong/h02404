package kr.ac.halla.ice.h02404.swing_examples.lecture5;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class P4FileDialog1 extends JFrame {

	JFrame frame = this;
	JTextArea rcode = null;
	JButton sbutton = null;

	public P4FileDialog1() {
		setTitle("Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());

		JLabel text = new JLabel("The text will be shown");
		contentPane.add(text);
		JButton submit = new JButton("Open File Open Dialog");
		contentPane.add(submit);
		JTextArea area = new JTextArea(20, 20);
		contentPane.add(area);

		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				int result = chooser.showOpenDialog(frame);

				// Return if no file choosen
				if (result != JFileChooser.APPROVE_OPTION)
					return;

				String filePath = chooser.getSelectedFile().getPath();
				try {
					BufferedReader reader = new BufferedReader(new FileReader(filePath));
					while (true) {
						String line = reader.readLine();
						if (line == null)
							break;
						area.setText(area.getText() + line);
					}
					reader.close();

				} catch (IOException e1) {
					e1.printStackTrace();
				}

			}
		});

		setSize(300, 450);
		setVisible(true);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		P4FileDialog1 frame = new P4FileDialog1();
	}
}