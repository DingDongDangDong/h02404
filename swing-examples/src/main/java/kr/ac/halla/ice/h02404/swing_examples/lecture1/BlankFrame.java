package kr.ac.halla.ice.h02404.swing_examples.lecture1;

// Check setTitle is usable before importing JFrame
import javax.swing.JFrame;

// 1. Create Class extends JFrame
@SuppressWarnings("serial")
public class BlankFrame extends JFrame {

	// 2. Describe how it looks like in its constructor
	public BlankFrame() {
		setTitle("300 x 300 Blank Frame");
		setSize(300, 300);
		setVisible(true);
	}

	// 3. Create the frame in the main method
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		BlankFrame frame = new BlankFrame();
	}

}
