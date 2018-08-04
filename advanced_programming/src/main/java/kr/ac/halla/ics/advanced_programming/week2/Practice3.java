package kr.ac.halla.ics.advanced_programming.week2;

import java.util.Scanner;

/**
 * Keyboard Input and Screen Output
 * 
 * @author jack
 *
 */
public class Practice3 {

	public static void main(String[] args) {
		System.out.print("What is your name: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println(name);

		System.out.print("What is the number of course in Integer: ");
		int courseNumber = scanner.nextInt();
		System.out.println(courseNumber);
		scanner.close();
	}

}
