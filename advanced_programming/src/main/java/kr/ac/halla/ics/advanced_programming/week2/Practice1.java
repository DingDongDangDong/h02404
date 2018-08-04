package kr.ac.halla.ics.advanced_programming.week2;

/**
 * Essential Data Types
 * 
 * Variables
 * 
 * Assignment
 * 
 * @author jack
 *
 */
public class Practice1 {

	public static void main(String[] args) {
		// Set breakpoint at Line 19
		// Debug and see how each variable changes

		boolean isHallaStudent = true;
		int courseNumber = 223;
		long currentTime = System.currentTimeMillis();
		float gradeAShare = 0.3f;
		String courseName = "Advanced Programming (2)";

		System.out.println("Are you Halla University Student? " + isHallaStudent);
		System.out.println("What is the number of course: n" + courseNumber);
		System.out.println("Unix Epoch Time (ms.): " + currentTime);
		System.out.println("What is the maximum share of grade A: " + gradeAShare);
		System.out.println("What is the name of course: " + courseName);

		currentTime = System.currentTimeMillis();

		System.out.println("Unix Epoch Time: " + currentTime);

		System.out.print("Essential\tspecial\tcharacters\n");
	}

}
