package kr.ac.halla.ice.h02404.swing_examples.lecture4;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;

@SuppressWarnings("serial")
public class P14Menu extends JFrame {

	// Textbook example
	public P14Menu() throws MalformedURLException {
		setTitle("Swing Component");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		// SET Menu Bar
		JMenuBar menubar = new JMenuBar();
		JMenu file = new JMenu("File");
		file.add(new JMenuItem("new"));
		file.add(new JMenuItem("open"));
		file.add(new JMenuItem("import"));
		file.addSeparator();
		file.add(new JMenuItem("exit"));
		menubar.add(file);
		JMenu edit = new JMenu("Edit");
		menubar.add(edit);
		JMenu source = new JMenu("Source");
		menubar.add(source);
		JMenu project = new JMenu("Project");
		menubar.add(project);
		JMenu run = new JMenu("Run");
		menubar.add(run);
		setJMenuBar(menubar);

		// SET Tool Bar
		JToolBar toolbar = new JToolBar(JToolBar.HORIZONTAL);
		JButton newButton = new JButton("New");
		toolbar.add(newButton);
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("NEW File Icon");
		toolbar.add(comboBox);
		JButton fileButton = new JButton("File Button");
		toolbar.add(fileButton);
		JLabel searchLabel = new JLabel("JLabel");
		toolbar.add(searchLabel);
		JTextField textField = new JTextField(20);
		toolbar.add(textField);
		c.add(toolbar);

		// Set JSplitPane
		JList<String> list = new JList<>(new String[] { "a", "b", "c" });

		JLabel icon = new JLabel(
				new ImageIcon(new ImageIcon(new URL("http://www.autoidlabs.org.uk/images/Auto-IDLabsLogo.png"))
						.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)));
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, list, icon);
		splitPane.setDividerLocation(20);
		c.add(splitPane);

		setSize(500, 500);
		setVisible(true);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) throws MalformedURLException {
		P14Menu frame = new P14Menu();
	}
}
